package com.example.materials.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/materials")
public class MaterialsSignupController {
	
	/**資材登録画面を表示*/
	@GetMapping("/signup")
	public String getSignup() {
		
		//資材登録画面に遷移
		return "materials/signup";
	}
	
	

}
