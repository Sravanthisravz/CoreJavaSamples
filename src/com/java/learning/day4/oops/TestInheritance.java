package com.java.learning.day4.oops;

public class TestInheritance {

	public static void main(String[] args) {
		Tester tester = new Tester();
		System.out.println("Tester salary with bonus is-->" + (tester.salary + tester.bonus));
		Programmer programmer =new Programmer();
		System.out.println("Programmer salary with bonus-->"+(programmer.salary + programmer.bonus));
	}

}
