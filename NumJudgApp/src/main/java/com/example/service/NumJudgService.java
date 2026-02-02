package com.example.service;

import com.example.model.MNum;

public interface NumJudgService {
	
	/** 入力番号登録 */
	public void addNum(MNum num);

	/** 判定結果を返す */
	public String numJudg(int inputNum, MNum mNum);
	
	/** 前回数値取得 */
	public MNum getOne();
	
}
