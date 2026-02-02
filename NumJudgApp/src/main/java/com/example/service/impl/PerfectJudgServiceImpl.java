package com.example.service.impl;

import org.springframework.stereotype.Service;

import com.example.service.PerfectJudgService;

@Service
public class PerfectJudgServiceImpl implements PerfectJudgService {

	/** 完全数判定 */
	public boolean perfectJudg(int inputNum) {
		boolean result = true;
		
		//約数の合計計算 
		int sum = 1;	
		for(int i = 2; i < inputNum; i++) {
			if(inputNum % i == 0) {
				sum += i;
			}
		}
		
		// 入力値と約数の合計が一致するか判定
		if (sum != inputNum) {
			result = false;
		}
		
		return result;
	}
}
