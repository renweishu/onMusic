package com.avicit.onlinemusic.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.avicit.onlinemusic.entity.Link;

public interface LinkServiceDaoMapper {
	
	/**
	 * 获取最近的20条记录
	 * @param 
	 * @return
	 */
	@Select("SELECT * from Link ORDER BY id DESC LIMIT 20")
	public List<Link> listLink();


	/**
	 * 更新单条记录
	 * @param 
	 * @return
	 */
	public void updateLink(Link link);

	/**
	 * 保存单条记录
	 * @param 
	 * @return
	 */
	public Integer saveLink(Link link);
	
	/**
	 * 删除单条记录
	 * @param 
	 * @return
	 */
	public void deleteLink(Link link);
	
	/**
	 * 获取单条记录
	 * @param 
	 * @return
	 */
	@Select("SELECT * from Link where id=#{id}")
	public Link findByIdLink(Integer id);

}
