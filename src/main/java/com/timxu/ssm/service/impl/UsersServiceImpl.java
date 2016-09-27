package com.timxu.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.timxu.ssm.domain.Users;
import com.timxu.ssm.mapper.UsersMapper;
import com.timxu.ssm.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersMapper usersMapper;

	public void insert(Users u) {
		usersMapper.insert(u);
	}

}