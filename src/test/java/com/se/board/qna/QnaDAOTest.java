package com.se.board.qna;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import com.se.board.BoardDTO;
import com.se.s4.AbstractTestCase;

public class QnaDAOTest extends AbstractTestCase{
	
	//@Inject
	//private QnaDAO qnaDAO;
	
	/*@Test
	public void replyTest() throws Exception{
		QnaDTO qnaDTO = new QnaDTO();
		qnaDTO.setTitle("rt1");
		qnaDTO.setWriter("rw1");
		qnaDTO.setContents("rc1");
		//부모의 글번호
		qnaDTO.setRef(2);
		//부모의 step+1
		qnaDTO.setStep(1);
		//depth+1
		qnaDTO.setDepth(1);
		qnaDAO.reply(qnaDTO);
		int result=qnaDAO.reply(qnaDTO);
		assertEquals(1, result);
		
	}
	
	//@Test					//빨간밑줄을 처리할수있다.
	public void insertTest()throws Exception {
		BoardDTO boardDTO = new BoardDTO(); //연결됨
		boardDTO.setTitle("t2");
		boardDTO.setWriter("w2");
		boardDTO.setContents("c2");
		int result=qnaDAO.insert(boardDTO);
		assertEquals(1, result);
	}
	
	@Test
	public void UpdateTest() {
		BoardDTO boardDTO = new BoardDTO();
	 try {
		int result = qnaDAO.update(boardDTO);
		assertEquals(1, result);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}*/

}
