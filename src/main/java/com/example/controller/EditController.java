package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dto.UpdateForm;
import com.example.entity.TSyain;
import com.example.service.EditService;

@Controller
@RequestMapping("/rpc")
public class EditController {
	
	@Autowired
	private EditService editService;
	
	@GetMapping("/{userId}/edit")
    public String displayEdit(@PathVariable String userId, Model model) {
        TSyain syain = editService.findByUserId(userId);
        UpdateForm syainUpdate = new UpdateForm();
        syainUpdate.setUserId(syain.getUserId());
        syainUpdate.setName(syain.getName());
        syainUpdate.setBirthday(syain.getBirthday());
        model.addAttribute("syainUpdate", syainUpdate);
        return "/edit";
    }

}
