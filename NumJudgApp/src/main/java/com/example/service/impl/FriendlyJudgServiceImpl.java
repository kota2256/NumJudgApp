package com.example.service.impl;

import org.springframework.stereotype.Service;

import com.example.model.MNum;
import com.example.service.FriendlyJudgService;

@Service
public class FriendlyJudgServiceImpl implements FriendlyJudgService {
	
	/** 友愛数判定 */
	@Override
	public boolean friendlyJudg(int inputNum, MNum mNum) {
		//前回数値と今回数値の約数の和を求める
		int sumPreNumDiv = sumDivisors(mNum.getInputNum());
		int sumInputNumDiv = sumDivisors(inputNum);
		
		//友愛数判定を行う
		boolean result = true;
		if (sumPreNumDiv != sumInputNumDiv) {
			result = false;
		}
		return result;
	}
	
	/** 自身を含む約数の和の計算 */
	private int sumDivisors(int num) {
		int sum = 1;	
		for(int i = 2; i <= num; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
}
