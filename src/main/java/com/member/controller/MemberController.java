package com.member.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.member.bean.MemberDTO;
import com.member.service.MemberService;

@Controller
@RequestMapping(value = "/member")
@CrossOrigin
public class MemberController {
	@Autowired
	private MemberService memberService;
	
	@PostMapping(value = "/login")
	@ResponseBody
	public Map<String, String> login(@RequestBody MemberDTO memberDTO) {
		boolean check = memberService.login(memberDTO);
		Map<String, String> map = new HashMap<String, String>();
		if(check) map.put("result", "SUCCESS");
		else map.put("result", "FAIL");
		return map;
	}
}
