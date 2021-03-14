package com.sabourazadani;

public class PalindromeExample {

	public static void main(String[] args) {
		// Palindrome
		
		String t = "noon2"; 
		String tReversed = "";
		
		for (int i = t.length() -1; i >= 0; i--) {
			tReversed += t.charAt(i);
		}
		
		if (t.equals(tReversed)) {
			System.out.println("Palindrome");
			System.out.println( t + " is equal to " + tReversed);
		}
		else {
			System.out.println("Not Palindrome");
			System.out.println( t + " is NOT equal to " + tReversed);
		}

	}

}
