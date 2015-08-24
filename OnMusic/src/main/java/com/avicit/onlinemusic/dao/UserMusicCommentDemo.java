package com.avicit.onlinemusic.dao;

import java.util.List;

import com.avicit.onlinemusic.entity.Music;

/** 单纯测试用....测试多表关联查询
 * <br>用户-匹配上传音乐-在匹配音乐对应评论
 * @author Administrator
 *
 */
public interface UserMusicCommentDemo {
	
	
	/**
	 * <br>
	 * 1.查询单个音乐信息信息
	 * 2.关联查询出音乐的评论信息
	 * @param user
	 * @return
	 */
	public Music selectOne1Music(int musicId);
	
	/**
	 * <br>
	 * 1.查询所有音乐信息信息
	 * 2.关联查询出音乐的评论信息
	 * @param user
	 * @return
	 */
	public List<Music> selectList1Music();
	
	/**
	 * <br>
	 * 1.查询单个音乐信息信息
	 * 2.关联查询出音乐的评论信息
	 * @param user
	 * @return
	 */
	public Music selectOne2Music(int musicId);
	
	/**
	 * <br>
	 * 1.查询所有音乐信息信息
	 * 2.关联查询出音乐的评论信息
	 * @param user
	 * @return
	 */
	public List<Music> selectList2Music();


}
