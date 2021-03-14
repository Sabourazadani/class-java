package com.sabourazadani;

public class LogicIsFun {

	public static void main(String[] args) {
		//Template for if statements
		
		//Outputs "Good evening."
		
		int age = 20;
		
		if (age < 18) {
		  System.out.println("Practice.");
		} 
		else {
		 System.out.println("Good evening.");
		  
		}
		
		// Outputs "Happy Learning."
		
		int time = 22;
		
		if (time < 10) {
		  System.out.println("Good morning.");
		} 
		else if (time < 20) {
		  System.out.println("Good day.");
		} 
		else {
		  System.out.println("Happy Learning.");
		  
		}
		
		
		int grade = 78;
		
		if (grade >=95) {
				System.out.println("A+");
				}
				else if (grade >= 90) {
					System.out.println("A-");
			
		}
				else if (grade >= 85) {
					System.out.println("B+");
		}
				else if (grade >=80) {
					System.out.println("B-");
		} 
				else if (grade >= 70) {
					System.out.println("C+");
		} 
				else if (grade >= 60){
					System.out.println("C_");
				}
		
		
		
		
	}
}