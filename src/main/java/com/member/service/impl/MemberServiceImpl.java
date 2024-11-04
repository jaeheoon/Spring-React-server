package com.member.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.member.bean.MemberDTO;
import com.member.dao.MemberDAO;
import com.member.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberDAO;
	
	@Autowired
	private HttpSession session;

	@Override
	public boolean login(MemberDTO memberDTO) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", memberDTO.getId());
		map.put("pwd", memberDTO.getPwd());
		MemberDTO getMember = memberDAO.login(map);
		if (getMember != null) {
			session.setAttribute("memberDTO", getMember);
			return true;
		}
		else return false;
	}
	
}
