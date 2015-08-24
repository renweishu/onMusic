package com.avicit.onlinemusic.service.impl.second;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avicit.onlinemusic.daotwo.MusicBackupServiceDaoMapper;
import com.avicit.onlinemusic.entitytwo.MusicBackup;
import com.avicit.onlinemusic.service.second.MusicBackupService;

/**
 * 第二数据源使用
 * @author Administrator
 *
 */
@Service("musicBackupServiceImpl")
public class MusicBackupServiceImpl implements MusicBackupService {

	@Autowired
	private MusicBackupServiceDaoMapper musicBackupServiceDaoMapper;

	public Integer saveBackupMusic(MusicBackup musicbackup) throws Exception {
		return musicBackupServiceDaoMapper.saveBackupMusic(musicbackup);
	}


}
