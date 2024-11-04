package com.member.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.member.bean.MemberDTO;

@Mapper
public interface MemberDAO {
	public MemberDTO login(Map<String, String> map);
}
