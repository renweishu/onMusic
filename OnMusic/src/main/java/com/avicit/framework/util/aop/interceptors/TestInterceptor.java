/*
 * @(#)BLogicAcquireLockExceptionInterceptor.java
 *
 * Copyright(c) 2013 NTTDATA Corporation
 *
 * This software is the confidential and proprietary information
 * of NTTData. ("Confidential Information").
 */
package com.avicit.framework.util.aop.interceptors;



import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * [機 能]：排他制御
 * [説 明]：データレコード例外が発生した場合、Validation例外とし、
 *          排他エラーをセットする。
 *
 * @author  [新規作成] 2013/02/26 NDC@3HB2B 張軼胥
 * @version $Revision$
 */
public class TestInterceptor implements MethodInterceptor {


	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("======================================================");
		System.out.println("==                                                  ==");
		System.out.println("==AOP-MethodInterceptor测试                                                                               ==");
		System.out.println("==                                                  ==");
		System.out.println("======================================================");


		Object result = null;
		try {
			result = invocation.proceed();
			String info = invocation.getMethod().getDeclaringClass()+ "." +   
					invocation.getMethod().getName() + "()";  
			System.out.println(info);  


			// CHECKSTYLEOFF
		} catch (Throwable e) {

			throw e;
		}
		return result;
	}
}
