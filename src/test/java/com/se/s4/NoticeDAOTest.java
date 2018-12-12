package com.se.s4;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;

import com.se.board.BoardDTO;
import com.se.board.notice.NoticeDAO;
import com.se.board.notice.NoticeDTO;

public class NoticeDAOTest extends AbstractTestCase{
	@Inject
	private NoticeDAO noticeDAO;
	
	
	//@Test
	public void selectOnetest() {
		BoardDTO boardDTO;
		try {
			boardDTO = noticeDAO.select(2);
			System.out.println(boardDTO.getTitle());	//제목 ,내용 , 작성자의 데이터를 뽑는다
			System.out.println(boardDTO.getContents());
			System.out.println(boardDTO.getWriter());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //selectOne->num을 받아가지고 들어왔음.
	}
	
	//@Test
	public void inserttest() {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setTitle("tttt");
		boardDTO.setContents("cccc");
		boardDTO.setWriter("wwww");
		
		try {
			int result= noticeDAO.insert(boardDTO);
			assertEquals(1, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//@Test
	public void deletetest() {
		try {
		int	result = noticeDAO.delete(2);
			/*assertEquals(1, result);*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//@Test
	public void updatetest() {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setTitle("ss");
		boardDTO.setContents("cee");
	int result;
	try {
		result = noticeDAO.update(boardDTO);
		assertEquals(1, result);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	//@Test
	/*public void listtest() {
	List<BoardDTO> ar;
	try {
		ar = noticeDAO.list(1, 2, 11, "writer", "c");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	assertEquals(5, ar.size());
	}*/
	
}

