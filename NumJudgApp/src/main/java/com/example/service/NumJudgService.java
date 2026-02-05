package com.example.service;

import java.util.List;

import com.example.model.MNum;

public interface NumJudgService {
	
	/** 入力番号登録 */
	void addNum(MNum num);
	
	/** 5件取得 */
	List<MNum> getFive();

	/** 判定結果を返す */
	String numJudg(int inputNum, MNum mNum);
	
	/** 前回数値取得 */
	MNum getOne();
	
}
