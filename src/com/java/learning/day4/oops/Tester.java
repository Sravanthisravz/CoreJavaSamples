package com.java.learning.day4.oops;

public class Tester extends Employee {
	double bonus = 2000;

	public static void main(String[] args) {
		Tester tester = new Tester();
		System.out.println("Tester salary is--->" + tester.salary);
		System.out.println("Tester bonus is-->" + tester.bonus);
		System.out.println("Tester salary with bonus is-->" + (tester.salary + tester.bonus));
	}
}
