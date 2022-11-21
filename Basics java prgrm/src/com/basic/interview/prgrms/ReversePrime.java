package com.basic.interview.prgrms;

import java.util.Scanner;

public class ReversePrime {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
	//	int rev=0;
		
		if(prime(num))
		{
			reverse(num);
			
		}
		else
		{
			System.out.println(false);
		}
		
		
	}
	
	public static void reverse(int num) {
		int rev=0;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		
		if(prime(rev))
			System.out.println("true");
		else
			System.out.println("false");
			
		
	}

	public static boolean prime(int num)
	{
		int i=2;
		
		while(i<=num)
		{
			if(num%i==0)
			{
				break;
			}
			i++;
		}
		if(i==num)
			return true;
		else
			return false;
	}

}
