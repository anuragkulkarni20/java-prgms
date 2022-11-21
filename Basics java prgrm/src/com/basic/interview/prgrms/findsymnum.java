package com.basic.interview.prgrms;

/*Find how many specail symbols , uppr case lowecase, and numbers are uosed in string/char */

import java.util.Scanner;

public class findsymnum {

	
	
	
	public static void main(String[] args) {
		
		System.out.println("eneter a string containing all symbols nd char");
		
		
		Scanner sc = new Scanner (System.in);
		
		String str = sc.nextLine();
		
		//char ch = sc.next().charAt(0);
		//char ch=sc.next().charAt(0);
		//char b = sc.next().charAt(0);
		int upper=0;
		int lower=0;
		int digit=0;
		int special=0;
		char[] ch=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			
		
		
		if(ch[i]>='a' && ch[i]<='z')
		{
			
			lower++;
			//System.out.println("lower case");
		}
		
		else if(ch[i]>='A' && ch[i]<='Z')
		{
			upper++;
			//System.out.println("Upper case");
		}
		
		else if(ch[i]>='0' && ch[i]<='9')
		{
			digit++;
			//System.out.println("digit");
		}
		
		else
		{
			special++;
			//System.out.println("special char");
		}
		
		
		}
			
		 System.out.println("upper= "+upper);
		 System.out.println("lower= "+lower);
		 System.out.println("digit= "+digit);
		 System.out.println("special= "+special);
	
		
		
	}
}
