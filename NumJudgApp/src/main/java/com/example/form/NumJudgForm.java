package com.example.form;

import jakarta.validation.constraints.NotNull;

import lombok.Data;

@Data
public class NumJudgForm {
	
	private int id;
	@NotNull
	private int inputNum;	
	private String result;

}
