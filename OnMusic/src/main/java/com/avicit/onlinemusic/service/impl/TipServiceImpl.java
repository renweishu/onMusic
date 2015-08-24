package com.avicit.onlinemusic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avicit.framework.util.ListUtils;
import com.avicit.onlinemusic.dao.TipServiceDaoMapper;
import com.avicit.onlinemusic.entity.Tip;
import com.avicit.onlinemusic.service.TipService;
import com.avicit.onlinemusic.vo.TipVo;

@Service("tipServiceImpl")
public class TipServiceImpl implements TipService {

	/*自动注入 tipServiceDao变量名不用严格按照tipServiceDaoMapper写 | 这儿注入是按照类型匹配注入*/
	@Autowired
	private TipServiceDaoMapper tipServiceDao;

	public List<TipVo> list() {

		return ListUtils.transform(tipServiceDao.listTips(),TipVo.class);
	}


	public void update(Tip tip) throws Exception {
		tipServiceDao.updateTip(tip);
	}


	public Integer save(Tip tip) throws Exception {
		return tipServiceDao.saveTip(tip);
	}


	public void delete(Tip tip) throws Exception {
		tipServiceDao.deleteTip(tip);
	}
	

	public Tip findById(Integer id) {
		return tipServiceDao.findByIdTip(id);

	}
}
