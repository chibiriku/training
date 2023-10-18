package com.example.entity;

import java.util.Date;

import lombok.Data;

@Data
public class TSyain {
	private String userId;
    private Long id;
    private String name;
    private String password;
    private Date birthday;
    private Date entryDate;
    private Date updateDate;
    private Date deleteTime;
    private Integer role;
    private Integer gender;
}
