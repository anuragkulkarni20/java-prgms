package com.basic.interview.prgrms;

/* programe nam - Integer cachoing
 * 
 *  comaprte two integere nums
 * 
 * */

public class Integercaching {
	
	public static void main(String[] args) {
		
		// if we intailse the variable use int d.t thn integer caching not occuring 
		//int num1= 150;
		//int num2= 150;
		
		
		
		// if we decaler  wrapper - Integer varaible than inteerge caching occur
		
		 // Integer cahing range of Integer is -128 to 127 
		Integer num1 =150;
		Integer num2= 150;

		// 
		
		if (num1==num2)
		{
			System.out.println("given two nums are equal");
		
		}
		
		else
		{
			System.out.println(" gien nums are not equal" );
		}
	
	//it is same as Intger num1 = 150;interanlly it convert valueof()
	
	Integer c = Integer.valueOf (135);
	
	Integer d = Integer.valueOf (135);
    
	System.out.println( c==d );
	

	
	// here we explicityly craeting  new object so memory address will chng
	
	
	Integer p= new Integer(110);
	
	Integer q = new Integer(110);
	
	
	System.out.println(p==q);
	
	
	
	
}
}
