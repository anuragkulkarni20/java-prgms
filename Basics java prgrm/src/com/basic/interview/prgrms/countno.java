package com.basic.interview.prgrms;

/*Count enterd numnber length
 * 
 *  count number of digit in enterd numnered
 *  */

public class countno {
	
	// global /static varible 
	int num ;
	//int count ;
	int i;
	public static void main(String[] args) {
		
		System.out.println("enter number ");
		
	    int num1 =673321;
	    int count=0;
		
	     for (int i=num1;i>0;i=i/10)
	     {
	    	 count++;
	     } 	
	     System.out.println(count);
	     
	     count=0;
	     
	     String s="ajaymohite from";
	     char ch[]=s.toCharArray();
	    // System.out.println(s.length());
	  //    System.out.println(ch.length);
	     
	     for (int i = 0; i < ch.length; i++) {
	    	 
	    	 if(ch[i]!=' ')
	    	 {
			count++;
	    	 }
		}
	     
	     System.out.println(count);
	     
		
	}
	

}
