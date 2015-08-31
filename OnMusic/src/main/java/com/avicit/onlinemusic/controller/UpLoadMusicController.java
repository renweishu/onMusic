package com.avicit.onlinemusic.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.avicit.onlinemusic.entity.Music;
import com.avicit.onlinemusic.entity.Tip;
import com.avicit.onlinemusic.entity.User;
import com.avicit.onlinemusic.entitytwo.MusicBackup;
import com.avicit.onlinemusic.service.CommentsService;
import com.avicit.onlinemusic.service.LinkService;
import com.avicit.onlinemusic.service.MessageService;
import com.avicit.onlinemusic.service.MusicService;
import com.avicit.onlinemusic.service.TipService;
import com.avicit.onlinemusic.service.UserService;
import com.avicit.onlinemusic.service.second.MusicBackupService;
import com.avicit.onlinemusic.util.Function;
import com.avicit.onlinemusic.vo.LinkVo;
import com.avicit.onlinemusic.vo.MessageVo;
import com.avicit.onlinemusic.vo.MusicVo;
import com.avicit.onlinemusic.vo.TipVo;


/**
 * <br> 音乐上传页面
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
public class UpLoadMusicController {
	
	/**
	 * 日志 两种测试
	 */
	private static org.slf4j.Logger logger = LoggerFactory.getLogger(UpLoadMusicController.class);

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

	/*第二数据源同步数据使用*/
	@Autowired
	private MusicBackupService musicBackupService;


	/**
	 * 音乐上传页面
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping(value="uploadmusicPage")
	public String indexPageExecute(Model model,HttpSession session,HttpServletRequest request,RedirectAttributes attr){

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

		/* 用户未登录的情况下 返回首页 不允许用户文件上传*/
		if(PlutoUser ==null){
			return "index";
		}

		/* 3文件上传成功时 跳转到mp3信息编辑页面*/
		String filePath= request.getParameter("filePath");
		if(filePath !=null){
			model.addAttribute("filePath", filePath);
			return "upload";	
		}
		/* 首次文件上传请求 或者 文件上传失败 跳转到mp3文件上传页面*/
		return "uploadmusic";
	}

	/** 
	 * 进行多个文件上传 
	 * @param musics 这个参数名需要跟表单中上传的name属性名称一样,否则上传不成功 
	 * 在批量上传的时候需要加上这个注解@RequestParam当请求参数a不存在时会有异常发生,可以通过设置属性required=false解决 
	 * @param model 
	 * @return 
	 */  
	@RequestMapping(value = "uploadmusic",method = RequestMethod.POST)  
	public String uploadPhotoExecute(@RequestParam(required = false)MultipartFile[] musics,Model model,HttpServletRequest req,RedirectAttributes attr){  
		// 文件存放路径
		String realpath = req.getSession().getServletContext().getRealPath("/upload/");  
		File saveFile=null;
		try {  
			for(MultipartFile music : musics){  
				String fileType=music.getContentType();//文件的类型,image/jpeg  
				//String paramName=music.getName();//上传的表单名称  
				//String fileName=music.getOriginalFilename();//上传的文件名  
				// 保存文件类型
				String saveType = "."+fileType.substring(6);
				SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
				Date dt = new Date();
				Random rd = new Random();

				// 文件类型判断  music.getContentType()获取文件格式时:
				// goole浏览器上传mp3文件后台获得为"audio/mp3" 微软最新浏览器上传mp3文件后台获得为"audio/mpeg"
				if ("audio/mp3".equals(fileType) || "audio/mpeg".equals(fileType)) {

					if(music.isEmpty())continue;//可能会有三个上传表单却不一定三个都进行上传，这样其他的就为空需要判断  
					// 保存文件
					saveFile=new File(realpath + "\\" +sdf.format(dt) + rd.nextInt(9999) + saveType);
					
					logger.info("上传文件路径:"+saveFile.getAbsolutePath());
					
					FileUtils.copyInputStreamToFile(music.getInputStream(), saveFile);  
				} else {
					// 返回mp3文件上传页面 错误信息提示
					attr.addFlashAttribute("error", "上传类型必须为MP3格式文件 或者mpeg格式文件");
					return "redirect:/uploadmusicPage";
				}

			}  
		} catch (IOException e) {
			e.printStackTrace();
		} 
		// 上传成功时，跳转到MP3文件信息编辑页面 同时将保存文件路径传递过去
		String filePath = "upload\\\\" + saveFile.getName();
		return "redirect:/uploadmusicPage?filePath="+filePath;
	}

	/**
	 * MP3文件信息编辑提交
	 * @param session
	 * @return
	 */
	@RequestMapping(value="infoupload",method = RequestMethod.POST)
	public String infoUploadExecute(@ModelAttribute("musicVo") MusicVo musicVo,HttpSession session,RedirectAttributes attr) throws Exception{

		String title = musicVo.getTitle();
		String singer= musicVo.getSinger();
		String special= musicVo.getSpecial();
		String path= musicVo.getUrl();
		String value =musicVo.getValue();

		if (Function.isInvalid(title) || Function.isInvalid(singer)
				|| Function.isInvalid(special) || Function.isInvalid(path)|| Function.isInvalid(value)) {

			// 返回mp3文件上传页面 错误信息提示
			attr.addFlashAttribute("error", "任何一项都不能为空！");
			return "upload";

		} else {
			try {
				/*1.先从session中取用户对象*/
				User PlutoUser=(User)session.getAttribute("PlutoUser");	

				// 获取文件后缀
				String filePath = path.substring(1).replace("upload", "upload\\");

				long time = new Date().getTime();
				Music music = new Music();
				music.setTitle(title);
				music.setSinger(singer);
				music.setSpecial(special);
				music.setUrl(filePath);
				music.setValue(value);
				music.setTime(Long.toString(time));
				music.setClick(0);
				// 关联用户ID
				music.setUserId(PlutoUser.getId());
				// 录入数据库
				musicService.save(music);

				/*-----------------------------------*/
				/*第二数据源同步数据使用 同步到music_backup表中*/
				MusicBackup musicbackup=new MusicBackup();
				musicbackup.setTitle(title);
				musicbackup.setSinger(singer);
				musicbackup.setSpecial(special);
				musicbackup.setUrl(filePath);
				musicbackup.setValue(value);
				musicbackup.setTime(Long.toString(time));
				musicbackup.setClick(0);
				// 关联用户ID
				musicbackup.setUserId(PlutoUser.getId());
				musicBackupService.saveBackupMusic(musicbackup);

				// 添加TIP
				Tip tip = new Tip();
				String tipvalue = "[" + PlutoUser.getName()+ "] 分享了歌曲 [" + title + "]";
				tip.setValue(tipvalue);
				tipService.save(tip);
			} catch (Exception e) {
				// TODO 对于异常需要处理
				e.printStackTrace();
				System.out.println("事务回滚了吗？------------------");
				//编程式 方式来指定回滚事务。 虽然写法非常的简单，但是这个方法是高侵入性的，并且使你的代码与Spring框架的事务架构高度耦合
				//TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
				/*=====================================================================================*/
				throw e;// 在配置AOP事务处理时 切记throw扔出异常 不然事务不会回滚
			}

		}

		/*返回首页*/
		return "redirect:/index";
	}

}
