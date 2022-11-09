package com.basic.interview.prgrms;

import java.util.Scanner;

public class Primenouser {
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("enter number");
		
		int a = sc.nextInt();
		
		
		int num =a/2;
		int flag =0;
		 if(num==0 || num ==1) 
		   {
			System.out.println("Number is not prime");
		   }  
		else 
		{
		
		  for (int i=2;i<=num;i++)
		  {
			  if (i%2==0)
			  {
				flag=1;
			  }
			
			
		  }
		  if(flag==0)
		    {
			   System.out.println("enter number is " + a + " is prime number" );

		    }
		
		
		    else 
		    {
			  System.out.println("enter number is " + a + " is not prime number");
		    }
		
		
		}
		
	}

}
