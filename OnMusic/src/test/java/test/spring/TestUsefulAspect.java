package test.spring;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author mac
 *
 */
@Aspect
public class TestUsefulAspect {

	//@Pointcut("execution(* com.avicit.onlinemusic.controller.*Controller.*(..))")
	@Before("execution(* sayBye (..))")// 这个切入点将匹配任何名为 "indexPageExecute" 的方法的执行：
	//@Before("within(test.spring.Student)")  
	public void test(){
		System.out.println("======================================================");
		System.out.println("==测试bymac                                          ==");
		System.out.println("==@Aspect-测试                                                                                                                      ==");
		System.out.println("==2015-08-28                                        ==");
		System.out.println("======================================================");

	}

}
