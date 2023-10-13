package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.SyainInfoMapper;
import com.example.entity.TSyain;

@Service
public class EditService {
	
	@Autowired
	private SyainInfoMapper syainInfoMapper;
	
	
	public TSyain findByUserId(String userId) {
		
		return syainInfoMapper.findByUserId(userId);
	}

}
