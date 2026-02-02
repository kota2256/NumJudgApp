package com.example.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.model.MNum;

@Mapper
public interface NumMapper {

	/** 数値登録 */
	public int insertOne(MNum num);
	
	/** 前回数値取得 */
	public MNum findOne();
	
}
