package com.java.learning.day4.oops;

public class Programmer extends Employee {
	double bonus=5000;
	public static void main(String[] args) {
		
Programmer programmer =new Programmer();
System.out.println("Programmer salary-->" +programmer.salary);
System.out.println("Programmer bonus-->"+programmer.bonus);

	}
}
