package com.test.board.vo;

import java.util.List;

import lombok.Data;

@Data
public class ResultVO {
	private TestBoardVO tb;
	private List<TestCommentVO> tcList;
}
