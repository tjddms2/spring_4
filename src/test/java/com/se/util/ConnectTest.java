package com.se.util;

import static org.junit.Assert.*;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.se.s4.AbstractTestCase;

public class ConnectTest extends AbstractTestCase{
	@Inject
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		assertNotNull(sqlSession.getConfiguration());
	}

}
