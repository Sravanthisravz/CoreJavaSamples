package com.java.learning.day4.oops;

public class TestOverride {

	public static void main(String[] args) {
		Child c = new Child();
		c.show();
		Parent p = new Parent();
		p.show();
		Parent p1 = new Child();  //this is possible as child is part of parent
		//Child c1 =new Parent(); this is not possible
		p1.show();

	}

}
