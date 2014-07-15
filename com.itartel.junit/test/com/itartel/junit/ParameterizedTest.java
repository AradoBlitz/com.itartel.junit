package com.itartel.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class ParameterizedTest {

	@Test
	public void addOneToNumber() throws Exception {
		assertEquals(1,1+0);
		assertEquals(2,1+1);
		assertEquals(3,1+2);
	}
}
