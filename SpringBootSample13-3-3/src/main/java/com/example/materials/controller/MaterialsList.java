package com.example.materials.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.user.model.Materials;
import com.example.mform.MaterialsListForm;

@Controller
@RequestMapping("/materials")
public class MaterialsList {
	
	
	@Autowired
	private ModelMapper modelMapper;
	
	/**資材詳細一覧を表示*/
	@GetMapping("list")
	public String getMaterialsList(@ModelAttribute MaterialsListForm form, Model model) {
		
		Materials materials = modelMapper.map(form, Materials.class);
		
		
		//資材詳細画面を表示
		return "materials/list";
	}
	
	/**資材検索処理*/
	@PostMapping("/list")
	public String postMaterialsList() {
		
		
		
		//ユーザ一覧画面を表示
		return "materials/list";
	}
	
	
	
	
}
