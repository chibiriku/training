package com.example.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UpdateForm extends SignupForm implements Serializable{
	private String userId;
}
