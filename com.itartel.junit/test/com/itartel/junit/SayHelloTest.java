package com.itartel.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class SayHelloTest {

	@Test
	public void sayHello() throws Exception {
		Greeting greeting = new Greeting("World"); 
		assertEquals("Hello World!",greeting.sayHello());
	}
}
