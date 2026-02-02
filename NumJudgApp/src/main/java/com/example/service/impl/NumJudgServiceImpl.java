package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.MNum;
import com.example.repository.NumMapper;
import com.example.service.EvenJudgService;
import com.example.service.FriendlyJudgService;
import com.example.service.NumJudgService;
import com.example.service.PerfectJudgService;
import com.example.service.PrimeJudgService;

@Service
public class NumJudgServiceImpl implements NumJudgService {

	@Autowired
	private NumMapper mapper;
	@Autowired
	private EvenJudgService evenJudgService;
	@Autowired
	private PrimeJudgService primeJudgService;
	@Autowired
	private PerfectJudgService perfectJudgService;
	@Autowired
	private FriendlyJudgService friendlyJudgService;
	
	/** 入力番号登録 */
	@Override
	public void addNum(MNum num) {
		mapper.insertOne(num);
	};
	
	/** 5件取得 */
	public List<MNum> getFive(){
		return mapper.findFive();
	}
	
	
	/** 前回数値取得 */
	public MNum getOne() {
		return mapper.findOne();
	}
	
	/** 判定結果を返す */
	public String numJudg(int inputNum, MNum mNum) {
		String result = "未判定";
		
		if(friendlyJudgService.friendlyJudg(inputNum, mNum)) {
				result = "友愛数";
			} else if(perfectJudgService.perfectJudg(inputNum)) {
				result = "完全数";
			} else if(primeJudgService.primeJudg(inputNum)) {
				result = "素数";
			} else if(evenJudgService.evenJudg(inputNum)) {
				result = "偶数";
			} else {
				result = "奇数";
		};
		
		return result;
	}
	
}
