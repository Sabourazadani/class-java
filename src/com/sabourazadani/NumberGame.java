package com.sabourazadani;

import java.util.Random;
import java.util.Scanner;


public class NumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random(); 
		
		int num = rand.nextInt(100) + 1;
		
		System.out.println("I'm thinking of a number" + " between 1 and 10. Try to guess it.");
		
		Scanner scan = new Scanner(System.in);int guess = scan.nextInt();
		
		if(guess > num) { 
			System.out.println("Too high");
		}else if(guess < num) { 
			System.out.println("Too low");
		
		}else {
			System.out.println("Correct!");
		}
		System.out.println("The number was " + num);
		
		
		
		
		}
}
