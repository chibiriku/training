package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.TSyain;
import com.example.service.SyainListService;

@Controller
@RequestMapping("/rpc")
public class ListController {
	
	@Autowired
	private SyainListService syainListService;
	
	@GetMapping("/list")
	public String syainList(Model model) {
		List<TSyain> list = syainListService.syainList();
		model.addAttribute("list", list);
		return "/list";
	}

}
