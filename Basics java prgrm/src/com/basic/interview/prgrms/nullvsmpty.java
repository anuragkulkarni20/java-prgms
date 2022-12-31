package com.basic.interview.prgrms;

public class nullvsmpty {
	
	public static void main(String[] args) {
		
		
		
		String s1 = null;
		
		String s2 ="";
		
		
		//System.out.println(s1.length());
		System.out.println(s2.length());
		
		//difference between null and empty 
		
		/*NULL = When String variable is assigned with null, 
		 * it indicates that the variable is not actually referring 
		 * to any memory location in the heap.
		  
		 *s1 is a String variable. It is assigned with null. Therefore, 
		 *the JVM will not allocate any memory, so the variable s1 will not 
		 *point to anything The statement String s1 = null; is also 
		 *equivalent to String s1; 
		 *When printing the length of the String s1, 
		 *it will give a null pointer exception. This is because the
		 * s1 does not refer to an actual string to count the length.
		  
		  
		  

       EMPTY STRING== When a String variable is assigned with an empty String,
         it indicates that the reference variable is referring to 
         a memory location of a string with zero length.*
         
         
         Empty refers to a string with no length.*/
		
	}

}
