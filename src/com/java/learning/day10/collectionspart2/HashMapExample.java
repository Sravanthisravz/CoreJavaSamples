package com.java.learning.day10.collectionspart2;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap map =new HashMap();
		map.put(1,"sravs");
		map.put(2,"sam");
		map.put(3,"sai");
		map.put(4,"saaha");
		map.put(5,"sruthi");
		System.out.println("size of list" +map.size());
		Iterator iterator= map.entrySet().iterator();
        while(iterator.hasNext()){
        	System.out.println("map values are--> " +iterator.next());
        }
        	


	}

}
