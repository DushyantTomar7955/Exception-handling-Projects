package com.jspider;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ArrayTryCatchBlock {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
	System.out.print("Enter the size of Array: ");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.print("Enter the Values: ");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	String s="Ramesh";
	System.out.print("Enter the index to get Character from String: ");
	int index=sc.nextInt();
	try {
		System.out.println(s.charAt(index));
	}
	catch(StringIndexOutOfBoundsException e) {
		System.out.println("Invalid Index Please pass Something else!");
	}
	}
	catch(InputMismatchException e) {
		System.out.println("Please Enter a Valid Input values");
	}
	}

}
