package com.peanut.model;

import java.util.Date;

import lombok.Data; //getter setter toString 한번에 만들기

@Data
public class BoardVO {
	
	/* 게시판 번호 */
    private int bno;
    
    /* 게시판 제목 */
    private String title;
    
    /* 게시판 내용 */
    private String content;
    
    /* 게시판 작가 */
    private String writer;
    
    /* 등록 날짜 */
    private Date regdate;
    
    /* 수정 날짜 */
    private Date updateDate;
    
  
	
}
