package com.example.form;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import lombok.Data;

@Data
public class NumJudgForm {
	
	private int id;
	
	@NotNull
	@Max(1000)
	@Min(1)
	private Integer inputNum;	
	private String result;

}
