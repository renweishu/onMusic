package all.info.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Before;
import org.junit.Test;

import com.avicit.onlinemusic.dao.MusicServiceDaoMapper;
import com.avicit.onlinemusic.daotwo.MusicBackupServiceDaoMapper;
import com.avicit.onlinemusic.entity.Music;
import com.avicit.onlinemusic.entitytwo.MusicBackup;



public class MusicBackupServiceImplTest {

	private SqlSessionFactory  sqlsessionfactory1;
	private SqlSessionFactory  sqlsessionfactory2;

	@Before
	public void before(){                                                                    
		String resource = "conf/mybatis/mybatis-config-test.xml";
		String log4jpath = "C:/Users/Administrator/git2/OnMusic/target/test-classes/"+"conf/log4j/log4j.properties";
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

			/*获取第一第二数据源*/
			sqlsessionfactory1 = new SqlSessionFactoryBuilder().build(inputStream, "oneDataSource");
			// 根据<environment id="development"> 获取对应数据源 从而获得对应sqlsessionfactory
			// 再次开启IO流，第一次调用bulid后 会关闭IO流
			inputStream = Resources.getResourceAsStream(resource);
			sqlsessionfactory2 = new SqlSessionFactoryBuilder().build(inputStream, "twoDataSource");
		} catch (IOException e) {

			e.printStackTrace();
		}
	}


	/**
	 *  同时双数据源测试
	 * 测试MusicBackupServiceDaoMapper映射器
	 */
	@Test
	public void saveMusicBackup(){
		SqlSession session1 = sqlsessionfactory1.openSession();
		SqlSession session2 = sqlsessionfactory2.openSession();
		try {

			System.out.println("数据源1 音乐信息入库开始...........");
			MusicServiceDaoMapper mapper1 = session1.getMapper(MusicServiceDaoMapper.class);
			Music music = new Music();		
			music.setTitle("双截棍测试");
			music.setSinger("周杰伦");
			music.setSpecial("无题");
			music.setUrl("\201506305470.mp3");
			music.setValue("双截棍简介---------------------------------------------");
			music.setTime("1435631555786");
			music.setClick(0);
			// 关联用户ID
			music.setUserId(38);		
			mapper1.saveMusic(music);
			session1.commit();
			System.out.println("数据源1 音乐信息入库完成...........");


			System.out.println("数据源2 音乐信息入库开始...........");
			MusicBackupServiceDaoMapper mapper2 = session2.getMapper(MusicBackupServiceDaoMapper.class);
			MusicBackup musicbackup = new MusicBackup();		
			musicbackup.setTitle("双截棍测试");
			musicbackup.setSinger("周杰伦");
			musicbackup.setSpecial("无题");
			musicbackup.setUrl("\201506305470.mp3");
			musicbackup.setValue("双截棍简介---------------------------------------------");
			musicbackup.setTime("1435631555786");
			musicbackup.setClick(0);
			// 关联用户ID
			musicbackup.setUserId(38);		
			mapper2.saveBackupMusic(musicbackup);
			session2.commit();
			System.out.println("数据源2 音乐信息入库完成...........");
		} finally {
			session1.close();
			session2.close();
		}

	}
}