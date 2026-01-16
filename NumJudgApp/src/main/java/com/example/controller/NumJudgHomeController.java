package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NumJudgHomeController {
	
	/** 数値入力画面表示 */
	@GetMapping("/home")
	public String getHome() { 
		return "home";
	}
	
	/** 数値登録処理 */
	@PostMapping("/result")
	public String postNumJudge() {
		
		//登録処理
		
		
		// 結果画面にリダイレクト
		return "redirect:/result";
	}
}
