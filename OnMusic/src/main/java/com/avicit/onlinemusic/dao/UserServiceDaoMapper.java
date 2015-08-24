package com.avicit.onlinemusic.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;

import com.avicit.onlinemusic.entity.User;



public interface UserServiceDaoMapper {

	/**
	 * 添加新用户
	 * @param user
	 * @return
	 */
	public int insertUser(User user);

	/**
	 * 更新新用户
	 * @param user
	 * @return
	 */
	public int updateUser(User user);

	/**
	 * 更新新用户
	 * @param user
	 * @return
	 */
	public int deleteUser(int code);


	/**
	 * 无论用注解与否(一个接口对应一个mapper.xml文件，都是必须配对)
	 * [备注:此处使用注解方式，不再UserMapper.xml配置]
	 * <br>查询单个用户信息-根据用户名
	 * 更新新用户
	 * @param user
	 * @return
	 */
	@Select("SELECT id, name, pwd,music_Box as musicBox FROM user WHERE name = #{userName}")
	public User selectUser(String userName);
	
	/**
	 * 无论用注解与否(一个接口对应一个mapper.xml文件，都是必须配对)
	 * [备注:此处使用注解方式，不再UserMapper.xml配置]
	 * <br>查询单个用户信息-根据用户名
	 * 更新新用户
	 * @param user
	 * @return
	 */
	@Select("SELECT id, name, pwd,music_Box as musicBox FROM user WHERE id = #{id}")
	public User findById(int id);


	/**
	 * <br>
	 * 查询单个用户信息<多个map集合信息方式>
	 * @param user
	 * @return
	 */
	public List<Map<Object,Object>> selectMapMuliUser();

	/**
	 * <br>
	 * 查询单个用户信息<单个map集合信息方式>
	 * @param user
	 * @return
	 */
	public Map<Object,Object> selectMapSingleUser(String userName);

	/**
	 * 方式1
	 * <br>
	 * 查询所有用户信息<List集合>
	 * @param user
	 * @return
	 */
	@Select("SELECT id, name, pwd,music_Box as musicBox  FROM user")
	public List<User> selectList1User();

	/**
	 * 方式2
	 * <br>
	 * 查询所有用户信息<List集合>
	 * @param user
	 * @return
	 */
	public List<User> selectList2User(String username);


	/**
	 * 方式3
	 * <br>
	 * 查询所有用户信息<ResultMap 方式>
	 * @param user
	 * @return
	 */
	public List<User> selectResultMapUser();

}
