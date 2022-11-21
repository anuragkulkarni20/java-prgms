package com.basic.interview.prgrms;

import java.util.Scanner;

public class countstringlength {
	
	public static void main(String[] args) {
		
		
		System.out.println("enter a string ");
		
		Scanner sc = new Scanner (System.in);
	
		String str = sc.nextLine();
	
		char ch[] =str.toCharArray();
		
		int count =0;
		while(ch.length>0) 
		{
			
			
			count++;
			
		}
		//System.out.println(str);
		System.out.println(count);
		
	 	System.out.println("legnth of string is :"+ str.length());
		
	}

}
