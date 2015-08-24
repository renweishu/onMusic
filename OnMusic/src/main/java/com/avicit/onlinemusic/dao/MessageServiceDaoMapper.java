package com.avicit.onlinemusic.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.avicit.onlinemusic.entity.Message;

public interface MessageServiceDaoMapper {
	
	/**
	 * 获取关联记录
	 * @param 
	 * @return
	 */
	@Select("SELECT id,user_from as userFrom,user_to as userTo,title,value,time,read_flg as readFlg from Message where user_to=#{id} and read_flg = 1")
	public List<Message> listMessage(int id);

	/**
	 * 更新单条记录
	 * @param 
	 * @return
	 */
	public void updateMessage(Message message);

	/**
	 * 保存单条记录
	 * @param 
	 * @return
	 */
	public Integer saveMessage(Message message);

	/**
	 * 删除单条记录
	 * @param 
	 * @return
	 */
	public void deleteMessage(Message message);
	
	/**
	 * 获取最近的十条记录
	 * @param 
	 * @return
	 */
	@Select("SELECT id,user_from as userFrom,user_to as userTo,title,value,time,read_flg as readFlg from Message where id=#{id}")
	public Message findByIdMessage(Integer id) ;

}
