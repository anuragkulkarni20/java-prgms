package com.arthmatic.operation;

/*Swapping of two no. without using third varibles */

public class swap2nowit2var {
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter first two no");
		
		int a =10, b =20;
		
		
		System.out.println("value of a = " +a +"b = "+ b);
		// logic using addtion & substraction 
		
		
		a =a+b;   //10+20=30=a
		
		b= a-b;   //30-20=10=b
		
		a=a-b;   // 30-10=20=a
		
		
		System.out.println("Swapped value of a = " +a + " b = "+ b);
		
		
		
		
	}

}
