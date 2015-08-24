package com.avicit.onlinemusic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avicit.framework.util.ListUtils;
import com.avicit.onlinemusic.dao.MusicServiceDaoMapper;
import com.avicit.onlinemusic.entity.Music;
import com.avicit.onlinemusic.service.MusicService;
import com.avicit.onlinemusic.vo.MusicVo;

@Service("musicServiceImpl")
public class MusicServiceImpl implements MusicService {

	@Autowired
	private MusicServiceDaoMapper musicServiceDaoMapper;

	public List<MusicVo> list() {

		return ListUtils.transform(musicServiceDaoMapper.listMusic(),MusicVo.class);
	}
	
	public List<MusicVo> list(String[] params) {

		return ListUtils.transform(musicServiceDaoMapper.listMusicByParam(params),MusicVo.class);
	}


	public void update(Music music) throws Exception {
		musicServiceDaoMapper.updateMusic(music);
	}


	public Integer save(Music music) throws Exception {
		return musicServiceDaoMapper.saveMusic(music);
	}


	public void delete(Music music) throws Exception {
		musicServiceDaoMapper.deleteMusic(music);
	}
	

	public Music findById(Integer id) {
		return musicServiceDaoMapper.findByIdMusic(id);

	}
}
