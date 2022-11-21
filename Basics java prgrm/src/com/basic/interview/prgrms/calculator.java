package com.contional;

import java.util.Scanner;

public class calculator {
	
	public static void main(String[] args) {
		
		
		System.out.println("enter two  numbers ");
		
		Scanner sc = new Scanner(System.in);
		
		
		int num1 = sc.nextInt();
		
		int num2=sc.nextInt();
		
		int result;
		
		//System.out.println(" two nos are " + num1);
		//System.out.println(" two nos are " + num2);
		
		System.out.println("chose opertion to perform : + ,- ,*, /");
		
		char operation =sc.next().charAt(0);
		switch(operation) {
		
		case '+' :
			
			System.out.println(" addition of two nos  " + (result =num1+num2));
			
		break;
		
		
        case '-' :
			
			System.out.println(" substraction of two nos  " + (result =num1-num2));
			
		break;
		
		
		
       case '*' :
			
			System.out.println(" multiplication of two nos  " + (result =num1*num2));
			
		break;
		
		
		
       case '/' :
			
			System.out.println(" division of two nos  " + (result =num1/num2));
			
		break;
		
		default:
			System.out.println("invalid operation");
		
		break;
		
		
		
		
		}
		
		
		
	}
	

}
