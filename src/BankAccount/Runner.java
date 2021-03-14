package BankAccount;

public class Runner {
	public static void main(String[] args) {
		BankAccount obj1 = new BankAccount(123);
		
		BankAccount obj2 = new BankAccount(147, 50.52);
		
		BankAccount obj3 = new BankAccount(258, 15.68, "Jack", "Ma");
		
		System.out.println(obj3);
		obj3.deposit(50);
		
		System.out.println(obj3.getBalance());
		obj3.withdraw(55.68);
		
	}
}