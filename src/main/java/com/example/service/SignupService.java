package com.example.service;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.SyainInfoMapper;
import com.example.dto.SignupForm;

@Service
public class SignupService {
	
	@Autowired
	private SyainInfoMapper SyainInfoMapper;
	
	public void syainAdd(SignupForm form) {
		SyainInfoMapper.syainAdd(form);	
	}
	
	private Integer counter() {
		int num = SyainInfoMapper.counter();
		num = num + 1;
		return num;
	}
	
	private String date() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
		return dateFormat.format(new Date());
	}
	
	public String generater() {
		String year = date();
		String countChange = String.format("%03d", counter());
		return year + countChange;
	}
	

}
