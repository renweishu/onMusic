package com.avicit.onlinemusic.service;

import java.util.List;

import com.avicit.onlinemusic.entity.Comments;
import com.avicit.onlinemusic.vo.CommentsVo;

public interface CommentsService {
	
	public List<CommentsVo> list();
	
	public void update(Comments comments) throws Exception;
	
	public Integer save(Comments comments) throws Exception;
	
	public void delete(Comments comments) throws Exception;

	public Comments findById(Integer id);

}
