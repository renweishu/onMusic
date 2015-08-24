package com.avicit.onlinemusic.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.avicit.onlinemusic.entity.Admin;

public interface AdminServiceDaoMapper {
	
	/**
	 * 获取多条记录
	 * @param 
	 * @return
	 */
	@Select("SELECT * from admin")
	public List<Admin> listAdmin();

	/**
	 * 更新
	 * @param 
	 * @return
	 */
	public void updateAdmin(Admin admin);

	/**
	 * 保存
	 * @param 
	 * @return
	 */
	public Integer saveAdmin(Admin admin);

	/**
	 * 删除
	 * @param 
	 * @return
	 */
	public void deleteAdmin(Admin admin);
	
	/**
	 * 根据ID查询
	 * @param 
	 * @return
	 */
	@Select("SELECT * from admin where id =#{id}")
	public Admin findByIdAdmin(Integer id);

}
