package com.se.s4;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.junit.Test;

import com.se.board.BoardDTO;
import com.se.board.notice.NoticeDAO;

public class MyTest extends AbstractTestCase { //AbstractTestCase을 상속받았다
	@Inject
	private NoticeDAO noticeDAO;
	
	@Test
	public void test() {
		try {
			BoardDTO boardDTO=noticeDAO.select(1);   	//boarDTO를 못찾으면 null이 된다.
			assertNotNull(boardDTO);						//boarDTO가 null이라면 성공이다.
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test2() {
		BoardDTO boardDTO = new BoardDTO();
		try {
			int result = noticeDAO.insert(boardDTO);		//0: 실패, 1 : 성공
			assertEquals(1, result); 						//
		} catch (Exception e) {					
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
