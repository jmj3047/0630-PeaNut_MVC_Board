package com.peanut.mapper;

import java.util.List;

import com.peanut.model.BoardVO;

public interface BoardMapper { //mybatis를 사용하기 위해서 어떤 함수를 사용할건지에 대한 걸 적어줌
	/* 글 등록 */
    public void enroll(BoardVO board);
    
    /* 게시판 목록 */
    public List<BoardVO> getList();
    
    /* 게시판 조회 */
    public BoardVO getPage(int bno);
    
    /* 게시판 수정 */
    public int modify(BoardVO board);
    
    /* 게시판 삭제 */
    public int delete(int bno);
}
