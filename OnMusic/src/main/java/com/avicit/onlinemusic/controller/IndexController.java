package com.avicit.onlinemusic.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.avicit.onlinemusic.entity.User;
import com.avicit.onlinemusic.service.CommentsService;
import com.avicit.onlinemusic.service.LinkService;
import com.avicit.onlinemusic.service.MessageService;
import com.avicit.onlinemusic.service.MusicService;
import com.avicit.onlinemusic.service.TipService;
import com.avicit.onlinemusic.service.UserService;
import com.avicit.onlinemusic.vo.LinkVo;
import com.avicit.onlinemusic.vo.MessageVo;
import com.avicit.onlinemusic.vo.MusicVo;
import com.avicit.onlinemusic.vo.TipVo;


/**
 * <br> 首页
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
@RequestMapping(value="index")
public class IndexController {

	/**
	 * 日志 两种测试
	 */
	private static org.slf4j.Logger logger = LoggerFactory.getLogger(IndexController.class);
	private static Log logger1 = LogFactory.getLog(IndexController.class);

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
	@RequestMapping
	public ModelAndView indexPageExecute (Model model,HttpSession session,HttpServletRequest request,RedirectAttributes attr){
		System.out.println("============================="+request.getAttribute("error"));
		logger.info("****************************************************************");

//		// 打印错误消息 BindingResult binding,
//		if(binding.hasErrors()){
//			List<FieldError>  err=binding.getFieldErrors(); 
//			FieldError fe; 
//			String field; 
//			String errorMessage; 
//			for (int i = 0; i < err.size(); i++) { 
//				fe=err.get(i); 
//				field=fe.getField();//得到那个字段验证出错 
//				errorMessage=fe.getDefaultMessage();//得到错误消息 
//				System.out.println("****************************错误字段消息："+field +"错误码"+fe.getCode()+" : "+errorMessage); 
//
//			}
//		}
		logger1.info("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
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


		//return "index";
		return new ModelAndView("index");
	}

	/**
	 * 首页音乐列表
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/index_ajax")
	public String musiclistExecute(Model model,HttpServletRequest request){

		String page = request.getParameter("page");
		System.out.println(page);
		// 获取音乐相关
		List<MusicVo> musicList=musicService.list();
		model.addAttribute("musicList", musicList);
		return "index_ajax";
	}
}
