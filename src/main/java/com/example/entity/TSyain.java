package com.example.entity;

import java.util.Date;

import lombok.Data;

@Data
public class TSyain {
	private String userId;
    private Long id;
    private String name;
    private Date birthday;
    private Date entryDate;
    private Date updateDate;
    private Integer role;
    private Integer gender;
}
