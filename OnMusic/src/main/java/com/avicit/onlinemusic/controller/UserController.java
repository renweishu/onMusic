package com.avicit.onlinemusic.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.avicit.framework.util.DproMessageConsts;
import com.avicit.framework.util.ResponseUtils;
import com.avicit.framework.util.validator.UserLoginValidator;
import com.avicit.onlinemusic.entity.User;
import com.avicit.onlinemusic.service.UserService;
import com.avicit.onlinemusic.util.Function;
import com.avicit.onlinemusic.vo.UserVo;

import net.sf.json.JSONObject;

/**
 * 用户登录、注册、注销
 * <br>控制用户相关信息
 * @author admin
 *
 */
@Controller
@RequestMapping
public class UserController {
	
	/**
	 * 日志 记录器
	 */
	private static org.slf4j.Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	


	/**
	 * <br/>数据验证
	 * @param binder
	 */
	@InitBinder
	public void initBinder(WebDataBinder  binder) {
		binder.setValidator(new UserLoginValidator());
	}
	/**
	 * 用户登录
	 * @param userVo
	 * @param attr (用于后台一个controller跳转到另一个controller 传递值用)
	 * @param binding
	 * @param session
	 * @return
	 */
	@RequestMapping(value="login",method = RequestMethod.POST)//@ModelAttribute("userVo") UserVo userVo 谨慎使用
	public ModelAndView userLoginExecute(@Valid UserVo userVo,BindingResult binding,RedirectAttributes attr,HttpSession session){

		// 用户登录form 框验证 出错时 
		/*备注:使用@Valid+Spring MVC 出现400 错误|原因：必须含有BindingResult 参数|BindingResult紧跟在 @Valid 参数之后*/
		if(binding.hasErrors()){
			// 打印错误消息
			List<FieldError>  err=binding.getFieldErrors(); 
			FieldError fe; 
			String field; 
			String errorMessage; 
			for (int i = 0; i < err.size(); i++) { 
				fe=err.get(i); 
				field=fe.getField();//得到那个字段验证出错 
				errorMessage=fe.getDefaultMessage();//得到错误消息 
				logger.info("****************************错误字段消息："+field +"错误码"+fe.getCode()+" : "+errorMessage);

			}

			/*redirect:/index为重定向    与RedirectAttributes配合使用*/
			/*addFlashAttribute与addAttribute区别 :*/
			/*弊端:addAttribute传递的参数会在url地址中暴露，如果是中文时，还会出现乱码，并且影响addFlashAttribute传递的参数在页面中用EL表达式无法娶到*/
			/*addFlashAttribute传递的参数在URL地址中不会暴露，页面取值直接用el表达式就能获得到，这里的原理是放到session中---------------------，
			 * 但是 session在跳到页面后马上移除对象。所以你刷新一下后这个值就会丢掉。----------------------------------------------------*/
			//			ModelAndView mv =new ModelAndView("redirect:/index");
			//			attr.addFlashAttribute("error", DproMessageConsts.VALID_USER_ALL);//
			//			attr.addAttribute("test", "test");

			
			
			/*forward:/index为内部转发------------------------------------------*/
			ModelAndView mv =new ModelAndView("forward:/index");
			/*ModelAndView类使用的ModelMap类是一个自定义的Map的实现。 当有一个新对象加入的时候，它就被用于为这个对象自动生成一个键*/
			/*如果是redirect:/index为重定向方式时，会清空ModelMap里的存放值*/
			mv.addObject("error", DproMessageConsts.VALID_USER_ALL);
			return mv;

		}
		// 用户密码验证
		String username = userVo.getName().trim();
		String password=userVo.getPwd().trim();
		User PlutoUser=null;
		if (Function.isInvalid(username) || Function.isInvalid(password)) {
			// addAttribute这个方法无法传递值
			//attr.addAttribute("error", "用户名或密码不能为空");
			attr.addFlashAttribute("error", DproMessageConsts.VALID_USER_ALL);
			return new ModelAndView("redirect:/index");
			//return new ModelAndView("redirect:/index","error", DproMessageConsts.VALID_USER_ALL);
		} else {
			// 转加密明文密码
			password = Function.MD5Encode(password);
			// 获取用户信息
			PlutoUser=userService.getUser(userVo.getName());
			if (PlutoUser == null || PlutoUser.getId() == null){
				//attr.addAttribute("error", "当前用户不存在");
				attr.addFlashAttribute("error", DproMessageConsts.VALID_USER_NAME);
				return new ModelAndView("redirect:/index");

			} else if(!password.equals(PlutoUser.getPwd())){
				//attr.addAttribute("error", "当前密码不正确，请重新登录");
				attr.addFlashAttribute("error", DproMessageConsts.VALID_USER_PASSWORD);
				return new ModelAndView("redirect:/index");
			}
		}

		/*用户信息验证成功 用户信息放入session中*/
		session.setAttribute("PlutoUser", PlutoUser);

		/* 这儿转发到IndexController 内部转发的两种写法 return "redirect:/index" 或者return new ModelAndView("redirect:/index")*/
		return new ModelAndView("redirect:/index");

	}

	/**
	 * 注销用户登录信息
	 * @param session
	 * @return
	 */
	@RequestMapping(value="logout",method = RequestMethod.GET)
	public String userLoginOutExecute(HttpSession session){

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
	public @ResponseBody Object userRegisterExecute(HttpServletRequest request) throws UnsupportedEncodingException{
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
