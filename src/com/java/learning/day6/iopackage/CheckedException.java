package com.java.learning.day6.iopackage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args){//without throws use try catch click on erroe and enter
		FileReader in=null;
		FileWriter out=null;
		try {
			in = new FileReader("C:\\files\\hello.txt");
			System.out.println("everything is fine");
			out = new FileWriter("C:\\files\\output.txt");
			int a;
			while((a=in.read()) != -1){  //to read file till last character
				out.write(a);   // output file is created with hello content in c drive
			}//that is output creation of file in c drive

		} catch (FileNotFoundException e) {
			System.out.println("In file not found exception");
			e.printStackTrace();
		}// we can skip this whole catch block since it is part of ioexception
		catch (IOException e) {
			System.out.println("in ioexception");
			e.printStackTrace();
		 }
		catch (Exception e) {
			System.out.println("in generic exception");
			e.printStackTrace();
		 }
		
	finally{
		System.out.println("it will execute irrespective of try and catch");
	
		try {
			in.close();
			out.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
}
