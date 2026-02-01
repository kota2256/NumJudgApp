package com.example.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.form.NumJudgForm;
import com.example.model.MNum;
import com.example.service.NumJudgService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class NumJudgHomeController {
	
	@Autowired
	ModelMapper modelMapper;
	@Autowired
	NumJudgService service;
	
	/** 数値入力画面表示 */
	@GetMapping("/home")
	public String getHome(@ModelAttribute NumJudgForm form) { 		//空のモデルをセット
		return "home";
	}
	
	/** 数値登録処理 */
	@PostMapping("/home")
	public String postNumJudg(@ModelAttribute @Validated NumJudgForm form, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		//入力数値のバリデーション
		if (bindingResult.hasErrors()) {
			return getHome(form);
		}
		
		//判定結果を取得
		String result = service.numJudg(form.getInputNum());
		
		//MNumに値を詰める
		MNum num = new MNum();
		num.setInputNum(form.getInputNum());
		num.setResult(result);
		//db登録
		service.addNum(num);
		
		//リダイレクト先に値を渡す
		form = modelMapper.map(num, NumJudgForm.class);
		redirectAttributes.addFlashAttribute("numJudgForm", form);
		
		log.info(form.toString());
		
		// 結果画面に遷移
		return "redirect:/result";
	}
}
