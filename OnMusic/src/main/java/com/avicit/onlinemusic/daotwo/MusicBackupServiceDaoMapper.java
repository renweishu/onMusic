package com.avicit.onlinemusic.daotwo;

import com.avicit.onlinemusic.entitytwo.MusicBackup;


/**
 * 第二数据源 使用
 * @author Administrator
 *
 */
public interface MusicBackupServiceDaoMapper {
	

	/**
	 * 保存记录
	 * @param 
	 * @return
	 */
	public Integer saveBackupMusic(MusicBackup MusicBackup) ;

	

}
