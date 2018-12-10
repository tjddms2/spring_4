package com.se.s4;

import static org.junit.Assert.assertEquals;

import javax.inject.Inject;

import org.junit.Test;

import com.se.board.BoardDTO;
import com.se.board.qna.QnaDAO;
import com.se.board.qna.QnaDTO;

public class QnaDAOTest extends AbstractTestCase{
	@Inject
	private QnaDAO qnaDAO;
	
	//@Test //테스트 안돌림 작성만함.
	public void selectOnetest() {
		BoardDTO boardDTO;
		try {
			boardDTO= qnaDAO.select(1);
			System.out.println(boardDTO.getTitle());
			System.out.println(boardDTO.getContents());
			System.out.println(boardDTO.getWriter());
			//제목, 내용, 작성자의 데이터를 뽑는다 
			//이미 num의 값은 넘어왔음.
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//@Test
	public void deletetest() {
		int result = 0;
		try {
			result = qnaDAO.delete(1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(1, result);
	}
	
	@Test
	public void inserttest() {
		BoardDTO boardDTO = new QnaDTO();
		boardDTO.setTitle("ttt1");
		boardDTO.setContents("scc1");
		boardDTO.setWriter("wsws1");
		int result;
		try {
			result = qnaDAO.insert(boardDTO);
			assertEquals(1, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
