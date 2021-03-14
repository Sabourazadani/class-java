package accessModifier_A;

import accessModifier_B.Mouse;

public class Cat extends Mouse{
	int age = 3; 
	String name = "Tom";
	
	public static void main(String[] args) {
		Mouse j = new Mouse(); 
		j.age = 2; 
		j.name = "jerry"; 
		System.out.println(j.age);
		System.out.println(j.name);
		// not accessible System.out.println(j.gender);
		
		
		Dog d = new Dog ();
		System.out.println(d.name);
	}
}
