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

import com.avicit.framework.util.DproCommonConsts;
import com.avicit.framework.util.DproMessageConsts;
import com.avicit.framework.util.exception.ValidationException;
import com.avicit.framework.util.exception.message.BLogicMessage;
import com.avicit.framework.util.exception.message.BLogicMessages;

/**
 * [功能]：出路数据库写入异常-
 * [说明]：1.如更新数据库，数据被其他客服端锁表 2.插入数据库字段过长出错
 *
 * @author   2015/09/01 马超
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
                BLogicMessages messages = new BLogicMessages();
                messages.add(DproCommonConsts.MESSAGE_TYPE, new BLogicMessage(DproMessageConsts.A0281));
                throw new ValidationException(messages);
            	
            }
            throw e;
        		
		}
		return result;   
		
	}
}
