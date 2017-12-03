package com.java.learning.day7.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) throws IOException {
		FileReader fr =new FileReader("C:\\files\\hello.txt");
		FileWriter fw= new FileWriter("C:\\files\\OUTPUT1.txt");
		int c;
		while((c=fr.read()) != -1){  //to read file till last character
			fw.write(c);   // output file is created with hello content in c drive
		}//that is output creation of file in c drive

	}

}
