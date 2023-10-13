package com.example.dao;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.SignupForm;

@Mapper
public interface SyainInfoMapper {
	
	void syainAdd(SignupForm form);
	
	Integer counter();
	
}
