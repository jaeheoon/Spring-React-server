package com.board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.board.bean.BoardDTO;
import com.board.service.BoardService;

//@Controller
@RequestMapping("/board")
@CrossOrigin
//RestController를 사용하면 ResponseBody, Controller를 사용 안해도 된다 
// -> 바로 요청 홈페이지로 보내주기 때문 
@RestController	
public class BoardController {
    @Autowired
    private BoardService boardService;
    
    @PostMapping(value="/write")
    //@ResponseBody
    public Map<String, String> writeBoard(@RequestBody BoardDTO boardDTO) {
        boolean check = boardService.boardWrite(boardDTO);
        Map<String, String> map = new HashMap<String, String>();
        if(check) map.put("result", "SUCCESS");
        else map.put("result", "FAIL");
        return map;
    }
    
    @GetMapping(value="/list")
    //@ResponseBody
    public List<BoardDTO> getBoardList() {
        List<BoardDTO> list = boardService.getBoardList();
        return list;
    }
    
}
