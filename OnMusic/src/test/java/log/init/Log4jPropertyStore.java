/*
 * Created on 2006-3-10
 * 
 * Author zhangym
 * 
 * Copyright (C) 2000, 2005, KOAL SOFTWARE.
 */
 
package log.init;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.Properties;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;

/**
 * log4j的configStore
 */
public class Log4jPropertyStore  implements IConfigStore{
    private static Log log = LogFactory.getLog(Log4jPropertyStore.class);
	
	private static IConfigStore m_store;
	private Properties m_properties;
	private String m_fileName;
	
	public static final IConfigStore getInstance(String path) {
		if (m_store == null) {
			m_store = new Log4jPropertyStore(path);
		}
		return  m_store;
	}
	
	protected Log4jPropertyStore(String path) {
	    m_fileName = path;
	    m_properties = new Properties();
	    try{
	        m_properties.load(new FileInputStream(new File(m_fileName)));
            // 通知log4j应用
            new PropertyConfigurator().doConfigure(m_fileName, LogManager.getLoggerRepository());
	    }
	    catch(Exception ex)
	    {
	        ex.printStackTrace();
	    }
	}
	
//    
//    /* (non-Javadoc)
//     * @see koal.kmc.admin.config.store.IConfigStore#getFromStore(koal.kmc.admin.config.ConfigObj)
//     */
//    public void getFromStore(Object cfgObj) {
//      
//        if (cfgObj == null)
//			return;
//			
//		Field[] fields = cfgObj.getClass().getFields();
//		
//		try {
//			for (int i = 0; i < fields.length; i++) {
//				Field field = fields[i];
//				String key = field.getName().replace('_', '.');
//				ConfigObj.setObjField(cfgObj, field, m_properties.getProperty(key), true);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			String err = "初始化日志配置失败[getFromStore]，错误原因：" + e.getMessage();
//			log.error(err, e);
//		}
//
//    }
//
//    /* (non-Javadoc)
//     * @see koal.kmc.admin.config.store.IConfigStore#setToStore(koal.kmc.admin.config.ConfigObj)
//     */
//    public void setToStore(ConfigObj cfgObj) throws Exception {
//        if (cfgObj == null)
//			return;
//		
//		if (!(cfgObj instanceof LogCfg))
//			throw new IllegalArgumentException("参数应该是LogCfg");
//			
//		// 检查日志文件路径是否存在
//		LogCfg logCfg = (LogCfg)cfgObj;
//		File f = new File(logCfg.getLogFileName());
//		File parentDir = new File(f.getParent());
//		if (!parentDir.exists()) {
//			logCfg.setLogFileName(logCfg.log4j_appender_file_File);
//			throw new Exception("日志文件所在路径不存在：" + parentDir.getAbsolutePath());
//		}
//		
//			
//		logCfg.setKeyFromAttribute();
//		Field[] fields = cfgObj.getClass().getFields();
//		
//		for (int i = 0; i < fields.length; i++) {
//			Field field = fields[i];
//			Object value = field.get(cfgObj);
//			
//			if (value != null) { 
//				String key = field.getName().replace('_', '.');
//				m_properties.setProperty(key, value.toString());
//			} 
//		}
//		
//		if(m_properties.getProperty("log4j.appender.file.encoding") == null)
//		{
//		    m_properties.setProperty("log4j.appender.file.encoding","GB2312");
//		}
//		if(m_properties.getProperty("log4j.appender.audit.layout.ConversionPattern") == null)
//		{
//		    m_properties.setProperty("log4j.appender.audit.layout.ConversionPattern" , "%n%m time\\=\"%d{yyyy-MM-dd HH\\:mm\\:ss}\"%n");
//		}
//		if(m_properties.getProperty("log4j.appender.file.layout.ConversionPattern") == null)
//		{
//		    m_properties.setProperty("log4j.appender.file.layout.ConversionPattern","%n time\\=\"%d{yyyy-MM-dd HH\\:mm\\:ss}\" %m%n");
//		}
//		if(m_properties.getProperty("log4j.appender.audit.layout") == null)
//		{
//		    m_properties.setProperty("log4j.appender.audit.layout","org.apache.log4j.PatternLayout");
//		}
//		if(m_properties.getProperty("log4j.appender.file.layout") == null)
//		{
//		    m_properties.setProperty("log4j.appender.file.layout","org.apache.log4j.PatternLayout");
//		}
//		if(m_properties.getProperty("log4j.appender.console.layout") == null)
//		{
//		    m_properties.setProperty("log4j.appender.console.layout","org.apache.log4j.PatternLayout");
//		}
//		if(m_properties.getProperty("log4j.appender.console") == null)
//		{
//		    m_properties.setProperty("log4j.appender.console","org.apache.log4j.ConsoleAppender");
//		}
//		if(m_properties.getProperty("log4j.appender.audit") == null)
//		{
//		    m_properties.setProperty("log4j.appender.audit","org.apache.log4j.net.SyslogAppender");
//		}
//		if(m_properties.getProperty("log4j.appender.file") == null)
//		{
//		    m_properties.setProperty("log4j.appender.file","org.apache.log4j.DailyRollingFileAppender");
//		}
//        if(m_properties.getProperty("log4j.appender.file.DatePattern") == null)
//        {
//            m_properties.setProperty("log4j.appender.file.DatePattern","'.'yyyy-MM-dd");
//        }
//        if(m_properties.getProperty("log4j.appender.file.Append") == null)
//        {
//            m_properties.setProperty("log4j.appender.file.Append","true");
//        }
//        if(m_properties.getProperty("log4j.appender.file.Threshold") == null)
//        {
//            m_properties.setProperty("log4j.appender.file.Threshold","INFO");
//        }
//		if(m_properties.getProperty("log4j.appender.console.layout.ConversionPattern") == null)
//		{
//		    m_properties.setProperty("log4j.appender.console.layout.ConversionPattern","%p [%t] %c{2} (%M\\:%L) - %m%n");
//		}
//			
//		
//    }
//
//    /* (non-Javadoc)
//     * @see koal.kmc.admin.config.store.IConfigStore#save()
//     */
//    public void save() throws Exception {
//        m_properties.store(new FileOutputStream(new File(m_fileName)), "Log4j config");
//        
//        // 通知log4j更新
//		new PropertyConfigurator().doConfigure(m_fileName, LogManager.getLoggerRepository());
//    }

   
}
