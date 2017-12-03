package com.java.learning.day2.datatypes;

public class OutsideVariableExample {

	int a=10;
	int b=20;
	int c=a+b;
	public static void main(String[] args) {
		OutsideVariableExample o= new OutsideVariableExample(); //since variables are outside the main 
		//we need to create object and give object.result
System.out.println("result is"+o.c);
	}

}
