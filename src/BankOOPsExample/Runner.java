package BankOOPsExample;

public class Runner {
	public static void main(String[] args) {
		CheckingAccount obj1 = new CheckingAccount();
		obj1.deposit(500);
		System.out.println(obj1);
		System.out.println("Charges for Obj1: $" + obj1.calcAccountCharges());

		SavingAccount obj2 = new SavingAccount();
		obj2.deposit(500);
		System.out.println(obj2);
		System.out.println("Charges for Obj2: $" + obj2.calcAccountCharges());

		System.out.println("************** testing transfer method");
		System.out.println("***First Transfer***");
		System.out.println(obj1);
		System.out.println(obj1.transferWithZelle(100));
		System.out.println("***Second Transfer***");
		System.out.println(obj1);
		System.out.println(obj1.transferWithZelle(400));
		System.out.println(obj1);
	}
}