package com.peanut.mapper;

import java.util.List;

import com.peanut.model.BoardVO;
import com.peanut.model.Criteria;

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
    
    /* 게시판 목록(페이징 적용) */
    public List<BoardVO> getListPaging(Criteria cri);
    //함수 이름: getListPaging
    //이 함수가 실행될때 필요한 데이터가 하나 있는데 그 데이터 타입이 Criteria야 한다. 
    //그 전달된 참조형 변수를 이 함수 안에서는 cri라는 이름으로 쓸거다
    //이 함수가 실행되고 나면 BoardVO로 구성된 리스트를 반환될것
    //위 함수 정의에 대한 약속
    
    /* 게시글 총 갯수 */
    public int getTotal(Criteria cri);
}
