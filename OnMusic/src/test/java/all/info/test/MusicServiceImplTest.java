package all.info.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;

import com.avicit.onlinemusic.dao.MusicServiceDaoMapper;
import com.avicit.onlinemusic.dao.UserMusicCommentDemo;
import com.avicit.onlinemusic.entity.Music;



public class MusicServiceImplTest {

	private SqlSessionFactory  sqlsessionfactory;

	@Before
	public void before(){                                                                    
		String resource = "conf/mybatis/mybatis-config-test.xml";
		String log4jpath = "C:/Users/Administrator/git2/OnMusic/target/classes/"+"conf/log4j/log4j.properties";
		try {
			System.out.println(log4jpath.replace("file:/", ""));
			// 初始化log4j配置文件
			PropertyConfigurator.configure(log4jpath.replace("file:/", "")); 
			
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


	/**
	 * 测试UserMusicCommentDemo映射器
	 */
	@Test
	public void getSingleMusic(){
		SqlSession session = sqlsessionfactory.openSession();
		try {

			UserMusicCommentDemo mapper = session.getMapper(UserMusicCommentDemo.class);
			Music mu = (Music)mapper.selectOne2Music(1);
			System.out.println(mu);
			System.out.println("查询单条音乐记录成功...........");
			System.out.println("==================================================");
			List<Music> list =(List<Music>)mapper.selectList2Music();
			for(Music m:list){
				System.out.println(m);
			}
			System.out.println("全记录音乐记录成功...........");
		} finally {
			session.close();
		}

	}
	
	
	/**
	 * 测试MusicServiceDaoMapper映射器
	 */
	@Test
	public void findByIdMusic(){
		SqlSession session = sqlsessionfactory.openSession();
		try {

			MusicServiceDaoMapper mapper = session.getMapper(MusicServiceDaoMapper.class);
//			Music mu = (Music)mapper.findByIdMusic(2);
//			System.out.println(mu);
//			System.out.println("查询单条音乐记录成功...........");
			System.out.println("==================================================");
			String str="5,6";
			String[] arrp=str.split(",");
			List<Music> list =(List<Music>)mapper.listMusicByParam(arrp);
			for(Music m:list){
				System.out.println("显示||"+m);
			}
			System.out.println("全记录音乐记录成功...........");
		} finally {
			session.close();
		}

	}
}