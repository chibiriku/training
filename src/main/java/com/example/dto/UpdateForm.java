package com.example.dto;

import java.util.Date;

import lombok.Data;

@Data
public class UpdateForm {
	private String userId;
	private String name;
	private Integer role;
    private Integer gender; 
	private Date updateData;
	private Date birthday;

}
