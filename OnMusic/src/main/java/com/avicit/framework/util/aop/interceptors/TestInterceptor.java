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
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;

/**
 * [機 能]：排他制御
 * [説 明]：データレコード例外が発生した場合、Validation例外とし、
 *          排他エラーをセットする。
 *
 * @author  [新規作成] 2013/02/26 NDC@3HB2B 張軼胥
 * @version $Revision$
 */
public class TestInterceptor implements MethodInterceptor {
	/**
	 * 日志 两种测试
	 */
	private static org.slf4j.Logger logger = LoggerFactory.getLogger(TestInterceptor.class);


	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("======================================================");
		System.out.println("==                                                  ==");
		System.out.println("==使用拦截器的方式实现一个aop                               ==");
		System.out.println("==                                                  ==");
		System.out.println("======================================================");


		Object result = null;
		try {
			result = invocation.proceed();
			String info = invocation.getMethod().getDeclaringClass()+ "." +   
					invocation.getMethod().getName() + "()";  
			System.out.println("使用拦截器的方式实现一个aop："+info);  


			// CHECKSTYLEOFF
		} catch (Throwable e) {

            // 插入数据库 数据长度过长
            if (e instanceof DataIntegrityViolationException) {
            	logger.info("插入数据出现异常:"+e.getMessage());
//                BLogicMessages messages = new BLogicMessages();
//                messages.add(DproCommonConsts.MESSAGE_TYPE, new BLogicMessage(DproMessageConsts.A0281));
//                throw new ValidationException(messages);
            	
            }
            throw e;
        
			
		}
		return result;   
		
	}
}
