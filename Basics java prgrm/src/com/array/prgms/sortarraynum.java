package com.array.prgms;

import java.util.Arrays;

//  WAP to sort the array int arr[] = {0, 27, 44, 12, 5,33}

public class sortarraynum {
	
	public static void main(String[] args) {
		
		int arr[] = {0,27,44,12, 5,33};
	
	    // array.sort method
		
		Arrays.sort(arr);
		
		System.out.println("sorted array in acsennding order");
		for (int i=0;i<=arr.length-1;i++)
			
		{
		System.out.println( arr[i]);
		}
		
	}

}
