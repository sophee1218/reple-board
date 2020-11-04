package com.test.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.board.vo.TestBoardVO;

@Mapper
public interface TestBoardMapper {

	public List<TestBoardVO> selectTestBoardList(TestBoardVO tb);
	public int insertTestBoard(TestBoardVO tb);
	public TestBoardVO selectTestBoard(int tbNum);
}
