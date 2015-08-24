package com.avicit.onlinemusic.controller;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.avicit.framework.util.ResponseUtils;
import com.avicit.onlinemusic.entity.Message;
import com.avicit.onlinemusic.entity.Music;
import com.avicit.onlinemusic.entity.User;
import com.avicit.onlinemusic.service.CommentsService;
import com.avicit.onlinemusic.service.LinkService;
import com.avicit.onlinemusic.service.MessageService;
import com.avicit.onlinemusic.service.MusicService;
import com.avicit.onlinemusic.service.TipService;
import com.avicit.onlinemusic.service.UserService;
import com.avicit.onlinemusic.util.Function;
import com.avicit.onlinemusic.vo.LinkVo;
import com.avicit.onlinemusic.vo.MessageVo;
import com.avicit.onlinemusic.vo.TipVo;
import com.avicit.onlinemusic.vo.UserVo;


/**
 * <br> 消息页面
 * 0.发起请求 index.do
 * 1.从session中获取当前用户登录信息
 * 2.如果登录用户为空，则不获取用户相关信息，否者获取用户相关信息
 * 3.获取用户消息
 * 4.获取系统分享消息(最新10条)
 * 5.获取音乐消息
 * 6.获取友情连接(最新20条)
 * @author machao
 *
 */
@Controller
@RequestMapping
public class MessageController {

	@Autowired
	private MusicService musicService;
	@Autowired
	private CommentsService commentsService;
	@Autowired
	private LinkService linkService;
	@Autowired
	private TipService tipService;
	@Autowired
	private UserService userService;
	@Autowired
	private MessageService messageService;


	/**
	 * 消息页面
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value="message")
	public String messagePage(Model model,HttpSession session,HttpServletRequest request,RedirectAttributes attr){

		/*从session中或者用户名*/
		/*1.先从session中取用户对象*/
		User PlutoUser=(User)session.getAttribute("PlutoUser");	
		List<MessageVo> mesList= null;
		if(PlutoUser !=null){
			// 获取用户相关联消息
			int id = PlutoUser.getId();
			mesList = messageService.list(id);
		}
		// 获取系统消息
		List<TipVo> tiplist =tipService.list();
		// 获取链接
		List<LinkVo> linklist=linkService.list();

		// 将数据放入 跳转页面
		model.addAttribute("mesList", mesList);
		model.addAttribute("tiplist", tiplist);
		model.addAttribute("linklist", linklist);


		return "message";
	}

	/**
	 * 消息详情
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value="showmessage")
	public String showMessage(Model model,HttpServletRequest request){

		String messageId = request.getParameter("id");
		System.out.println(messageId);
		// 根据ID查询
		Message message=messageService.findById(Integer.parseInt(messageId));

		model.addAttribute("message", message);
		return "showmessage";
	}



	/**
	 * 点歌消息录入
	 * @param session
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(value="ktvMusicMessage",method = RequestMethod.POST)
	public @ResponseBody Object ktvMusicMessage(HttpServletRequest request,HttpSession session) throws UnsupportedEncodingException{
		//这两个字段来拿测试用
		String jsonUser1 = request.getParameter("name");
		String jsonUser2 = request.getParameter("location");

		String messagejson = request.getParameter("messagejson");
		JSONObject jb=new JSONObject();  
		//将json格式的字符串转换为json数组对象  
		//将json格式的字符串转换为json对象，并取得该对象的“userName”属性值  


		String toUser=(String)jb.fromObject(messagejson).get("toUser");
		String musicId= (String)jb.fromObject(messagejson).get("musicId");
		// 是否匿名 0-默认不匿名点歌 1-匿名点歌
		Integer hidename = (Integer)jb.fromObject(messagejson).get("hidename");
		String textarea = (String)jb.fromObject(messagejson).get("textarea");


		/*1.先从session中取用户对象*/
		User PlutoUser=(User)session.getAttribute("PlutoUser");	
		// 留言内容
		String value=null;
		String userNameForm =null;

		if (Function.isInvalid(toUser)) {
			return ResponseUtils.sendFailure("registerError", "你要发给谁呢？？");
		}
		if (Function.isInvalid(textarea)) {
			value = "这家伙很懒，什么都没有留下！";
		} else{
			value=textarea;
		}
		if (hidename==1) {
			userNameForm = "匿名";
		} else{
			userNameForm = PlutoUser.getName();
		}

		if(toUser.equals(PlutoUser.getName())){
			/*重新返回消息页面*/
			return ResponseUtils.sendFailure("registerError", "不能给自己点歌！");
		}
		List<UserVo> listuser=userService.list(toUser);
		if(listuser ==null || listuser.size()==0){
			return ResponseUtils.sendFailure("registerError", "对不起，你要点歌的用户不存在！");
		}
		// 根据ID查找对应音乐信息
		Music music=musicService.findById(Integer.parseInt(musicId));
		int rd_id = new Random().nextInt(9999);
		String music_title = music.getTitle();
		String music_url = music.getUrl();
		music_url = music_url.replace("upload\\", "upload\\\\");
		String title = "[" + userNameForm + "]为您点播了一首[" + music_title + "]";
		String message_value = "<p>他（她）给您的留言：" + value + "</p>";
		message_value += "<p>您可以点击下面的播放器进行试听！<br />";
		message_value += "<object type=\"application/x-shockwave-flash\"	data=\"player/audioplayer.swf\" width=\"290\" height=\"24\"	id=\"audioplayer"
				+ rd_id
				+ "\">	<param name=\"movie\" value=\"player/audioplayer.swf\" /><param name=\"FlashVars\" value=\"playerID="
				+ rd_id
				+ "&soundFile="
				+ music_url
				+ "\" />	<param name=\"quality\" value=\"high\" /><param name=\"menu\" value=\"false\" /><param name=\"wmode\" value=\"transparent\" /></object><br />";
		long time = new Date().getTime();

		// 插入数据库
		Message message=new Message();
		message.setUserFrom(userNameForm);
		message.setUserTo(listuser.get(0).getId());
		message.setTitle(title);
		message.setValue(message_value);
		message.setReadFlg(1);
		message.setTime(Long.toString(time));

		try {
			messageService.save(message);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseUtils.sendFailure("registerError", "消息发送失败，请重新发送");
		}		
		return ResponseUtils.sendSuccess("恭喜你，点歌成功！");
	}


	/**
	 * 发送详情
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value="sendmessage")
	public String sendmessage(@ModelAttribute("messageVo") MessageVo messageVo,HttpSession session,RedirectAttributes attr,Model model,HttpServletRequest request){

		try {
			/*内容验证*/
			if (Function.isInvalid(messageVo.getUserToName())) {

				/*重新返回消息页面*/
				attr.addFlashAttribute("error", "请填入收件人名称！");
				return "redirect:/message";
			}
			if (Function.isInvalid(messageVo.getValue())) {

				/*重新返回消息页面*/
				attr.addFlashAttribute("error", "请填入消息内容！");
				return "redirect:/message";
			}
			/*1.先从session中取用户对象*/
			User PlutoUser=(User)session.getAttribute("PlutoUser");	
			if(messageVo.getUserToName().equals(PlutoUser.getName())){

				/*重新返回消息页面*/
				attr.addFlashAttribute("error", "对不起，不能给自己发短信息！");
				return "redirect:/message";
			}

			List<UserVo> listuser=userService.list(messageVo.getUserToName());

			if(listuser ==null || listuser.size()==0){

				/*重新返回消息页面*/
				attr.addFlashAttribute("error", "对不起，发送用户不存在！");
				return "redirect:/message";

			}

			// 开始数据录入
			long time = new Date().getTime();
			Message message=new Message();
			message.setUserFrom(PlutoUser.getName());
			message.setUserTo(listuser.get(0).getId());
			message.setTitle(messageVo.getTitle());
			message.setValue(messageVo.getValue());
			message.setReadFlg(1);
			message.setTime(Long.toString(time));

			messageService.save(message);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*重新返回消息页面*/
		attr.addFlashAttribute("success", "消息发送成功");
		return "redirect:/message";
	}


	/**
	 * 删除消息
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value="delmessage")
	public String delmessage(Model model,HttpServletRequest request){
		try {
			String[] delIds =(String[])request.getParameterValues("list");
			Message message=null;
			for(int i=0;i<delIds.length;i++){
				message = new Message();
				message.setId(Integer.parseInt(delIds[i]));
				messageService.delete(message);
			} 

		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*重新返回消息页面*/
		return "redirect:/message";
	}
}
