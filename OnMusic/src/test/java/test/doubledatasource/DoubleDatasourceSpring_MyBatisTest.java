package test.doubledatasource;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.avicit.onlinemusic.entity.Music;
import com.avicit.onlinemusic.entitytwo.MusicBackup;
import com.avicit.onlinemusic.service.MusicService;
import com.avicit.onlinemusic.service.second.MusicBackupService;


/**
 * @see集成 spring 与 mybatis测试
 * 双数据源测试----------
 * @author Administrator
 *
 */
public class DoubleDatasourceSpring_MyBatisTest {


	/*spring容器上下文*/
	private ApplicationContext context;
	/*musicService服务*/
	private MusicService musicService;
	/*musicBackupService服务*/
	private MusicBackupService musicBackupService;

	/*
	 *日志 
	 */
	//private static Logger logger = Logger.getLogger(DoubleDatasourceSpring_MyBatisTest.class); 

	/**
	 * 在每个测试方法之前执行
	 */
	@Before
	public void before(){
		/*初始化日志*/
//		String log4jpath = "C:/Users/Administrator/git2/OnMusic/target/test-classes/"+"conf/log4j/log4j.properties";
//		System.out.println(log4jpath.replace("file:/", ""));
//		// 初始化log4j配置文件
//		PropertyConfigurator.configure(log4jpath.replace("file:/", "")); 

		//logger.info("日志初始化成功......");

		/*初始化spring容器*/
		context = new ClassPathXmlApplicationContext(new String[]{"classpath:com/avicit/resource/spring/spring-base.xml"});

		//logger.info("spring容器初始化成功......");

		/*获取对应bean对象实例*/
		
		musicBackupService = (MusicBackupService)context.getBean("musicBackupServiceImpl");
		musicService =(MusicService)context.getBean("musicServiceImpl");
	}

	@Test
	public void addtvareadata() throws Exception{
		System.out.println("开始测试----");
		
		System.out.println("数据源1 音乐信息入库开始...........");
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
		musicService.save(music);
		System.out.println("数据源1 音乐信息入库完成...........");

		System.out.println("数据源2 音乐信息入库开始...........");
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
		musicBackupService.saveBackupMusic(musicbackup);
		System.out.println("数据源2 音乐信息入库完成...........");
		

	}

	/**
	 * 在每个测试方法之后执行
	 */
	@After
	public void lastDistory(){

		System.out.println("测试结束****************");

	}

}