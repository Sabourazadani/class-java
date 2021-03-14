package com.sabourazadani;

public class ForLoopPalindromeNested {

	public static void main(String[] args) {
		/*
		code a nested for loop to print this
		
		2 1 2 3 4 5 6
		4 1 2 3 4 5 6
		6 1 2 3 4 5 6
		8 1 2 3 4 5 6
		
		*/
		
		for (int i = 2; i <= 8; i+=2) {
			System.out.print(i);
			
			for (int j = 1; j <=6 ; j++) {
				System.out.print(j);
				
			}
			System.out.println();
	}
		}
}
