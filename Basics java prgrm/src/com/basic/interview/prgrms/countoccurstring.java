package com.basic.interview.prgrms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countoccurstring {
	
	
	public static void getCharcount(String name) {
		
		
		Map<Character, Integer> charMap = new HashMap<Character,Integer>();

		char strArray[] = name.toCharArray();
		
		
		
		for (char c :strArray) {
			
			if (charMap.containsKey(c)) {
			
			 charMap.put(c,charMap.get(c)+1);
			 
			 
			}
			
			else
			{
				charMap.put(c,1);
				 	
			}
		}
		
		
		System.out.println(name + "  :  "+ charMap);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("eneter a string ");
		Scanner sc =new Scanner(System.in);
		
		String str = sc.nextLine();
		
		getCharcount(str);
		
		
		//getcountoccurstring("test");
	
	}

}
