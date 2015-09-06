package com.avicit.onlinemusic.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.avicit.framework.util.DproMessageConsts;
import com.avicit.framework.util.ResponseUtils;
import com.avicit.framework.util.validator.UserLoginValidator;
import com.avicit.onlinemusic.entity.Music;
import com.avicit.onlinemusic.entity.User;
import com.avicit.onlinemusic.service.MusicService;
import com.avicit.onlinemusic.util.Function;
import com.avicit.onlinemusic.vo.UserVo;

/**
 * 暂时备用 不删除
 * @author admin
 *
 */
@Controller
@RequestMapping
public class TestMusicController {
	
	@Autowired
	private MusicService musicService;
	
	/**
	 * <br/>数据验证
	 * @param binder
	 */
	@InitBinder
	public void initBinder(WebDataBinder  binder) {
		binder.setValidator(new UserLoginValidator());
	}

	@RequestMapping(method=RequestMethod.GET)
	//@RequestMapping("musiclist") @ResponseBody是把数据转换为json格式
	public @ResponseBody Object list(){
		
		return ResponseUtils.sendPagination(musicService.list()) ;
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public @ResponseBody Object findById(@RequestParam int id,HttpServletRequest request,HttpServletResponse response){
		System.out.println("======="+id);
		return null;
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.PUT)
	public @ResponseBody Object update(@RequestBody Music music) throws Exception{
		this.musicService.update(music);
		return ResponseUtils.sendSuccess("保存成功");
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public @ResponseBody Object save(@RequestBody Music music) throws Exception{
		return ResponseUtils.sendSuccess("保存成功",this.musicService.save(music));
	}
	
	@RequestMapping(value="{id}",method=RequestMethod.DELETE)
	public @ResponseBody Object delete(@RequestBody Music music) throws Exception{
		this.musicService.delete(music);
		return ResponseUtils.sendSuccess("删除成功");
	}
	
	/**
	 * 用户登录
	 * @param userVo
	 * @param attr (用于后台一个controller跳转到另一个controller 传递值用)
	 * @param binding
	 * @param session
	 * @return
	 */
	@RequestMapping(value="testlogin",method = RequestMethod.POST)//@ModelAttribute("userVo") UserVo userVo 谨慎使用
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
				System.out.println("****************************错误字段消息："+field +"错误码"+fe.getCode()+" : "+errorMessage); 
				
			}
			// 测试使用  不用@Valid方法绑定在BindingResult里的错误消息
			//attr.addFlashAttribute("error", DproMessageConsts.VALID_USER_ALL);
			return new ModelAndView("test","error", DproMessageConsts.VALID_USER_ALL);
		}


		/* 这儿转发到IndexController 内部转发的两种写法 return "redirect:/index" 或者return new ModelAndView("redirect:/index")*/
		return new ModelAndView("redirect:/index");

	}
	
}
