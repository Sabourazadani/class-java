package OOP;

import BankAccount.BankAccount;

public class Runner {
	
	public static void main(String[] args) {

	
	Student st1 = new Student();
	Student st2 = new Student();
	Student st3 = new Student();
	
	st1.fn = "jack";
	st1.age = 21;
	
	st2.fn = "micha";
	st3.fn = "joe";
	
	System.out.println(st1.getFirstName());
	
	Student st4 = new Student("Michael", "Jackson", 90);
	
	System.out.println(st1.fn + " age is " + st1.age );
	
	System.out.println(st4.fn);
	
	System.out.println("\n**************************************");
	
	Car v1 = new Car ("");
	System.out.println(v1.getType());
	
	v1.setType("Tesla");
	System.out.println(v1.getType());
	
	System.out.println("\n**************************************");
	
	
	}
	
}