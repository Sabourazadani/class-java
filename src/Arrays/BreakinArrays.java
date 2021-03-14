package Arrays;

public class BreakinArrays {

	@SuppressWarnings("unused")
	public static void main(String[] args) {		
		/** * How to break from nested loop in Java. You can use labeled 
		 *  statement with outer & inner to break from nested loop. 
		  */ 
		
			// this is our outer loop outer:
		outer: for (int i = 0; i < 4; i++) {
			
			// this is the inner loop 
		  inner: for (int j = 0; j < 4; j++) {
			  if (i + j > 5) { 
				  System.out.println("Breaking from nested loop"); 
				  break inner;
			  }
		  } System.out.println(i + " "); 
		   
		  System.out.println("exited");

		}
	}

}
