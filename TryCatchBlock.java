package com.jspider;

public class TryCatchBlock {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int a=10;
		int b=20;
		try {
			int c=a/b;
			int d[]= {10,20,30};
			
			try {
				System.out.println(d[4]);
			}
			catch(ArrayIndexOutOfBoundsException ei) {
				System.out.println("AIOOBE handled");
			}
			
		}
        catch(ArithmeticException e) {
        	System.out.println("AE Handled");
        }
		System.out.println("Program Ends");
	}

}
