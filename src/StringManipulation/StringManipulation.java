package StringManipulation;

public class StringManipulation {

	public static void main(String[] args) {
		/**
		 --> In Java, string is basically an object that represents sequence of char values. 
		  An array of characters works same as Java string. 
		  Generally, String is a sequence of characters. But in Java, string is an object that represents
		   a sequence of characters. The java.lang.String class is used to create a string object.
		  
		 --> Java String class provides a lot of methods to perform operations on strings such as 
		  compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), 
		  substring() etc.
		  
		  --> The CharSequence interface is used to represent the sequence of characters. 
		  String, StringBuffer and StringBuilder classes implement it. It means, we can create strings 
		  in java by using these three classes.
		  The Java String is immutable which means it cannot be changed. 
		  Whenever we change any string, a new instance is created. 
		  For mutable strings, you can use StringBuffer and StringBuilder classes.
		  
		  --> How to create a string object?
			There are two ways to create String object: --> 1. By string literal. --> 2. By new keyword
		 */
		char[] ch={'j','a','v','a','t','p','o','i','n','t'};  
		String s=new String(ch);  
		
		//is same as:
		// String s="javatpoint"; 

	}

}
