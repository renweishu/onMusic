package com.avicit.onlinemusic.service;

import java.util.List;

import com.avicit.onlinemusic.entity.Link;
import com.avicit.onlinemusic.vo.LinkVo;

public interface LinkService {
	
	public List<LinkVo> list();
	
	public void update(Link link) throws Exception;
	
	public Integer save(Link link) throws Exception;
	
	public void delete(Link link) throws Exception;

	public Link findById(Integer id);

}
