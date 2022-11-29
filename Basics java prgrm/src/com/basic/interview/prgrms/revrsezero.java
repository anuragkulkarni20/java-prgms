package com.basic.interview.prgrms;

/** wap to revrese a number and also revrese a number having last digit is zero
eg = 13540 = rev = 04531;
*/

import java.util.Scanner;

public class revrsezero {
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
	//		rev=rev*10+rem;
		    System.out.print(rem);
			temp = temp/=10;
			
			
			
		}
		//System.out.println("revers num is " + rev);
		
		/*
		 * if (orgnum %10==0 ) { String s="0"+rev;
		 * System.out.println("Reverse of Number having Zero at last digit is:"+s); }
		 */
	}
	
}
