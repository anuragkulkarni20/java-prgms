package com.basic.interview.prgrms;


/* Find gievn character is A  speical char symbols, character or number,*/

import java.util.Scanner;

public class charsym {
	
	public static void main(String[] args) {
		
		
		System.out.println("Enterd character");
		
		Scanner sc  = new Scanner(System.in);
		
		char ch=sc.next().charAt(0);
		// int special=0;
		
		if(ch>='a' && ch<='z')
		{
			
			System.out.println("lowe case  :" + ch);
		} 
		else if(ch>='A' && ch<='Z')
			
		{
			System.out.println("uppercase  :" + ch );
		}
		
		else if(ch>='0' && ch<='9')
		{
			System.out.println("its a number :   " + ch);
		}
		
		
		else 
		{
			//special++;
			System.out.println("special char");
		}
		
	}

}
