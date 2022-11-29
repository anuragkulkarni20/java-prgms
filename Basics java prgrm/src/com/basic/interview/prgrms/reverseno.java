package com.basic.interview.prgrms;

import java.util.Scanner;

public class reverseno {

	
	public static void main(String[] args) {
		
		
		System.out.println("enter a number");
		
		Scanner sc = new Scanner (System.in);
		
		int  orgnum = sc.nextInt();
		
		int temp = orgnum;
		
		System.out.println("enterd num is :" + orgnum);
		
		System.out.println("tem num is :" + temp);
		
		int rev=0;
		while(temp!=0) 
		{
			
			
			int rem=temp%10;
			rev=rev*10+rem;
		    temp = temp/=10;
			
			
			
		}
		
		System.out.println("revers num is " + rev);
	}
	
}
