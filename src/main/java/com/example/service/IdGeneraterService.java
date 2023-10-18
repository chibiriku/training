package com.example.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.SyainInfoMapper;

@Service
public class IdGeneraterService {
	
	@Autowired
	private SyainInfoMapper syainInfoMapper;
	
	//テーブル数を値として取得し＋１する関数
	public Integer counter() {
		int num = syainInfoMapper.counter();
		num = num + 1;
		return num;
	}
	
	//年数四桁+counter関数三桁の0右詰め
	public String date() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
		return dateFormat.format(new Date());
	}

}
