package com.se.board.notice;

import static org.junit.Assert.*;

import java.util.List;

import javax.inject.Inject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.se.board.BoardDTO;
import com.se.s4.AbstractTestCase;

public class NoticeDAOTest extends AbstractTestCase{
	
	@Inject
	private NoticeDAO noticeDAO;
	
	@BeforeClass
	public static void start() {
		System.out.println("Start Test");
	}
	@AfterClass
	public static void finish() {
		System.out.println("Finish Test");
	}
	@Before
	public void before() {
		System.out.println("Before Test");
	}
	@After
	public void after() {
		System.out.println("After Test");
	}
	
	@Test
	public void insertTest() {
	/*	BoardDTO boardDTO = new BoardDTO();
		try {
			int reuslt =noticeDAO.insert(boardDTO);
			assertEquals(1, result);
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		System.out.println("insert Test");
	}
	
	@Test
	public void updateTest() {
		System.out.println("Update Test");
	}
	
	@Test
	public void deleteTest() {
		System.out.println("delete Test");
	}		
	@Test //select
	public void test() {
		System.out.println("List Test");
		/*try {
			List<BoardDTO>ar=noticeDAO.list();
			assertNotEquals(0, ar.size()); 				//0이 아니면
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
	
		
	
}
