package com.itartel.junit;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.hamcrest.core.IsEqual;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SayHelloTest {

	@BeforeClass
	public static void setUpClass(){
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void tearDownClass(){
		System.out.println("After Class");
	}
	
	@Before
	public void setUp(){
		System.out.println("Before");
	}
	
	@After
	public void tearDown(){
		System.out.println("After");
	}
	
	@Test
	public void sayHelloAssert() throws Exception {
		Greeting greeting = new Greeting("World"); 
		assertEquals("Hello World!",greeting.sayHello());
	}
	
	@Test
	public void sayHelloAssertThat() throws Exception {
		Greeting greeting = new Greeting("World");
		assertThat(greeting .sayHello(), new IsEqual<String>("Hello World!") );
	}
}
