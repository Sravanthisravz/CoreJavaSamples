package com.java.learning.day1;

public class RunFirstJavaProgram {

public static void main(String[] args) {
		System.out.println("my first program");
		// executes first since static but after the static block
	}
	static
	{
		System.out.println("before main starts");
		
		// static block executes first
	}

}
