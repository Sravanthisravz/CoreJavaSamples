package com.java.learning.day9.collections;

//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.LinkedHashSet;
//or
import java.util.*;  
public class LinkedHashSetExample {
	 public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		  LinkedHashSet<String> set=new LinkedHashSet<String>();  
		  set.add("sam");  
		  set.add("Vijay");  
		  set.add("Ravi");  // doesnot allow duplicates
		  set.add("Ajay");  
		  set.add("null");  
		  set.add("null");  //allows only one null
		  // guarantee the order in the output
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  System.out.println("size of list is" +set.size());
		 }  
}
