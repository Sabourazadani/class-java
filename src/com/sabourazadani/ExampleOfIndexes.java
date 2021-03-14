package com.sabourazadani;

public class ExampleOfIndexes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is EVEN");
			} else {
				System.out.println(i + " is ODD");
			}
		}
		for (int i = 8; i < 10 && i > 5; i++) {
			System.out.println(i);
		}
		// Break - will be back at 7:45
		String fn = "Jack Ma is one of the best business man in this planet!";
		System.out.println(fn.length());
		int countOfe = 0;
		System.out.println(fn);
		for (int index = 0; index < fn.length(); index++) {
			if (fn.charAt(index) == 'e') {
				System.out.print(fn.charAt(index));
				countOfe++;
			} else {
				System.out.print('*');
			}
		}
		// create a string "this is a test"
		// loop to the size of the string and on every print one char
		// and then go to the next line
		// optional - do the same thing in reverse
		System.out.println("\nThe number of lower case 'e' in this string is " + countOfe + "\n");
		System.out.println("\n********************************");
		String data = "this is a test";
		for (int i = 0; i < data.length(); i++) {
			System.out.print(data.charAt(i) + " ");
		}
		System.out.println();
		for (int i = data.length() - 1; i >= 0; i--) {
			System.out.print(data.charAt(i) + " ");
		}
		
		System.out.println(data.charAt(13));
		
		
		
		System.out.println("\n********************************");
		System.out.println();
		System.out.println("end of the class");
		}

	}

