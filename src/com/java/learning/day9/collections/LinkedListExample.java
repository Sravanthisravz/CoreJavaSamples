package com.java.learning.day9.collections;

import java.util.*;

public class LinkedListExample {

	public static void main(String args[]) {

		// LinkedList<String> al=new LinkedList<String>();
		LinkedList al = new LinkedList();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add(null);// accepts null value
		al.removeFirst();// deletion
		al.addFirst("sai"); // insertion

		al.add(2, "saaa");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		System.out.println("size of list is " + al.size());
	}
}
