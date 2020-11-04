package com.test.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.board.mapper.TestBoardMapper;
import com.test.board.mapper.TestCommentMapper;
import com.test.board.vo.ResultVO;
import com.test.board.vo.TestBoardVO;
import com.test.board.vo.TestCommentVO;

@Service
public class TestBoardService {

	@Resource
	private TestBoardMapper tbMapper;
	@Resource
	private TestCommentMapper tcMapper;
	
	public List<TestBoardVO> selectTestBoardList(TestBoardVO tb){
		return tbMapper.selectTestBoardList(tb);
	}
	
	public int insertTestBoard(TestBoardVO tb) {
		return tbMapper.insertTestBoard(tb);
	}

	public TestBoardVO selectTestBoard(int tbNum) {
		return tbMapper.selectTestBoard(tbNum);
	}

	public ResultVO getTestBoardWithTcList(TestBoardVO tb) {
		ResultVO rVO = new ResultVO();
		rVO.setTb(tbMapper.selectTestBoard(tb.getTbNum()));
		TestCommentVO tc = new TestCommentVO();
		tc.setTbNum(tb.getTbNum());
		rVO.setTcList(tcMapper.selectTestCommentList(tc));
		return rVO;
	}
}







