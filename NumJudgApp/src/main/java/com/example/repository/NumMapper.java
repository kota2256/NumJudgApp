package com.example.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.model.MNum;

@Mapper
public interface NumMapper {

	/** ユーザー登録 */
	public int insertOne(MNum num);
}
