package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dto.SignupForm;
import com.example.service.SignupService;

@Controller
@RequestMapping("/rpc")
class SignupController {
	
	@Autowired
	private SignupService signupService;
	
	//サインアップフォームの表示
	@GetMapping("/signup")
	public String getSignup(Model model) {
		model.addAttribute("form" ,new SignupForm());
		return "/signup/signup";
	}
	
	//登録機能
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute SignupForm form, Model model) {
		form.setUserId(signupService.generater());
		signupService.syainAdd(form);
		model.addAttribute("syain", form);
		return "/signup/confirm";
	}
}
