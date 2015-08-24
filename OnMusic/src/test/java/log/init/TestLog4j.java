package log.init;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.PropertyConfigurator;
import org.slf4j.LoggerFactory;
public class TestLog4j {
	public static void main(String[] args) {
		String path = "C:/Users/Administrator/git2/OnMusic/target/classes/"+"conf/log4j/log4j.properties";
		// 获取class路径
		System.out.println(path.replace("file:/", ""));
		// 初始化log4j配置文件
		PropertyConfigurator.configure(path.replace("file:/", "")); 
		// 单独LOG4J方式取得logger
		org.apache.log4j.Logger log4j = org.apache.log4j.Logger.getLogger(TestLog4j.class); 
		log4j.info("单独LOG4J方式测试");
		//  commons-logging+log4j组合方式取得logger
		Log commonlog = LogFactory.getLog(TestLog4j.class);
		commonlog.info("commons-logging+log4j组合方式测试");
		//  slf4j+log4j组合使用模式：方式取得logger
		org.slf4j.Logger  logger = LoggerFactory.getLogger(TestLog4j.class);
		logger.info("slf4j+log4j组合使用模式测试");
	}

}
