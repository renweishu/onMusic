package com.avicit.onlinemusic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avicit.framework.util.ListUtils;
import com.avicit.onlinemusic.dao.CommentsServiceDaoMapper;
import com.avicit.onlinemusic.entity.Comments;
import com.avicit.onlinemusic.service.CommentsService;
import com.avicit.onlinemusic.vo.CommentsVo;

@Service("commentsServiceImpl")
public class CommentsServiceImpl implements CommentsService {

	@Autowired
	private CommentsServiceDaoMapper commentsServiceDaoMapper;

	public List<CommentsVo> list() {

		return ListUtils.transform(commentsServiceDaoMapper.listComments(),CommentsVo.class);
	}


	public void update(Comments comments) throws Exception {
		commentsServiceDaoMapper.updateComments(comments);
	}


	public Integer save(Comments comments) throws Exception {
		return commentsServiceDaoMapper.saveComments(comments);
	}


	public void delete(Comments comments) throws Exception {
		commentsServiceDaoMapper.deleteComments(comments);
	}
	

	public Comments findById(Integer id) {
		return commentsServiceDaoMapper.findByIdComments(id);

	}
}
