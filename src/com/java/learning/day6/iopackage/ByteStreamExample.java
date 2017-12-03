package com.java.learning.day6.iopackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream("C:\\files\\hello.txt"); // create this file in c folder//click on erroe add needed add import
		FileOutputStream out=new FileOutputStream("C:\\files\\output.txt");// this automatically creates 
		int c;
		while((c=in.read()) != -1){  //to read file till last character
			out.write(c);   // output file is created with hello content in c drive
		}//that is output creation of file in c drive

		

	}

}
