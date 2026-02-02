package com.example.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.model.MNum;

@Mapper
public interface NumMapper {

	/** 数値登録 */
	public int insertOne(MNum num);
	
	/** 5件取得 */
	public List<MNum> findFive();
	
	/** 前回数値取得 */
	public MNum findOne();
	
}
