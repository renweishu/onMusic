package com.avicit.onlinemusic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avicit.framework.util.ListUtils;
import com.avicit.onlinemusic.dao.UserServiceDaoMapper;
import com.avicit.onlinemusic.entity.User;
import com.avicit.onlinemusic.service.UserService;
import com.avicit.onlinemusic.vo.UserVo;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserServiceDaoMapper userServiceDaoMapper;

	public List<UserVo> list() {
		return ListUtils.transform(userServiceDaoMapper.selectList1User(),UserVo.class);
	}

	/**
	 * 根据用户名查找
	 * @param username
	 * @return
	 */
	public List<UserVo> list(String username) {

		return ListUtils.transform(userServiceDaoMapper.selectList2User(username),UserVo.class);
	}

	/**
	 * 根据用户名查找
	 * @param username
	 * @return
	 */
	public User singleUser(String username) {
		return userServiceDaoMapper.selectUser(username);
	}

	/**
	 * 通过用户名获取用户信息
	 * @param username
	 * @return
	 */
	public User getUser(String username) {
		return userServiceDaoMapper.selectUser(username);
	}


	public void update(User user) throws Exception {
		userServiceDaoMapper.updateUser(user);
	}


	public Integer save(User user) throws Exception {
		return userServiceDaoMapper.insertUser(user);
	}


	public void delete(User user) throws Exception {
		userServiceDaoMapper.deleteUser(user.getId());
	}


	public User findById(Integer id) {
		return userServiceDaoMapper.findById(id);

	}
}
