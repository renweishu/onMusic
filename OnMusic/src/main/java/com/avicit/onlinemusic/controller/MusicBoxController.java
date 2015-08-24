package com.avicit.onlinemusic.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.avicit.framework.util.ResponseUtils;
import com.avicit.onlinemusic.entity.Music;
import com.avicit.onlinemusic.entity.User;
import com.avicit.onlinemusic.service.CommentsService;
import com.avicit.onlinemusic.service.LinkService;
import com.avicit.onlinemusic.service.MessageService;
import com.avicit.onlinemusic.service.MusicService;
import com.avicit.onlinemusic.service.TipService;
import com.avicit.onlinemusic.service.UserService;
import com.avicit.onlinemusic.util.CreatXML;
import com.avicit.onlinemusic.util.Function;
import com.avicit.onlinemusic.vo.LinkVo;
import com.avicit.onlinemusic.vo.MessageVo;
import com.avicit.onlinemusic.vo.MusicVo;
import com.avicit.onlinemusic.vo.TipVo;


/**
 * <br> 音乐盒
 * @author machao
 *
 */
@Controller
@RequestMapping
public class MusicBoxController {

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
	 * 音乐盒
	 * @param session
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(value="musicbox",method = RequestMethod.GET)
	public String  musicbox(Model model,HttpSession session,HttpServletRequest request,RedirectAttributes attr) throws UnsupportedEncodingException{

		/*从session中或者用户名*/
		/*1.先从session中取用户对象*/
		User PlutoUser=(User)session.getAttribute("PlutoUser");	
		List<MessageVo> mesList= null;
		List<MusicVo> musicBoxList = null;
		if(PlutoUser !=null){
			// 获取用户相关联消息
			int id = PlutoUser.getId();
			mesList = messageService.list(id);

			// 根据用户名查询用户信息
			User user=userService.singleUser(PlutoUser.getName());
			// 检测数据库中是否存在相同音乐
			String playList = user.getMusicBox();
			String[] playListArray=playList.split(",");
			musicBoxList=musicService.list(playListArray);

		}
		// 获取系统消息
		List<TipVo> tiplist =tipService.list();
		// 获取链接
		List<LinkVo> linklist=linkService.list();

		// 将数据放入 跳转页面
		model.addAttribute("mesList", mesList);
		model.addAttribute("tiplist", tiplist);
		model.addAttribute("linklist", linklist);

		// 用户音乐盒中音乐
		model.addAttribute("musicBoxList", musicBoxList);

		/*判断是否跳转音乐列表页面*/
		String trans=request.getParameter("listbox");
		if(trans !=null && trans.equals("play")){
			return "player/musiclist";
		}

		return "musicbox";

	}

	/**
	 * 添加音乐到音乐盒
	 * @param session
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(value="addtobox",method = RequestMethod.GET)
	public @ResponseBody Object addtoBox(HttpServletRequest request,HttpSession session) throws UnsupportedEncodingException{
		try {
			//这两个字段来拿测试用
			String music_id = request.getParameter("music_id");

			/*1.先从session中取用户对象*/
			User PlutoUser=(User)session.getAttribute("PlutoUser");	
			// 根据用户名查询用户信息
			User user=userService.singleUser(PlutoUser.getName());


			// 检测数据库中是否存在相同音乐
			String playList = user.getMusicBox();
			if (playList == null) {
				user.setMusicBox(music_id);

				userService.update(user);

			} else {
				String[] playListArr = playList.split(",");
				for (int i = 0; i < playListArr.length; i++) {
					if (music_id.equals(playListArr[i])) {
						return ResponseUtils.sendFailure("registerError", "目前音乐盒中已存在相同音乐.....");
					}
				}
				// 音乐盒中是否存在其他音乐
				if (Function.isInvalid(playList)) { // 音乐盒中没有任何歌曲
					user.setMusicBox(music_id);
					userService.update(user);
				} else {
					String musicBoxID = user.getMusicBox()+","+music_id;
					user.setMusicBox(musicBoxID);
					userService.update(user);

				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ResponseUtils.sendFailure("registerError", "添加音乐到盒子失败.....");
		}

		return ResponseUtils.sendSuccess("添加成功.......");
	}

	/**
	 * 删除音乐盒音乐或者创建播放列表
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value="setbox",method = RequestMethod.POST)
	public String delmessage(Model model,HttpServletRequest request,RedirectAttributes attr,HttpSession session){

		String[] musicBoxArr =(String[])request.getParameterValues("list");
		String option =(String)request.getParameter("select");
		/*1.先从session中取用户对象*/
		User PlutoUser=(User)session.getAttribute("PlutoUser");	
		// 根据用户名查询用户信息
		User user=userService.singleUser(PlutoUser.getName());
		String userId = Integer.toString(user.getId());
		// 检测数据库中是否存在相同音乐
		String playList = user.getMusicBox().trim();
		// 当前播放列表
		String [] list=playList.split(",");
		// 创建播放列表
		if(option.equals("play")){

			// 建立播放列表
			CreatXML xml = new CreatXML();
			try {
				List<Music> listmusic = new ArrayList<Music>();
				Music music =null;
				for (int i = 0; i < musicBoxArr.length; i++) {
					music = musicService.findById(Integer.parseInt(musicBoxArr[i].trim()));
					listmusic.add(music);
				}

				xml.bulidXML(listmusic, request, userId);
				/*创建成功 跳转页面*/
				/*播放列表创建成功的场合 跳转到音乐列表页面*/
				return "redirect:/musicbox?listbox="+"play";

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				/*重新返回音乐盒页面*/
				attr.addFlashAttribute("error", "创建播放列表失败..........");
				return "redirect:/musicbox";
			}

		}

		// 删除盒子音乐
		else if(option.equals("del")){

			// 寻找相同元素并从链表中删除
			for (int i = 0; i < musicBoxArr.length; i++) {
				for (int j = 0; j < list.length; j++) {
					if (musicBoxArr[i].equals(list[j])) {
						list[j]="del";
					}
				}
			}
			StringBuffer liveBoxid = new StringBuffer();
			for (int j = 0; j < list.length; j++){
				if(!list[j].equals("del")){
					liveBoxid.append(list[j]);
					liveBoxid.append(",");
				}
			}

			// 去掉最后的","
			String newMusic=null;
			if(liveBoxid.length()>0){
				newMusic= liveBoxid.substring(0, liveBoxid.length() - 1); 
			}

			try {
				user.setMusicBox(newMusic.trim());
				userService.update(user);

				/*重新返回音乐盒页面*/
				attr.addFlashAttribute("success", "删除音乐盒音乐成功..........");
				return "redirect:/musicbox";}
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				/*重新返回音乐盒页面*/
				attr.addFlashAttribute("error", "删除音乐盒音乐失败..........");
				return "redirect:/musicbox";}
		}

		/*播放列表创建成功的场合 跳转到音乐列表页面*/
		return "redirect:/musicbox?listbox="+"play";

	}
}
