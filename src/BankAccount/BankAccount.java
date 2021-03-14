package BankAccount;

public class BankAccount {

	private String firstName;
	private String lastName;
	private int accountNumber;
	private double balance;
	private int phoneNumber;

	public BankAccount() {
		this.firstName = "";
		this.lastName = "";
		this.accountNumber = 0;
		this.balance = 0;
		this.phoneNumber = 0;
		System.out.println("Construtor:  public BankAccount()");
	}
	/**
	 * The this keyword refers to the current object in a method or constructor.
	 * 
	 * The most common use of the this keyword is to eliminate the confusion between
	 * class attributes and parameters with the same name (because a class attribute
	 * is shadowed by a method or constructor parameter)
	 * 
	 *  this keyword has two use cases
	 	this.variable or method name
		this() <<< this will call any of the constructors of your class. match the signature
	 */

	//
	public BankAccount(int accountNumber) {
		this();
		this.accountNumber = accountNumber;
	}

	public BankAccount(int accountNumber, double balance) {
		this(accountNumber);
		this.balance = balance;
	}

	public BankAccount(int accountNumber, double balance, String firstName, String lastName) {
		this(accountNumber, balance);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}

	public String toString() {
		return "[ First Name: " + firstName + ", Last Name: " + lastName + " ]";
	}

	// deposit
	public void deposit(double amount) {
		this.balance += amount;
	}

	//withdraw  1%
	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("amouont requested is more than your balance");
		} else {
			this.balance -= amount;
			this.balance -= amount * 0.01;

			System.out.print("$" + amount + " is deducted from your account. And $" + amount * 0.01
					+ " interest is deducted as well\n Your balance is $" + balance);
		}
		
	}
}
