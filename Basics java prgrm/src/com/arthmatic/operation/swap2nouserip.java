package com.arthmatic.operation;

/*Swapping of two no. using third varaible with user input*/

import java.util.Scanner;

public class swap2nouserip {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter value of a = ");
		
		int a =sc.nextInt();
		
		System.out.println("Enter value of b = ");
		
		int b = sc.nextInt();
		
		int temp ;
		
		temp = a;
		
		a=b;
		
		b=temp;
		
		System.out.println("swapped value of a = " +a + " b = " +b );
		
		
		
	}

}
