package BankOOPsExample;

public class Customer {
	private String firstName;
	private String lastName;
	private int accountNumber;
	private double balance;

	public Customer() {
		this.firstName = "";
		this.lastName = "";
		this.accountNumber = 0;
		this.balance = 0;
	}

	public Customer(String firstName, String lastName, int accountNumber, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAccountNumber() {

		return this.accountNumber;
	}

	public void setAccountNumer(int accountNumber) {
		if (this.accountNumber == 0) {
			this.accountNumber = accountNumber;
		} else {
			System.out.println("The account number is already assigned to this Customer.");
		}
	}

	public double getBalance() {
		return this.balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount < balance) {
			System.out.println("Successful withdraw: $" + amount);
			balance -= amount;
		} else {
			System.out.println("Withdraw Failed: Insufficient balance. The amount of $" + amount
					+ " is more than your balance ($" + balance + ").");
		}
	}

	public double calcAccountCharges() {
		// if the balance is more 1000$, then the charges don't apply.
		// other than that, the charges would generally be 5% of the balance
		// + 10$ for checking accounts
		// + 5$ for saving accounts
		// + 15$ for business accounts
		if (balance >= 1000) {
			return 0;
		}
		return balance * 0.05;
	}

	@Override
	public String toString() {
		return "[FirstName: " + this.firstName + ", LastName: " + this.lastName + ", Account#: " + this.accountNumber
				+ ", Balance: $" + this.balance + "]";
	}
}