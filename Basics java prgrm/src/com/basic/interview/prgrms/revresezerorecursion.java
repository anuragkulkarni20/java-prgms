package com.basic.interview.prgrms;

import java.util.Scanner;

public class revresezerorecursion {

	
	public static void main(String[] args) {
		
		System.out.println("eneter a num to revrse ");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc .nextInt();
		
		reverse(num);
	}
		
	private static void reverse(int num) {
		// TODO Auto-generated method stub
		
		
		if (num<10)
		{
			System.out.print(num);
			
			return;
		}
		else
		{
			System.out.print(num%10);
			reverse(num/10);
		}
	
		
	}

	
	//}
	
	
   }

