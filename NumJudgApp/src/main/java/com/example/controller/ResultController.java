package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.form.NumJudgForm;
import com.example.model.MNum;
import com.example.service.NumJudgService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ResultController {
	
	@Autowired
	NumJudgService service;
	
	@GetMapping("/result")
	public String getResult(Model model, @ModelAttribute("unmJudgForm") NumJudgForm form) {
		
		log.info(form.toString());
		
		List<MNum> numList = service.getFive();
		model.addAttribute("numList", numList);
		
		return "result";
	}
	
	@PostMapping("/home")
	public String backHome() {
		return "redirect:/home";
	}
}
