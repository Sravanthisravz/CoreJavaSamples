package com.java.learning.day5.abstractfinal;

public class ChildAbstractExample extends AbstractExample {

	public static void main(String[] args) {
		ChildAbstractExample childAbstractExample = new ChildAbstractExample();
		childAbstractExample.display();
		childAbstractExample.show();

	}

	@Override
	public void display() {
		System.out.println("this is display method");

	}

}
