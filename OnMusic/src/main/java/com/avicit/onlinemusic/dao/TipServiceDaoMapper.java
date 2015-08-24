package com.avicit.onlinemusic.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.avicit.onlinemusic.entity.Tip;

public interface TipServiceDaoMapper {
	
	
	/**
	 * 获取最近的十条记录
	 * @param 
	 * @return
	 */
	@Select("SELECT * from Tip ORDER BY id DESC LIMIT 10")
	public List<Tip> listTips();

	
	/**
	 * 更新标题
	 * @param tip
	 * @return
	 */
	public void updateTip(Tip tip);


	/**
	 * 保存标题
	 * @param tip
	 * @return
	 */
	public Integer saveTip(Tip tip);
	

	/**
	 * 删除标题
	 * @param tip
	 * @return
	 */
	public void deleteTip(Tip tip);
	

	/**
	 * 找寻标题
	 * @param tip
	 * @return
	 */
	@Select("SELECT * from Tip where id =#{id}")
	public Tip findByIdTip(Integer id);

}
