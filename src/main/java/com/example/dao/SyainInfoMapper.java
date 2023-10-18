package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.dto.LoginForm;
import com.example.dto.SignupForm;
import com.example.dto.UpdateForm;
import com.example.entity.TSyain;

@Mapper
public interface SyainInfoMapper {
	
	void syainAdd(SignupForm form);
	
	Integer counter();
	
	List<TSyain> syainList();
	
	TSyain findByUserId(String userId);
	
	void update(UpdateForm updateForm);
	
	void delete(UpdateForm updateForm);
	
	List<TSyain> search(String name);
	
	TSyain login(LoginForm loginForm);
	
}
