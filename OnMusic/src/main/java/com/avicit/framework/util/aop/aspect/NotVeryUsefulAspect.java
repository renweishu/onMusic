package com.avicit.framework.util.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author mac
 *
 */
@Aspect
public class NotVeryUsefulAspect {
	
	//@Pointcut("execution(* com.avicit.onlinemusic.controller.*Controller.*(..))")
	@Pointcut("execution（* indexPageExecute (..))")// 这个切入点将匹配任何名为 "indexPageExecute" 的方法的执行：

	public void test(){
		System.out.println("======================================================");
		System.out.println("==                                                  ==");
		System.out.println("==@Aspect-测试                                                                                                                      ==");
		System.out.println("==                                                  ==");
		System.out.println("======================================================");

	}

}
