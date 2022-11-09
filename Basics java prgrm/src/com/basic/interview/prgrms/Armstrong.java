package com.basic.interview.prgrms;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		
		
	Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		int num2=num;
		int sum=0;
		
		while(num!=0)
		{
			int rem=num%10;
			int cube=rem*rem*rem;
			sum+=cube;
			num/=10;
	//		System.out.println(num);
		}
		
		if(sum==num2)
			System.out.println("given number is a armstrong");
		else
			System.out.println("not a armsstrong");
			
	}

}
