package com.peanut.model;

import java.util.Arrays;

public class Criteria {

    
    @Override
	public String toString() {
		return "Criteria [pageNum=" + pageNum + ", amount=" + amount + ", keyword=" + keyword + ", type=" + type
				+ ", typeArr=" + Arrays.toString(typeArr) + "]";
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
		this.typeArr = type.split("");
	}

	public String[] getTypeArr() {
		return typeArr;
	}

	public void setTypeArr(String[] typeArr) {
		this.typeArr = typeArr;
	}

	
	
	/* 현재 페이지 */
    private int pageNum;
   
	/* 한 페이지 당 보여질 게시물 갯수 */
    private int amount;
    
    /* 검색 키워드*/
    private String keyword;
    
    /* 검색 타입 */
    private String type;
    
    /* 검색 타입 배열 */
    private String[] typeArr;
    
    /* 기본 생성자 -> 기봅 세팅 : pageNum = 1, amount = 10 */
    public Criteria() {
        this(1,10);  //this는 이 클래스로 만들어진 인스턴스 그 자체
        //this(): 클래스이름에 괄호를 열고 닫고 있으니 생성자 
        //생성자 인데 인자가 2개가 있으니까 밑의 생성자
        //아무 인자를 전달하지 않은 기본생성자로 객체를 만들경우 1페이지, 한페이지당 10개 보이기로 만든다
    }
    
    /* 생성자 => 원하는 pageNum, 원하는 amount */
    public Criteria(int pageNum, int amount) {
        this.pageNum = pageNum;
        this.amount = amount;
    }

}
