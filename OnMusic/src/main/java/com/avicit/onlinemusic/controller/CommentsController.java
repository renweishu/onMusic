package com.avicit.onlinemusic.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.avicit.onlinemusic.entity.Comments;
import com.avicit.onlinemusic.entity.Music;
import com.avicit.onlinemusic.entity.User;
import com.avicit.onlinemusic.service.CommentsService;
import com.avicit.onlinemusic.service.LinkService;
import com.avicit.onlinemusic.service.MessageService;
import com.avicit.onlinemusic.service.MusicService;
import com.avicit.onlinemusic.service.TipService;
import com.avicit.onlinemusic.service.UserService;
import com.avicit.onlinemusic.vo.LinkVo;
import com.avicit.onlinemusic.vo.MessageVo;
import com.avicit.onlinemusic.vo.TipVo;


/**
 * <br> 评论页面
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
public class CommentsController {

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
	 * 首页
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value="comments",method = RequestMethod.GET)
	public String indexPage(Model model,HttpSession session,HttpServletRequest request,RedirectAttributes attr){

		// 获取音乐ID
		String musicID = request.getParameter("musicID");
		Music music =null;
		try {
			/*对该音乐的点击次数加1*/
			music=musicService.findById(Integer.parseInt(musicID));
			int click =music.getClick()+1;
			music.setClick(click);
			musicService.update(music);
		} catch (Exception e) {
			// TODO Auto-generated catch block  对于这种更新失败的场合 以后做处理
			e.printStackTrace();

		}

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
		model.addAttribute("music", music);
		return "show";
	}

		/**
		 * 获取当前音乐评论列表
		 * @param model
		 * @param request
		 * @return
		 */
		@RequestMapping(value="commects_ajax",method = RequestMethod.GET)
		public String musiclist(Model model,HttpServletRequest request){
	        // 获取音乐ID
			String musicID = request.getParameter("musicID");
			// 获取当前音乐
			Music music=musicService.findById(Integer.parseInt(musicID));
            
			model.addAttribute("listCommnet", music.getListCommnet());
			model.addAttribute("music", music);
			return "show_ajax";
		}
		
		/**
		 * 添加前音乐评论列表
		 * @param model
		 * @param request
		 * @return
		 */
		@RequestMapping(value="addcomments",method = RequestMethod.POST)
		public String addcomments(RedirectAttributes attr,Model model,HttpServletRequest request){
			
			String musicid =request.getParameter("musicid");
			String name =request.getParameter("name");
			String comments =request.getParameter("comments");
			
			if ("".equals(name)) {
				name = "游客";
			}
			long time = new Date().getTime();

		
			try {
				Comments comment = new Comments();
				comment.setMusicId(Integer.parseInt(musicid));
				comment.setValue(comments);
				comment.setTime(Long.toString(time));
				comment.setName(name);
				
				commentsService.save(comment);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				attr.addFlashAttribute("error", "评论失败..........");
				e.printStackTrace();
			}
			attr.addFlashAttribute("success", "评论成功..........");
			return "redirect:/commects_ajax?musicID="+musicid;
		}
}
