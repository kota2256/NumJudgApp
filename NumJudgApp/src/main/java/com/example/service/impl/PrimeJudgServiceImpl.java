package com.example.service.impl;

import org.springframework.stereotype.Service;

import com.example.service.PrimeJudgService;

@Service
public class PrimeJudgServiceImpl implements PrimeJudgService {

	/** 素数判定 */
	@Override
	public boolean primeJudg(int inputNum) {
		boolean result = true;
		for (int i = 2 ; i < inputNum; i++) {		//2からinputNum-1までの数字で割り切れるかどうかを判定
			if (inputNum % i == 0) {
				result = false;		//割り切れる数字があった場合、result変数をfalseに設定
				break;		//for文を抜け出す
			}
		}
		
		return result;
	};
}
