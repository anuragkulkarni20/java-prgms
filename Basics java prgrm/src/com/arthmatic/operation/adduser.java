package com.arthmatic.operation;

/* Addition of two number using user input*/



import java.util.Scanner;

public class adduser {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n enter a first no");
		
		int a = sc.nextInt();	

		System.out.println("\n enter second no");
		
		int b = sc.nextInt();
	
		int res = a+b;
		
		System.out.println("\n addition of two no is :" + res);
		
		
		
	}

}
