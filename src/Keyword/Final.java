package Keyword;

public class Final {

	public static void main(String[] args) {
		/**
		 	In Java, the final keyword can be used while declaring an entity. 
		 	Using the final keyword means that the value can’t be modified in the future. 
		 	This entity can be - but is not limited to - a variable, a class or a method
		 	
		 	1. Final Variable
		 	--> If a variable is declared with the final keyword, its value cannot be changed once 
		 	initialized. Note that the variable does not necessarily have to be initialized at 
		 	the time of declaration. If it’s declared but not yet initialized, 
		 	it’s called a blank final variable.
		 	
		 	2. Final parameters
			--> If you ever see the final keyword with a parameter variable, 
				it means that the value of this variable cannot be changed anywhere in the function
				
			3. Final methods
			--> A method, declared with the final keyword, cannot​ be overridden or hidden by subclasses.
			
			4. Final classes
			--> A class​ declared as a final class, cannot be sub-classed


		 	
		 */
		
		
		// declaring a final variable
		  final int var = 50;
		        
		  //This line would give an error
		 
		  //  var = 60 
		 
		 /** 
		     For a final reference variable you cannot change what object it refers to. 
		     You can, however, modify the object itself.
		 */
	}

}
