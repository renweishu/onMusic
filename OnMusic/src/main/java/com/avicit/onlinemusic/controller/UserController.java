package com.avicit.onlinemusic.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.avicit.framework.util.ResponseUtils;
import com.avicit.onlinemusic.entity.User;
import com.avicit.onlinemusic.service.UserService;
import com.avicit.onlinemusic.util.Function;
import com.avicit.onlinemusic.vo.UserVo;

/**
 * 用户登录、注册、注销
 * <br>控制用户相关信息
 * @author admin
 *
 */
@Controller
@RequestMapping
public class UserController {
	@Autowired
	private UserService userService;


	/**
	 * 用户登录
	 * @param userVo
	 * @param attr (用于后台一个controller跳转到另一个controller 传递值用)
	 * @param binding
	 * @param session
	 * @return
	 */
	@RequestMapping(value="login",method = RequestMethod.POST)
	public String userLogin(@ModelAttribute("userVo") UserVo userVo,RedirectAttributes attr,BindingResult binding,HttpSession session){

		// 用户登录form 框验证 出错时
		if(binding.hasErrors()){
			return "redirect:/index";
		}
		// 用户密码验证
		String username = userVo.getName().trim();
		String password=userVo.getPwd().trim();
		User PlutoUser=null;
		if (Function.isInvalid(username) || Function.isInvalid(password)) {
			// addAttribute这个方法无法传递值
			//attr.addAttribute("error", "用户名或密码不能为空");
			attr.addFlashAttribute("error", "用户名或密码不能为空");
			return "redirect:/index";
		} else {
			// 转加密明文密码
			password = Function.MD5Encode(password);
			// 获取用户信息
			PlutoUser=userService.getUser(userVo.getName());
			if (PlutoUser == null || PlutoUser.getId() == null){
				//attr.addAttribute("error", "当前用户不存在");
				attr.addFlashAttribute("error", "当前用户不存在");
				return "redirect:/index";

			} else if(!password.equals(PlutoUser.getPwd())){
				//attr.addAttribute("error", "当前密码不正确，请重新登录");
				attr.addFlashAttribute("error", "当前密码不正确，请重新登录");
				return "redirect:/index";
			}
		}

		/*用户信息验证成功 用户信息放入session中*/
		session.setAttribute("PlutoUser", PlutoUser);

		/* 这儿转发到IndexController 内部转发的两种写法 return "redirect:/index" 或者return new ModelAndView("redirect:/index")*/
		return "redirect:/index";

	}

	/**
	 * 注销用户登录信息
	 * @param session
	 * @return
	 */
	@RequestMapping(value="logout",method = RequestMethod.GET)
	public String userLoginOut(HttpSession session){

		// 可以作为内部转发传递值
		// ModelAndView mav = new ModelAndView();
		// mav.setViewName("content");
		// mav.addObject("sampleContentList", contentList);
		// return mav;

		/*session中移除登录信息*/
		session.removeAttribute("PlutoUser");
		return "redirect:/index";
	}

	/**
	 * ajax处理：@RequestBody接收的是一个Json对象的字符串，而不是一个Json对象
	 * 然而在ajax请求往往传的都是Json对象，用 JSON.stringify(data)的方式就能将对象变成字符串。
	 * 同时ajax请求的时候也要指定dataType: "json",contentType:"application/json" 
	 * 这样就可以轻易的将一个对象或者List传到Java端，使用@RequestBody即可绑定对象或者List.
	 * 用户注册
	 * @param session
	 * @return
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping(value="addUser",method = RequestMethod.POST)
	public @ResponseBody Object userRegister(HttpServletRequest request) throws UnsupportedEncodingException{
		//这两个字段来拿测试用
		String jsonUser1 = request.getParameter("name");
		String jsonUser2 = request.getParameter("location");

		String jsonUser = request.getParameter("user");
		JSONObject jb=new JSONObject();  
		//将json格式的字符串转换为json数组对象  
		//将json格式的字符串转换为json对象，并取得该对象的“userName”属性值  

		String userName=(String)jb.fromObject(jsonUser).get("name");
		String userPwd= (String)jb.fromObject(jsonUser).get("pwd");
		String confirmPwd = (String)jb.fromObject(jsonUser).get("confirmPwd");

		if(Function.isInvalid(userName) || Function.isInvalid(userPwd) || Function.isInvalid(confirmPwd)){

			return ResponseUtils.sendFailure("registerError", "用户名或密码输入错误！");
		}
		if(!userPwd.equals(confirmPwd)){
			return ResponseUtils.sendFailure("registerError", "两次输入的密码不一致！");
		}
		// // 获取用户信息
		User user=userService.getUser(userName);
		if (user != null && user.getId() != null){
			return ResponseUtils.sendFailure("registerError", "用户名已存在！");

		}else{
			user = new User();
			user.setName(userName);
			user.setPwd(Function.MD5Encode(userPwd));

			try {
				userService.save(user);
				return ResponseUtils.sendSuccess("注册成功，请登陆！");

			} catch (Exception e) {
				e.printStackTrace();
				return ResponseUtils.sendFailure("registerError", "用户注册出现异常-注册失败");
			}
		}

	}

}
