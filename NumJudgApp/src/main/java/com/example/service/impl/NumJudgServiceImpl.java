package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.MNum;
import com.example.repository.NumMapper;
import com.example.service.EvenJudgService;
import com.example.service.NumJudgService;
import com.example.service.PrimeJudgService;

@Service
public class NumJudgServiceImpl implements NumJudgService {

	@Autowired
	private NumMapper mapper;
	@Autowired
	private EvenJudgService evenJudgService;
	@Autowired
	private PrimeJudgService primeJudgService;
	
	/** 入力番号登録 */
	@Override
	public void addNum(MNum num) {
		mapper.insertOne(num);
	};
	
	/** 判定結果を返す */
	public String numJudg(int inputNum) {
		String result = "未判定";
		
		if(primeJudgService.primeJudg(inputNum)) {
			result = "素数";
		} else if(evenJudgService.evenJudg(inputNum)) {
			result = "偶数";
		} else {
			result = "奇数";
		};
		
		
		return result;
	}
	
}
