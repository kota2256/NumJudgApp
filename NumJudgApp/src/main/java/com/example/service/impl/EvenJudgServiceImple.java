package com.example.service.impl;

import org.springframework.stereotype.Service;

import com.example.service.EvenJudgService;

@Service
public class EvenJudgServiceImple implements EvenJudgService {
	
	/** 偶数判定 */
	@Override
	public boolean evenJudg(int inputNum) {
		boolean result = true;
		if(inputNum % 2 != 0) {
			result = false;		//奇数
		}
		return result;
	};
}
