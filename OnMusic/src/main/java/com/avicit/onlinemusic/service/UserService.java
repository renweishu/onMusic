package com.avicit.onlinemusic.service;

import java.util.List;

import com.avicit.onlinemusic.entity.User;
import com.avicit.onlinemusic.vo.UserVo;

public interface UserService {
	
	public List<UserVo> list();
	
	public List<UserVo> list(String username);
	
	public User singleUser(String username);
	
	public User getUser(String username);
	
	public void update(User user) throws Exception;
	
	public Integer save(User user) throws Exception;
	
	public void delete(User user) throws Exception;

	public User findById(Integer id);

}
