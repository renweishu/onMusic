package com.avicit.onlinemusic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avicit.framework.util.ListUtils;
import com.avicit.onlinemusic.dao.AdminServiceDaoMapper;
import com.avicit.onlinemusic.entity.Admin;
import com.avicit.onlinemusic.service.AdminService;
import com.avicit.onlinemusic.vo.AdminVo;

@Service("adminServiceImpl")
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminServiceDaoMapper adminServiceDaoMapper;

	public List<AdminVo> list() {

		return ListUtils.transform(adminServiceDaoMapper.listAdmin(),AdminVo.class);
	}


	public void update(Admin admin) throws Exception {
		adminServiceDaoMapper.updateAdmin(admin);
	}


	public Integer save(Admin admin) throws Exception {
		return adminServiceDaoMapper.saveAdmin(admin);
	}


	public void delete(Admin admin) throws Exception {
		adminServiceDaoMapper.deleteAdmin(admin);
	}


	public Admin findById(Integer id) {
		return adminServiceDaoMapper.findByIdAdmin(id);

	}
}
