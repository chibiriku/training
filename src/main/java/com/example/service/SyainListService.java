package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.SyainInfoMapper;
import com.example.entity.TSyain;

@Service
public class SyainListService {
	
	@Autowired
	private SyainInfoMapper syainInfoMapper;
	
	public List<TSyain> syainList(){
		return syainInfoMapper.syainList();
	}
	
	public List<TSyain>search(String name){
		return syainInfoMapper.search(name);
	}

}
