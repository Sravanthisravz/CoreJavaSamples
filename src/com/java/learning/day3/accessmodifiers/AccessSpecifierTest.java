package com.java.learning.day3.accessmodifiers;

public class AccessSpecifierTest {

	public static void main(String[] args) {
		AccessSpecifier1 s= new AccessSpecifier1();
		//System.out.println("a value is"); we cannot get a since it is private so in other class we cant access
		System.out.println("b value is"+s.b);
		System.out.println("c value is"+s.c);
	}

}
