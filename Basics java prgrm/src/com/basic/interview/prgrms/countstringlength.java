package com.basic.interview.prgrms;

import java.util.Scanner;

public class countstringlength {
	
	public static void main(String[] args) {
		
		
		System.out.println("enter a string ");
		
		Scanner sc = new Scanner (System.in);
	
		String str = sc.nextLine();
		int a=str.length();
	
		System.out.println(" using str.length method"+str.length());
		
		
		
		int count=0;
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			
			count++;
		}
		
		System.out.println(" using the for loop"+count);
		
	}

}
