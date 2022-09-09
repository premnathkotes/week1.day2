package week1.day2;

import java.util.Iterator;

public class ChnageOddIndexToUpperCase {

	public static void main(String[] args) {

		/*
		 Pseudo Code
		 
		 * Declare String Input as Follow
		  
		 * String test = "changeme";
		 
		 * a) Convert the String to character array
		 
		 * b) Traverse through each character (using loop)
		 
		 * c)find the odd index within the loop (use mod operator)
		 
		 * d)within the loop, change the character to uppercase, if the index is odd else don't change
		  
		 */
		
		String str="changeme"; 
		char[] charArray=str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			
			char c = charArray[i];
			
			if (i%2!=0) {
				
				c= Character.toUpperCase(c);
				
			}
			System.out.print(c);
		}
		
	}

}
