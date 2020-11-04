package com.test.board.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.board.service.TestBoardService;
import com.test.board.vo.ResultVO;
import com.test.board.vo.TestBoardVO;

@RestController
public class TestBoardController {
	@Resource
	private TestBoardService tbService;
	@GetMapping("/tbs")
	public List<TestBoardVO> getTestBoards(TestBoardVO tb){
		return tbService.selectTestBoardList(tb);
	}
	@PostMapping("/tb/new")
	public int insertTestBoard(@RequestBody TestBoardVO tb) {
		return tbService.insertTestBoard(tb);
	}
	@GetMapping("/tb/{tbNum}")
	public TestBoardVO getTestBoard(@PathVariable int tbNum){
		return tbService.selectTestBoard(tbNum);
	}
	@GetMapping("/tb/{tbNum}/tcs")
	public ResultVO getTestBoardWithTcList(TestBoardVO tb){
		return tbService.getTestBoardWithTcList(tb);
	}
}





