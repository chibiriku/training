package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dto.LoginForm;
import com.example.entity.TSyain;
import com.example.service.LoginService;

@Controller
@RequestMapping("/rpc")
public class LoginController {
	
	
	@Autowired
	private LoginService loginService;
	
	//ログインフォームの表示
	@GetMapping("/login")
	public String getlogin (Model model) {
		model.addAttribute("loginForm", new LoginForm()); 
		return "/syain/login";
	}
	
	//ログイン機能
	@PostMapping("/login")
	public String postlogin(@ModelAttribute LoginForm form ,Model model) {
		loginService.login(form);
		TSyain user = loginService.login(form);
	    if (user != null) {
	    	// ログインが成功してユーザ情報が取得できた場合
	        return "redirect:/rpc/list";
	    } else {
	        // ログインが失敗した場合、ログイン画面にリダイレクト
	        return "redirect:/rpc/login";
	    }
	}
	

}
