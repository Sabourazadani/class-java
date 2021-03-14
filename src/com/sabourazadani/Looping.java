package com.sabourazadani;

public class Looping {

	public static void main(String[] args) {
		// Loops can execute a block of code as long as a specified condition is reached.
		// Loops are handy because they save time, reduce errors, and they make code more readable.
		
		// The while loop loops through a block of code as long as a specified condition is true:
		
//		int i = 7;
//		while (i < 5) {
//		  System.out.println(--i + "");
//		  i++;
		  
		/** The do/while loop is a variant of the while loop. 
		 * This loop will execute the code block once, before checking if 
		 * the condition is true, 
		 * then it will repeat the loop as long as the condition is true.
		 */
		  
//		  int p = 0;
//		  do {
//		    System.out.println(p);
//		    p++;
//		  }
//		  while (p < 5);
//		  
		
//		  
//		  int num1 = 7;
//			while (num1 >3) {
//			  System.out.println(--num1);
		
		
			char c;

			for(c = 'A'; c <= 'Z'; ++c)
				System.out.print(c + " ");
		
//		int n;
//		if(n > 0){ 
//			System.out.println(n - 1 + " ");
		
//		int number = 1; 
//		System.out.println(--number);
			
			char abcLetters = 'A';
			while (abcLetters != 'Z' + 1) {
				System.out.print(abcLetters++ +" ");
			}
			
			int numbers = 1; 
			while (numbers != 10 + 1) {
				System.out.print(numbers++ + " ");
			}
		
		 
		}
	}

