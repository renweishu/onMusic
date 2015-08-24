package com.avicit.onlinemusic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avicit.framework.util.ListUtils;
import com.avicit.onlinemusic.dao.LinkServiceDaoMapper;
import com.avicit.onlinemusic.entity.Link;
import com.avicit.onlinemusic.service.LinkService;
import com.avicit.onlinemusic.vo.LinkVo;

@Service("linkServiceImpl")
public class LinkServiceImpl implements LinkService {

	@Autowired
	private LinkServiceDaoMapper linkServiceDaoMapper;

	public List<LinkVo> list() {

		return ListUtils.transform(linkServiceDaoMapper.listLink(),LinkVo.class);
	}


	public void update(Link link) throws Exception {
		linkServiceDaoMapper.updateLink(link);
	}


	public Integer save(Link link) throws Exception {
		return linkServiceDaoMapper.saveLink(link);
	}


	public void delete(Link link) throws Exception {
		linkServiceDaoMapper.deleteLink(link);
	}
	

	public Link findById(Integer id) {
		return linkServiceDaoMapper.findByIdLink(id);

	}
}
