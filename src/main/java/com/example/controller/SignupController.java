package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.dto.SignupForm;
import com.example.service.SignupService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/rpc")
class SignupController {
	
	@Autowired
	private SignupService signupService;
	
	@GetMapping("/signup")
	public String getSignup(Model model) {
		model.addAttribute("form" ,new SignupForm());
		return "/signup";
	}
	
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute SignupForm form, Model model, RedirectAttributes redirectAttributes) {
		form.setUserId(signupService.generater());
		signupService.syainAdd(form);
		redirectAttributes.addFlashAttribute("syain",form);
		return "redirect:/rpc/confirm";
	}
	
	@GetMapping("/confirm")
	public String confirmDisplay(HttpServletRequest request, Model model) {
		
		SignupForm syain = (SignupForm) model.getAttribute("syain");
		model.addAttribute("syain",syain);
		
		return "/confirm";
	}

}
