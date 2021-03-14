package com.sabourazadani;

public class ForLoopExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.err.println(" j>    5\t4\t3\t2\t1\t0");
			
			
			for (int i = 0; i < 10; i++) { // this goes from 0 - 9
				System.out.print(i + " * ");
				for (int j = i; j >= 0; j--) { // this goes from 5 - 0
					System.out.print( i*j + "\t");
				}
				System.out.println();
			}
	}
}
