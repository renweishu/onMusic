package com.avicit.onlinemusic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avicit.framework.util.ListUtils;
import com.avicit.onlinemusic.dao.MessageServiceDaoMapper;
import com.avicit.onlinemusic.entity.Message;
import com.avicit.onlinemusic.service.MessageService;
import com.avicit.onlinemusic.vo.MessageVo;

@Service("messageServiceImpl")
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageServiceDaoMapper messageServiceDaoMapper;


	public List<MessageVo> list(int id) {
        // 获取用户相关联的未阅读消息
		return ListUtils.transform(messageServiceDaoMapper.listMessage(id),MessageVo.class);
	}


	public void update(Message message) throws Exception {
		messageServiceDaoMapper.updateMessage(message);
	}


	public Integer save(Message message) throws Exception {
		return messageServiceDaoMapper.saveMessage(message);
	}

	
	public void delete(Message message) throws Exception {
		messageServiceDaoMapper.deleteMessage(message);
	}
	

	public Message findById(Integer id) {
		return messageServiceDaoMapper.findByIdMessage(id);

	}
}
