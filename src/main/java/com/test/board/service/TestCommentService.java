package com.test.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.test.board.mapper.TestCommentMapper;
import com.test.board.vo.TestCommentVO;

@Service
public class TestCommentService {

	@Resource
	private TestCommentMapper tbMapper;
	
	public List<TestCommentVO> selectTestCommentList(TestCommentVO tb){
		return tbMapper.selectTestCommentList(tb);
	}
	
	public int insertTestComment(TestCommentVO tb) {
		return tbMapper.insertTestComment(tb);
	}

	public TestCommentVO selectTestComment(int tbNum) {
		return tbMapper.selectTestComment(tbNum);
	}
}







