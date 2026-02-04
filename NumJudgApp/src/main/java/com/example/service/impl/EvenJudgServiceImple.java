package com.example.service.impl;

import org.springframework.stereotype.Service;

import com.example.service.EvenJudgService;

@Service
public class EvenJudgServiceImple implements EvenJudgService {
	/** 偶数奇数判定 */
	public boolean evenJudg(int inputNum) {
		boolean result = false;
		if(inputNum % 2 == 0) {
			result = true;
		}
		return result;
	};
}
