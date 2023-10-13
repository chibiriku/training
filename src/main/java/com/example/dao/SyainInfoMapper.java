package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.SignupForm;
import com.example.entity.TSyain;

@Mapper
public interface SyainInfoMapper {
	
	void syainAdd(SignupForm form);
	
	Integer counter();
	
	List<TSyain> syainList();
	
	TSyain findByUserId(String userId);
	
}
