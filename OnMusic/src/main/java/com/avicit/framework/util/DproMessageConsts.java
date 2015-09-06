/*
 * @(#)DproMessageConsts.java
 *
 * Copyright(c) 2013 NTTDATA Corporation
 *
 * This software is the confidential and proprietary information
 * of NTTData. ("Confidential Information").
 */
package com.avicit.framework.util;

/** This file was automatically generated. */
public final class DproMessageConsts {
    //**************************************************************
    // **                                                         **
    // 数据库操作
    // **                                                         **
    //**************************************************************
  
    /**
     * 数据库写操作<br>
     * <strong>A0280 = 当前数据被其他数据库客服端上锁-无法更新数据。</strong>
     */
    public static final String A0280 = "A0280";
    /**
     * 数据库写操作<br>
     * <strong>A0281 = 对数据库写操作出错-某个字段过长</strong>
     */
    public static final String A0281 = "A0281";
    
    
    //**************************************************************
    // **                                                         **
    // WEB系验证
    // **                                                         **
    //**************************************************************
    /**
     * 用户登录验证<br>
     * <strong>user.require.name = 用户名不能为空---。</strong>
     */
    public static final String VALID_REQUIRE_NAME = "user.require.name";
    /**
     * 用户登录验证<br>
     * <strong>user.require.password = 密码不能为空---。</strong>
     */
    public static final String VALID_REQUIRE_PWD = "user.require.password";
    
    /**
     * 用户登录验证<br>
     * <strong>user.all.info = 用户名或密码不能为空。</strong>
     */
    public static final String VALID_USER_ALL = "user.all.info";
    /**
     * 用户登录验证<br>
     * <strong>user.name=当前用户不存在，请确认。</strong>
     */
    public static final String VALID_USER_NAME = "user.name";
    /**
     * 用户登录验证<br>
     * <strong>user.password=当前密码不正确，请重新登录。</strong>
     */
    public static final String VALID_USER_PASSWORD = "user.password";

}
