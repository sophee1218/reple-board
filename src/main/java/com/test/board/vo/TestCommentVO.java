package com.test.board.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Data
@Alias("tc")
public class TestCommentVO {
	private Integer tcNum;
	private Integer tbNum;
	private Integer tcDepth;
	private Integer tcParent;
	private String tcContent;
	private String tcWriter;
	private String tcCredat;
}
