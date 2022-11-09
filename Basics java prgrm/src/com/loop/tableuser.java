package com.loop;

import java.util.Scanner;

public class tableuser {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a numebers from table start");
		
		
		Scanner sc =new Scanner(System.in );
		
		
		int a = sc.nextInt(); 
		
		
		//System.out.println(a);
		
		
		System.out.println("enter to number where tables needs to end ");
		
		
		int j = sc.nextInt();
		
	//	System.out.println(j);
		
		int k;
		
		for (int i=a;i<=j;i++)
		{
			System.out.println(" ");
			
			for (k=1;k<=10;k++)
				
				System.out.print(i*k + " ");
			
		}
			
		
	
		
		
		
	}

}
