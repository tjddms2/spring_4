package com.se.util;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.se.s4.AbstractTestCase;

public class PagerTest extends AbstractTestCase{
	private static Paper pager;
	
	
	@BeforeClass
	public static void setData() {
		pager = new Paper();
		
	}
	
	@Test
	public void test() {
		//assertEquals(1, pager.getCurPage());
		//curPage x		1	
		
		//perBlock x	5
		//assertEquals(5, pager.getPerBlock());
		
		//perPage x		10
		//assertEquals(10, pager.getPerPage());
		
		//kind x		title
		//assertEquals("title", pager.getKind());
		
		//search x		""
		//assertEquals("", pager.getSearch());
		
		//starrow,lastrow 계산
		pager.makeRow();	
		assertEquals(10, pager.getLastRow());
	}

}
