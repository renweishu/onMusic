package com.avicit.onlinemusic.dao;

import java.util.List;

import com.avicit.onlinemusic.entity.Music;

/** 单纯测试用....测试多表关联查询
 * <br>用户-匹配上传音乐-在匹配音乐对应评论
 * @author Administrator
 *
 */
public interface MusicServiceDaoMapper {
	
	/**
	 * 倒序获取最近多条记录
	 * 如:select * from Music ORDER BY id DESC
	 * @param 
	 * @return
	 */
	public List<Music> listMusic();
	
	/**
	 * 根据参数 倒序获取最近多条记录（根据音乐ID范围）params=('1','2')
	 * 如:select * from Music where id in ("+params+") ORDER BY id DESC
	 * @param 
	 * @return
	 */
	public List<Music> listMusicByParam(String[] params);

	/**
	 * 更新记录
	 * @param 
	 * @return
	 */
	public void updateMusic(Music music);

	/**
	 * 保存记录
	 * @param 
	 * @return
	 */
	public Integer saveMusic(Music music) ;

	/**
	 * 删除记录
	 * @param 
	 * @return
	 */
	public void deleteMusic(Music music);
	
	
	/**
	 * 获取单条记录
	 * @param 
	 * @return
	 */
	public Music findByIdMusic(Integer musicId);

}
