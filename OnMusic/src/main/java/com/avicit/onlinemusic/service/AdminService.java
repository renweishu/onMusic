package com.avicit.onlinemusic.service;

import java.util.List;

import com.avicit.onlinemusic.entity.Admin;
import com.avicit.onlinemusic.vo.AdminVo;

public interface AdminService {
	
	public List<AdminVo> list();
	
	public void update(Admin admin) throws Exception;
	
	public Integer save(Admin admin) throws Exception;
	
	public void delete(Admin admin) throws Exception;

	public Admin findById(Integer id);

}
