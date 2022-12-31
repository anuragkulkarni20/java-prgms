package com.basic.interview.prgrms;
/*  w.a.p to find given num is special/ strong number or not */

/*  *  */

import java.util.Scanner;

public class specialnum {

	
	public static void main(String[] args) {
		
		
		System.out.println("enter  number");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int temp=num;
		
	
		    
		 
		 
		int sum=0;
		
		while(num!=0)
		{
			int rem=num%10;
			sum+=fact(rem);
			num/=10;
		}
		
		
	
		
		
		
		if (sum==temp)
		{
			System.out.println("given num is special num " + temp);
		}
		
		else
		{
			System.out.println("given num is not special num " + temp);
		}
		
		
		
		
		
		
	}
	
	
	  public static int fact(int rem) 
	   { 
		  int fact=1; 
	      for(int i=1;i<=rem;i++) 
	       {
	         fact*=i; 
	       } 
	  return fact; 
	   }
	 
}
