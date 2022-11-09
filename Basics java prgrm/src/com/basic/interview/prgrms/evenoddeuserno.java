package com.basic.interview.prgrms;

import java.util.Scanner;

public class evenoddeuserno {
	
	public static void main(String[] args) {
		
	
		System.out.println("Enter a number ");
		
	    Scanner sc = new Scanner(System.in);
	    
	    int a= sc.nextInt();
	    
	   // System.out.println(a);
	    
	     int num = a;
	     
	     num =num%2;
	     
	     if (num==1) 
	      {
	        System.out.println("Enter number is " + a + " a Odd number ");
	       
		  }
	     else
	     {
	    	 System.out.println("Enter number is " + a + "  a Even number");
	    
	          	 
	     }	
	
	
	
	
	}
}
