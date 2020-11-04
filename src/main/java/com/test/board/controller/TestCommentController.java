package com.test.board.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.board.service.TestCommentService;
import com.test.board.vo.TestCommentVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestCommentController {
	@Resource
	private TestCommentService tsService;
	@PostMapping("/tc/new")
	public int insertTestComment(@RequestBody TestCommentVO tc) {
		return tsService.insertTestComment(tc);
	}
}
