package JavaBsics;

public class StackHeap {

	public static void main(String[] args) {
		// Only instances of primitive types (int, long, ...) are saved on stack. 
		// All instances of reference types (String, Integer, Long, YourTypeHere, ...) 
		// are saved in heap.
		String s1 = "Cat";
		String a2 = "Cat";
		String s3 = new String ("Cat");
		System.out.println(s3);
		
		int x = 10; 
		int y = 10;
		System.out.println( x ==y);
		
		
		String t = new String ("test");
		String t1 = new String ("test");		
		System.out.println(t ==  t1);
		
		
		String x1 = "test";
		String substrx1 = x1.substring(0);
		//System.out.println(x1);
		
		String j1 = new String ("test");
		String j2 = new String ("test");
		
		//System.out.println(j1 == j2);
		
		//String s1="Javatpoint";
		String substr = s1.substring(0); // Starts with 0 and goes to end.
		
		//System.out.println(substr);
		
		
		
		
		

	}

}
