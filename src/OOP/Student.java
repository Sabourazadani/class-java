package OOP;

public class Student {

	/**
	 * everything in Java is associated with classes and objects, along with its
	 * attributes and methods. A Class is like an object constructor, or a
	 * "blueprint" for creating objects.
	 */

	// variables
	String fn;
	String ln;
	int age;

	public Student() {
		fn = "";
		ln = "";
		age = 0;
	}
	public Student(String firstName, String lastName, int newAge) {
		fn = firstName;
		ln = lastName;
		age = newAge;
	}
	public Student (String firstName) {
		fn = firstName;
		ln = ""; 
		age = 0;
		
	}
	public String getFirstName () {
		return fn;
	}
}
