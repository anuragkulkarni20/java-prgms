package com.basic.interview.prgrms;

import java.util.Scanner;

public class primeno {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();

		int i = 2;

		while (i < num) {
			
			if(num%i==0)
			{
				break;
			}
			i++;

		}
		if(i==num)
			System.out.println("number is prime");
		else
			System.out.println("number is not a prime");
	}
}
