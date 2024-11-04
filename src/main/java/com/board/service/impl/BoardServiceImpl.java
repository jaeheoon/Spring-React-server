package com.board.service.impl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.board.bean.BoardDTO;
import com.board.dao.BoardDAO;
import com.board.service.BoardService;
import com.member.bean.MemberDTO;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAO boardDAO;
	
	@Autowired
	private HttpSession session;

	@Override
	public boolean boardWrite(BoardDTO boardDTO) {
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("memberDTO");
		boardDTO.setId(memberDTO.getId());
		boardDTO.setName(memberDTO.getName());
		int su = boardDAO.boardWrite(boardDTO);
		if(su > 0) {
			boardDAO.refUpdate();
			return true;
		}
		else return false;
	}

	@Override
	public List<BoardDTO> getBoardList() {
		return boardDAO.getBoardList();
	}

}
