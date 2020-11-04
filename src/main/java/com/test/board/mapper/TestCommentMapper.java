package com.test.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.test.board.vo.TestCommentVO;

@Mapper
public interface TestCommentMapper {
	public List<TestCommentVO> selectTestCommentList(TestCommentVO tb);
	public int insertTestComment(TestCommentVO tb);
	public TestCommentVO selectTestComment(int tbNum);
}
