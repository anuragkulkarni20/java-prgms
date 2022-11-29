package com.array.prgms;

import java.util.Scanner;

// wap to insert a numbers in array; 

public class insertnumarray {
	
	
	public static void main(String[] args) {
		
		
		//System.out.println("enetr a numbers to store into  array ");
		
		System.out.println("enter array length/size");
		//int i;
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
	//	int arrnum =sc.nextInt();
		System.out.println("lengthe of array is :" + n );
		int arr[] = new int[n];
		
		//System.out.println("b");
		
		//int arr[]= new int[5];

		//System.out.println("c");
		// reading the eleemnst from the user this fo loop is used
		for (int i =0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
		}

		
		
		System.out.println("elemnts are ");
		
		
		for( int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		
		
		
		
	}

}
