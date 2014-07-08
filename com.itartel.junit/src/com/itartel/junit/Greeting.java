package com.itartel.junit;

public class Greeting {

	private final String name;

	public Greeting(String name) {
		this.name = name;
	}

	public String sayHello() {
		return "Hello " + name + "!";
	}

}
