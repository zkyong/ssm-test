package com.zkyong.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zkyong.ssm.mapper.UserTMapper;
import com.zkyong.ssm.model.UserT;
import com.zkyong.ssm.service.UserTService;

@Service
public class UserTServiceImpl implements UserTService {
	@Autowired
	private UserTMapper userTDao;

	public UserT getUserById(int userId) {
		return this.userTDao.selectByPrimaryKey(userId);
	}

}