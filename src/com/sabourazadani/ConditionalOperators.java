package com.sabourazadani;

public class ConditionalOperators {

	public static void main(String[] args) {
		// variable = (condition) ? expressionTrue :  expressionFalse;
		
		int a = 20; 
		boolean x = a > 5 ? true : false; 
		
		System.out.println(x);
		
		
		int age = 20; 
		System.out.println(age >= 21   ?  " You can drive "   :    " You can not drive yet");
		
		
		int age1 =80;
		System.out.println(age1 >80 ? "You are a senior citizen" : "You are not that old");
		
		String result = age >= 21 ?  " get in " : " can let you in";
		System.out.println(result);
		
		
		boolean notSure = age >= 21 ? true : age  > 20 ? true : false;
		System.out.println(notSure);
		
		int vote = 1_000_000_000;
		String resultVote = (vote < 18) ? "Donald Trump" : "Joe Biden";
		System.out.println(resultVote);
	}

}
