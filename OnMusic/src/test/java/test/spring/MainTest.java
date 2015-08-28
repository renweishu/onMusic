package test.spring;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainTest {

	private Person person;

	@Before
	public void before(){                                                                    
		
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-test.xml"});
		person = (Person) context.getBean("student");
	}


	/**
	 * 测试aspactj的功能实现
	 * 
	 */
	@Test
	public void test1(){
		person.sayBye();
		person.doExecute();
	}
}
