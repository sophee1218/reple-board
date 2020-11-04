package com.test.board.vo;

import java.util.List;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("tb")
public class TestBoardVO {
	private Integer tbNum;
	private String tbTitle;
	private String tbContent;
	private String tbWriter;
	private String tbCredat;
	private List<TestCommentVO> tcList;
}
