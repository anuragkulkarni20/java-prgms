package com.arthmatic.operation;

import java.util.Scanner;

/*check the given no is palidrome or not */


/* A number is same when digits are reversed eg 141,414*/

public class palidrome {

	
	
	
	public static void main(String[] args) {
		
		
		System.out.println("enter a number");
		
		Scanner sc =new Scanner(System.in);
		
		// original number storing into a variable
		
		int a =sc.nextInt();
		
		//original number store to tem variable into num for perfroming operation
		
		int num =a;
		
		int revnum=0;
		
		System.out.println("Enterd a num is :" + a);
		
		
		
		while(a!=0)
		{
			
			
			revnum = revnum *10 + a%10;
			//System.out.println(a);
			a = a/10;
			
			
			
			
			
			}
		
		System.out.println("reversed num is " + revnum);
		
		//System.out.println(a);
		
		 if(num == revnum) 
		 {
			
			System.out.println("entered num is palidrom " + num);
		}
		
		else 
		{
			System.out.println("the num is not a palidrome " +num);
		}
		
	}
}
