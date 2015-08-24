package all.info.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.avicit.onlinemusic.dao.UserServiceDaoMapper;
import com.avicit.onlinemusic.entity.User;



public class UserServiceImplTest {

	private SqlSessionFactory  sqlsessionfactory;

	@Before
	public void before(){                                                                    
		String resource = "conf/mybatis/mybatis-config-test.xml";

		try {
			/*
			 * 每个基于 MyBatis 的应用都是以一个 SqlSessionFactory 的实例为中心的。
			 * SqlSessionFactory 的实例可以通过 SqlSessionFactoryBuilder 获得。
			 * 而 SqlSessionFactoryBuilder 则可以从 XML 配置文件或一个预先定制的 Configuration 的实例构建出 SqlSessionFactory 的实例。
			 * */
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlsessionfactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Test
	public void slectOneUser(){
		SqlSession session = sqlsessionfactory.openSession();
		try {
			/*在mapper中无论用注解与否，都可以通过一下两个两种方式获取sql映射结果集*/
			// 方法一
			//			UserDaoMapper mapper = session.getMapper(UserDaoMapper.class);
			//			User user = mapper.selectUser("mac");
			// 方法二
			User user=(User)session.selectOne("com.avicit.onlinemusic.dao.UserDaoMapper.selectUser", "mac2");

			System.out.println("ok");
			System.out.println("用户信息:"+user.toString());

		} finally {
			session.close();
		}

	}


	@Test
	public void saveUser(){

		User u = new User();
		//u.setId(24); ID自增长
		u.setName("mac7");
		u.setPwd("123456");
		u.setMusicBox("1,2");
		SqlSession session = sqlsessionfactory.openSession();

		try {
			// 方法1
			//session.insert("com.avicit.onlinemusic.dao.UserDaoMapper.insertUser", u);
			// 方法2
			UserServiceDaoMapper mapper = session.getMapper(UserServiceDaoMapper.class);
			mapper.insertUser(u);

			session.commit();// 记得手动commit
			System.out.println("save----ok");		

		} finally {
			session.close();
		}

	}

	@Test
	public void updateUser(){

		User u = new User();
		u.setId(34); 
		u.setName("mac6");
		u.setPwd("123456-333");
		u.setMusicBox("1,2,6,8");
		SqlSession session = sqlsessionfactory.openSession();
		try {
			UserServiceDaoMapper mapper = session.getMapper(UserServiceDaoMapper.class);
			mapper.updateUser(u);
			session.commit();// 记得手动commit
			System.out.println("update----ok");		

		} finally {
			session.close();
		}
	}

	@Test
	public void deleteUser(){
		SqlSession session = sqlsessionfactory.openSession();
		try {
			UserServiceDaoMapper mapper = session.getMapper(UserServiceDaoMapper.class);
			int userid=35;
			mapper.deleteUser(userid);
			session.commit();// 记得手动commit
			System.out.println("delete----ok");		
		} finally {
			session.close();
		}
	}


	@Test
	public void getAllList1User(){

		SqlSession session = sqlsessionfactory.openSession();

		try {

			UserServiceDaoMapper mapper = session.getMapper(UserServiceDaoMapper.class);
			// 方式一
			List<User> list1 = (ArrayList<User>)mapper.selectList1User();
			// 方式一
			List<User> list2 = (ArrayList<User>)mapper.selectList2User("lichao");
			// 方式一
			List<User> list3 = (ArrayList<User>)mapper.selectResultMapUser();

			for(User u:list1){
				System.out.println("方式一||list集合:"+u);
			}
			for(User u:list2){
				System.out.println("方式二||list集合:"+u);
			}
			for(User u:list3){
				System.out.println("方式三||list集合:"+u);
			}

		} finally {
			session.close();
		}

	}

	@Test
	public void getMapUser(){
		SqlSession session = sqlsessionfactory.openSession();
		try {

			UserServiceDaoMapper mapper = session.getMapper(UserServiceDaoMapper.class);
			// 方法1 map集合list
			List<Map<Object,Object>> listmap = (List<Map<Object, Object>>)mapper.selectMapMuliUser();
			for(Map<Object,Object> map:listmap){
				System.out.println(map.get("id"));
				System.out.println(map.get("name"));
				System.out.println(map.get("pwd"));
				System.out.println("map集合取值OK");
			}
			System.out.println("==============================");
			// 方法2 单个map集合
			Map<Object,Object> map = (Map<Object, Object>)mapper.selectMapSingleUser("mac7");
			System.out.println(map.get("id"));
			System.out.println(map.get("name"));
			System.out.println(map.get("pwd"));
			System.out.println("单个map集合取值OK");

		} finally {
			session.close();
		}

	}
}