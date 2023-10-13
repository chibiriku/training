package com.example.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SignupForm {
	
	private String userId;
	
	private String name;
	
	@DateTimeFormat(pattern="yyyyMMdd")
	private Date birthday;
	
	private Integer gender;
	
	private Integer role;
	
	private Integer idCount;

}
