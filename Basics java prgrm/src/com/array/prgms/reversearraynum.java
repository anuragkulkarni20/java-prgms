package com.array.prgms;

import java.util.Scanner;

public class reversearraynum {

	
	public static void main(String[] args) {
		
		
		
		System.out.println("enetr array size");
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
	    
		int arr[] = new int[num];
		
		System.out.println("array size is  :" + num);
		
		
		for (int i =0; i<num; i++)
			
		{
			
			arr[i] = sc.nextInt();
		}
		
		System.out.println("array elements are");
		
		for(int i=0;i<num;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		System.out.println("for reversing array");
		
		for(int i = arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
			
		}
		
		
		
	
	}
}
