package accessModifier_B;

public class Mouse {
	// instance variable
	public int age = 2; 
	public String name = "Jerry";
	private String gender = "male"; // accessible within the class 
	protected String birth = "Nov-2nd-2019"; // 
	
	void bark () {
		gender = "female";;
	}
	public String walk (String S) {
		name = S;
	
		return name; 
	}
	
	public static void main(String[] args) {
		Mouse j = new Mouse ();
		j.gender = "male";
		
	}
		
	}

