package com.java.learning.day10.collectionspart2;
import java.util.*;
public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<String> al=new TreeSet<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  //no duplicates
		  // not even 1 null
		  al.add("Ajay");  //orders and sorts
		  //Traversing elements  
		  Iterator<String> itr=al.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		 }  
	}


