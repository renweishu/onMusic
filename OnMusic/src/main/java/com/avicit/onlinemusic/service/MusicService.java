package com.avicit.onlinemusic.service;

import java.util.List;

import com.avicit.onlinemusic.entity.Music;
import com.avicit.onlinemusic.vo.MusicVo;

public interface MusicService {
	
	public List<MusicVo> list();
	
	public List<MusicVo> list(String[] params);
	
	public void update(Music music) throws Exception;
	
	public Integer save(Music music) throws Exception;
	
	public void delete(Music music) throws Exception;

	public Music findById(Integer id);

}
