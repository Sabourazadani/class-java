package com.sabourazadani;

public class ForLoops {

	public static void main(String[] args) {
		/** When you know exactly how many times you want to loop 
		 * through a block of code, use the for loop instead of a 
		 * while loop
		 */
		for (int i = 0; i < 10; i++) {
		if (i % 2 == 0) {
			System.out.print(i + " is EVEN ");
		} else {
			System.out.println( i + " is ODD");
		}
	}
		
		
		for (int j = 0; j <= 17; j += 3) {
		System.out.println (j);
		}
	
	}

}
