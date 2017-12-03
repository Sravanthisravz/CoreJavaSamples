package com.java.learning.day9.collections;

	import java.util.*;  
	public class HashSetExample {
	 public static void main(String args[]){  
	  //Creating HashSet and adding elements  
	  HashSet<String> set=new HashSet<String>();  
	  set.add("Ravi");  
	  set.add("Vijay");  
	  set.add("Ravi");  // doesnot allow duplicates
	  set.add("Ajay");  
	  set.add("null");  
	  set.add("null");  //allows only one null
	  //doesnot guarantee the order in the output
	  //Traversing elements  
	  Iterator<String> itr=set.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	  System.out.println("size of list is" +set.size());
	 }  
	

}
