package com.avicit.onlinemusic.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.avicit.framework.util.ResponseUtils;
import com.avicit.onlinemusic.entity.Music;
import com.avicit.onlinemusic.service.MusicService;

/**
 * 暂时备用 不删除
 * @author admin
 *
 */
@Controller
@RequestMapping(value="musics")
public class TestMusicController {
	
	@Autowired
	private MusicService musicService;

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
	
}
