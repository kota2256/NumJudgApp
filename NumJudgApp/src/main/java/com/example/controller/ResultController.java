package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.form.NumJudgForm;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class ResultController {
	@GetMapping("/result")
	public String getResult(@ModelAttribute("unmJudgForm") NumJudgForm form) {
		
		log.info(form.toString());
		return "result";
	}
}
