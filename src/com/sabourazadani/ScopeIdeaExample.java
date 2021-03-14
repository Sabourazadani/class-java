package com.sabourazadani;

public class ScopeIdeaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 10; 
		
		if (true) {
			int num2 = 15;
			System.out.println(num2);
		}
		
		
		/** Scope is accessible inside the region
		 * 	& Block Scope is refers to all of the code between curly braces {}
		 */
		
		// System.out.println(num2); Not Accessible 
		
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
