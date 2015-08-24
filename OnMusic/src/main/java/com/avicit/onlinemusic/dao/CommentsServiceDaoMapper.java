package com.avicit.onlinemusic.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.avicit.onlinemusic.entity.Comments;

public interface CommentsServiceDaoMapper {
	
	/**
	 * 获取最近的多条记录
	 * @param 
	 * @return
	 */
	@Select("SELECT id,value,name,music_id as musicId,time from Comments")
	public List<Comments> listComments();

	/**
	 * 更新单条记录
	 * @param 
	 * @return
	 */
	public void updateComments(Comments comments);

	/**
	 * 保存单条记录
	 * @param 
	 * @return
	 */
	public Integer saveComments(Comments comments);

	/**
	 * 删除单条记录
	 * @param 
	 * @return
	 */
	public void deleteComments(Comments comments);
	
	/**
	 * 获取单条记录
	 * @param 
	 * @return
	 */
	@Select("SELECT id,value,name,music_id as musicId,time from Comments where id=#{id}")
	public Comments findByIdComments(Integer id);

}
