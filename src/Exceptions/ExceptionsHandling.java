package Exceptions;

public class ExceptionsHandling {

	public static void main(String[] args) {
/*
		try {
			// code that may raise exception
			int data = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		// rest code of the program
		System.out.println("rest of the code...");
*/		
		 
		int i=50;  
	    int j=0;  
	    int data;  
	        try  
	        {  
	        data=i/j; //may throw exception   
	        }  
	            // handling the exception  
	        catch(Exception e)  
	        {  
	             // resolving the exception in catch block  
	            System.out.println(i/(j+2));  
	        }
	}
}