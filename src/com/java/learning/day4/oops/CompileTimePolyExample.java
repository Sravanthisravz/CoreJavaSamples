package com.java.learning.day4.oops;

public class CompileTimePolyExample {

	public static void main(String[] args) {
		
		CompileTimePolyExample compileTimePolyExample = new CompileTimePolyExample();
		int result = compileTimePolyExample.addName(1, 2);
		System.out.println("iresult is " +result);
		float  floatresult = compileTimePolyExample.addName(10.2f, 2.5f);
		System.out.println("fresult is " +floatresult);
		double  doubleresult = compileTimePolyExample.addName(1.5, 2.1);
		System.out.println("dresult is " +doubleresult);
		

	}
public int addName(int a,int b)
{
	return a+b;
	}
public float addName(float a,float b)
{
	return a+b;
	}
public double addName(double a,double b)
{
	return a+b;
	}
}
