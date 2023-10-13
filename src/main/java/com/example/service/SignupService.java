package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.SyainInfoMapper;
import com.example.dto.SignupForm;

@Service
public class SignupService {
	
	@Autowired
	private SyainInfoMapper SyainInfoMapper;
	
	@Autowired
	private IdGeneraterService idGeneraterService;
	
	public void syainAdd(SignupForm form) {
		SyainInfoMapper.syainAdd(form);	
	}
	
	public String generater() {
		String year = idGeneraterService.date();
		String countChange = String.format("%03d", idGeneraterService.counter());
		return year + countChange;
	}
	

}
