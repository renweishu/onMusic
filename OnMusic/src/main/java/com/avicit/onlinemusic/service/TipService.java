package com.avicit.onlinemusic.service;

import java.util.List;

import com.avicit.onlinemusic.entity.Tip;
import com.avicit.onlinemusic.vo.TipVo;

public interface TipService {
	
	public List<TipVo> list();
	
	public void update(Tip tip) throws Exception;
	
	public Integer save(Tip tip) throws Exception;
	
	public void delete(Tip tip) throws Exception;

	public Tip findById(Integer id);

}
