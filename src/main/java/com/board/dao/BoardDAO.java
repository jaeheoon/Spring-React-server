package com.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.bean.BoardDTO;

@Mapper
public interface BoardDAO {
	public int boardWrite(BoardDTO boardDTO);
	public List<BoardDTO> getBoardList();
	public void refUpdate();
}
