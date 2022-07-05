package com.peanut.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.peanut.mapper.BoardMapper;
import com.peanut.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService{
	
	/* 속성, setter, constructor 중에 속성
	 * 클래스 = 객체
	 * 객체는 속성과 행동의 집합*/
	@Autowired
	private BoardMapper mapper;
	//스프링이 관리하는 객체(빈)은 싱글톤패턴으로 관리되어 1개의 인스턴스가 유지된다.
	//Autowired를 통해서 new 생성자로 호출 없이 그 객체를 사용할 수 있다. 

	//enroll함수 안에서는 BoardMapper의 인스턴스를 사용해야 하는데, 
	//그 인스턴스를 enroll 함수 안에서 생성하는 것이 아니라 외부에서 생성된것을 주입받아서 사용하고 있다. 
	//왜 enroll함수 안에서 생성해서 사용하지 않고 외부에서 만든것을 주입받아서 사용하나요?
	//높은 응집도(속성이 비슷한 것끼리 뭉쳐있다.), 낮은 결합도(의존성이 줄어든다)를 위해서
	//안에서 생성하게 되면 어떤 생성자를 쓸지, 어떻게 생성할지 등을 enroll을 만드는 개발자가 알아야 된다.
	//외부에서 주입받게 되면 어떻게 만들어짔는지는 관심ㅇ 없다. 만들어져있는 것을 쓰기만 할거다. 
	@Override
	public void enroll(BoardVO board) {

		mapper.enroll(board);
		
	}
	
	/* 게시판 목록 */
   @Override
    public List<BoardVO> getList() {
        
        return mapper.getList();
    }
   
   /* 게시판 조회 */
   @Override
   public BoardVO getPage(int bno) {
        
       return mapper.getPage(bno);
   }    


}
