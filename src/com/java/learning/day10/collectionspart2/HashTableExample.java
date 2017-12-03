package com.java.learning.day10.collectionspart2;

import java.util.Hashtable;
import java.util.Iterator;

public class HashTableExample {

	public static void main(String[] args) {
		long beginTime= System.currentTimeMillis();
		Hashtable t=new Hashtable();
		t.put(2, "sam");
		t.put(1, "sravs");
		t.put(3, "sai");           
		t.put(5, "sruthi");
		// t.put(null, null); we get nullpointer exception since hashtable doesnot tke eveni null
		
		System.out.println("size of list" + t.size());
		Iterator iterator = t.entrySet().iterator();
		while (iterator.hasNext()) {
			System.out.println("map values are--> " + iterator.next());

		}
		long endTime= System.currentTimeMillis();
		System.out.println("time taken is" +(endTime - beginTime));
	}

}
