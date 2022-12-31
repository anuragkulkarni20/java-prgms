package com.basic.interview.prgrms;


/*Programme name: comapre two strings are matching or not 
 * 
 * Q chcek the two string are equals are not
 * 
 *   diffrence between '==' operator vs .equals method 
 * date- 30 dec 2022
 * 
 * 
 * */
public class stringobject {

	
	
	public static void main(String[] args) {
		
		
		
		
		String s1= "Anurag kulkarni";
	
	
		String s2= "Anurag kulkarni";
	
	
	    String s3= s1;
	
	    
	    System.out.println(s1==s2);
	    
	    System.out.println(s2==s3);

	    System.out.println(s1==s3);
	    
	    
	    // creating new objet for storning same value
	    
	    String A =new String("Anurag kulkarni");
	    
	    String B = new String ("Anurag kulkarni");
	    
	    /* eqaulas == operators compares object refrence means 
	     * meormy addres of these object if it is same then it will give true
	    
	    * here String a B are pointing two diffrennt memory address bcz at 
	    * the tym creating it uses new key word explicitly it will 
	    * create new object so memory address of these 
	    * two object is diffrent thats why there memory addres is 
	    * difrent having same content /value it will gievs you false when it compares  
	    * 
	    *
	    */
	    System.out.println(A==B);
// equlas method checks/ compares the conetent value of object
	    System.out.println(A.equals(B));

	
	    
	    
	
	
	}
}
