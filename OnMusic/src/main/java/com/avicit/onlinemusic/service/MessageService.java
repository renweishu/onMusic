package com.avicit.onlinemusic.service;

import java.util.List;

import com.avicit.onlinemusic.entity.Message;
import com.avicit.onlinemusic.vo.MessageVo;

public interface MessageService {
	
	public List<MessageVo> list(int id);
	
	public void update(Message message) throws Exception;
	
	public Integer save(Message message) throws Exception;
	
	public void delete(Message message) throws Exception;

	public Message findById(Integer id);

}
