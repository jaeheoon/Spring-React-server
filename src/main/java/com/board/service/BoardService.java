package com.board.service;

import java.util.List;

import com.board.bean.BoardDTO;

public interface BoardService {
	public boolean boardWrite(BoardDTO boardDTO);
	public List<BoardDTO> getBoardList();
}
