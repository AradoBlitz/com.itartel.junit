package com.itartel.junit;

import static org.junit.Assert.*;

import org.hamcrest.Matcher;
import org.hamcrest.core.IsEqual;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

public class SayHelloTest {

	@Rule
	public ExternalResource methodRule = new ExternalResource() {

		@Override
		protected void after() {
			System.out.println("After");
		}

		@Override
		protected void before() throws Throwable {
			System.out.println("Before");
		}
		
	};
	
	@BeforeClass
	public static void setUpClass(){
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void tearDownClass(){
		System.out.println("After Class");
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
	
	@Ignore()
	@Test
	public void ignoreTest() throws Exception {
		fail("Should be ignored.");
	}
	
	
	@Test(timeout=500)
	public void timeoutTest() throws Exception {
		//Thread.sleep(501);
	}
	
	@Test(expected = RuntimeException.class)
	public void exceptionTest() throws Exception {
		throw new RuntimeException();
		//throw new IllegalArgumentException();
		/* Fail */
		//throw new Exception();
	}
}
