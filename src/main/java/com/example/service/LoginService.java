package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.SyainInfoMapper;
import com.example.dto.LoginForm;
import com.example.entity.TSyain;

@Service
public class LoginService {
	
	@Autowired
	private SyainInfoMapper syainInfoMapper;
	
	public TSyain login(LoginForm loginForm) {
		return syainInfoMapper.login(loginForm);
	}

}
