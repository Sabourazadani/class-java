package Wrapper;

public class WrapperClass {

	private static double count2;

	public static void main(String[] args) {
		/**
		 Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
		 The table below shows the primitive type and the equivalent wrapper class: 
				byte	Byte
				short	Short
				int	    Integer
				long	Long
				float	Float
				double	Double
				boolean	Boolean
				char	Character
		 */
		
		String number = "10.10"; 
		double x = Double.parseDouble(number);
		
		System.out.println(x);
		
		String acc = "1234";
		long y = Long.valueOf(acc); 
		
		System.out.println(y);
		
		Double count = 2.50; 
		Double count1 = 2.50; 
		System.out.println(count == count1);
		
		double value1 = 2.50; 
		double value2 = 2.50; 
		System.out.println(value1 == value2);
		
		
		//Sometimes you must use wrapper classes, for example when working with Collection objects, 
		//such as ArrayList, where primitive types cannot be used (the list can only store objects):


	}

}
