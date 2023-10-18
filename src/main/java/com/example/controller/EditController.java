package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dto.UpdateForm;
import com.example.entity.TSyain;
import com.example.service.EditService;

@Controller
@RequestMapping("/rpc")
public class EditController {
	
	@Autowired
	private EditService editService;
	
	//編集画面の表示
	@GetMapping("/{userId}/edit")
    public String displayEdit(@PathVariable String userId, Model model) {
        TSyain syain = editService.findByUserId(userId);
        UpdateForm syainUpdate = new UpdateForm();
        syainUpdate.setUserId(syain.getUserId());
        syainUpdate.setName(syain.getName());
        syainUpdate.setPassword(syain.getPassword());
        syainUpdate.setGender(syain.getGender());
        syainUpdate.setBirthday(syain.getBirthday());
        model.addAttribute("syainUpdate", syainUpdate);
        return "update/edit";
    }
	
	//更新処理
	@PostMapping("/edit")
    public String update(@ModelAttribute UpdateForm updateForm, Model model) {
		editService.update(updateForm);
		model.addAttribute("updateSyain",updateForm);
        return "/update/confirm";
    }
	
	//削除処理
	@PostMapping("/delete")
	public String delete(@ModelAttribute UpdateForm updateForm, Model model) {
		editService.delete(updateForm);
		return "redirect:/rpc/list";
	}

}
