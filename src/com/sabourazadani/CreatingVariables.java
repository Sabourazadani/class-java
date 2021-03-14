package com.sabourazadani;

public class CreatingVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("First Java Program! $");
		
		double price = 12.99;
		double taxRate = 3.87 / 100;
		double discount = 0.055;
		int quantity = 7;
		double beforeTax = (price * quantity) - (price * quantity * discount);
		double total = (beforeTax * taxRate) + beforeTax;
		
		
		System.out.println(total);
		
		
		// create String with the value "This is ". you can name the String s1
		
		String s1 = "This is ";
		
		// create an int with the value 10 and name it num1
		
		int num1 = 10;
		
		// create String s2 with the value "th times that I am asking this!"
		
		String s2 = "th times that I am asking this!";
		
		// create String s3 "No one is answering me! But Why?!"
		
		String s3 = "No one is answering me! But Why?!";
		
		// using the variables above, form one sentence and print it
		// you need to use one System.out.println(); but print the text in two lines
		// and before you print this, you need to leave two lines empty
		
		System.out.println("\n\n" + s1 + num1 + s2 + "\n" + s3);
		
		
		
		
		
		
		
		
	}

}
