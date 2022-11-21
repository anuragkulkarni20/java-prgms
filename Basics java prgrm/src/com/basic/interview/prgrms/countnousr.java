package com.basic.interview.prgrms;

import java.util.Scanner;

public class countnousr {

	
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		
		
		Scanner sc =new Scanner(System.in);
		
		int num = sc.nextInt();
		
		System.out.println(num);
		
		int count =0;
		for(int i=num; i>0;i=i/10)
		{
			 count++;
		}
		
		System.out.println("no of didgits in enetered number is " + count);
		
		
	}
}
