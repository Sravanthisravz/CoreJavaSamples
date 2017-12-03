package com.java.learning.day10.collectionspart2;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap map = new TreeMap();

		map.put(2, "sam");
		map.put(1, "sravs");
		map.put(3, "sai");           // displays in sorted order
		map.put(5, "sruthi");
		map.put(4, null);
		System.out.println("size of list" + map.size());
		Iterator iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			System.out.println("map values are--> " + iterator.next());

		}
	}
}
