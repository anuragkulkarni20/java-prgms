package com.basic.interview.prgrms;
/*Q = Without using semicomma print hello world in programme
 * 
 * programe name : Print hello world without using semicomma
 * 
 *  date- 29-dec 2022
 * 
 * */
public class withoutsemicoma {

	
	
	public static void main(String[] args) {
		
		
		
		// noraml way of printing hello world
		System.out.println(" hello world");
		
		// 1st way  using printf methood 
		
		if (System.out.printf(" Hello world" + "\n")== null)
		{
			// empty bracses
		}
		
		
		//2 using append 
		
		if (System.out.append(" Hello world" + "\n")== null)
		{
			// empty bracses
		}
		
		
		// 3 using append + equals metod
		if (System.out.printf(" Hello world" + "\n").equals(null))
		{
			// empty bracses
		}
		
		
		//4 using for loop indirectly we use here semi comma
		
		
		for( int i =0;i<1; System.out.println(" Hello world" + "\n")){
			
			i++;
		} 
			
			
		}
		
	}

