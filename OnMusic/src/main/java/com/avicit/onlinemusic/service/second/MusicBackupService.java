package com.avicit.onlinemusic.service.second;

import com.avicit.onlinemusic.entitytwo.MusicBackup;

/**
 * 第二数据源使用 
 * @author Administrator
 *
 */
public interface MusicBackupService {

	
	public Integer saveBackupMusic(MusicBackup musicbackup) throws Exception;
	

}
