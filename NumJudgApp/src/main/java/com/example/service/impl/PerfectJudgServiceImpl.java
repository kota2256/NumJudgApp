package com.example.service.impl;

import org.springframework.stereotype.Service;

import com.example.service.PerfectJudgService;

@Service
public class PerfectJudgServiceImpl implements PerfectJudgService {
	
	/** 完全数判定 */
	@Override
	public boolean perfectJudg(int inputNum) {
		boolean result = true;
		//約数の和を計算
		int sum = sumDivisors(inputNum);
		// 入力値と約数の合計が一致するか判定
		if (sum != inputNum) {
			result = false;
		}
		return result;
	}
	
	/** 自身を除く約数の和の計算 */
	private int sumDivisors(int num) {
		int sum = 1;		// 1は全ての数字の約数
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
