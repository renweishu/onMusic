package com.avicit.framework.util.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author mac
 *
 */
@Aspect
public class NotVeryUsefulAspect {
	
	//@Pointcut("execution(* com.avicit.onlinemusic.controller.*Controller.*(..))")
	@Before("execution(* *Execute*(..))")// 这个切入点将匹配任何名为 "indexPageExecute" 的方法的执行：

	public void test(){
		System.out.println("======================================================");
		System.out.println("==                                                  ==");
		System.out.println("==使用@Aspect-web注解方式 实现一个aop                       ==");
		System.out.println("==                                                  ==");
		System.out.println("======================================================");

	}

}
