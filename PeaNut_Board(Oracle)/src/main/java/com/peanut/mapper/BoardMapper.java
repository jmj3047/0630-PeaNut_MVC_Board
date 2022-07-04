package com.peanut.mapper;

import com.peanut.model.BoardVO;

public interface BoardMapper { //mybatis를 사용하기 위해서 어떤 함수를 사용할건지에 대한 걸 적어줌
	/* 글 등록 */
    public void enroll(BoardVO board);
}
