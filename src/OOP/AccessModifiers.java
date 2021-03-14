package OOP;

public class AccessModifiers {
	/** The public keyword is an access modifier, meaning that it is used to set
	 *  the access level for classes, attributes, methods and constructors.
	     We divide modifiers into two groups:
	    1. Access Modifiers - controls the access level
		2. Non-Access Modifiers - do not control access level, 
		   but provides other functionality
		   
		public	The class is accessible by any other class
		default	The class is only accessible by classes in the same package. 
				This is used when you don't specify a modifier.
		private	The code is only accessible within the declared class
		protected	The code is accessible in the same package and subclasses. 
	 */
	
	private static int intNum;
	protected double doubleNum;
	private String s = "text";
	
	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers ();
		AccessModifiers.intNum = 24; 
		am.doubleNum = 7.9;
		am.s = "Sabour Azadani";
		
		System.out.println("\nintNum = "+ AccessModifiers.intNum );
		System.out.println("\ndouble = "+ am.doubleNum );
		System.out.println("\nS = " + am.s);

	}
}
