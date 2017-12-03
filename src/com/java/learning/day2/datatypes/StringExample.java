package com.java.learning.day2.datatypes;

public class StringExample {

	public static void main(String[] args) {
		String s = "Hello";
		s = s + "world"; //concatinates hello and world
		String w =s.substring(1); //starts index with 0
		String r =s.substring(2, 4);  //displays 2nd and 3rd position characters
		System.out.println("firstresult is " +s);
		System.out.println("secondresult is " +w);
		System.out.println("thirdresult is " +r);
	}

}
