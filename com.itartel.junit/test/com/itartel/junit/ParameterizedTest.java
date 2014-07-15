package com.itartel.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTest {

	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][]{{1,0},{2,1},{3,2}});
	}
	
	private final int input;
	private final int expected;
	
	public ParameterizedTest(int expected, int input){
		this.input = input;
		this.expected = expected;
	}
	
	@Test
	public void addOneToNumber() throws Exception {
		assertEquals(expected,1+input);
	}
}
