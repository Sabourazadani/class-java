package BankOOPsExample;

public class SavingAccount extends Customer {
	public SavingAccount() {
		super();
	}

	public SavingAccount(String firstName, String lastName, int accountNumber, double balance) {
		super(firstName, lastName, accountNumber, balance);
	}

	@Override
	public double calcAccountCharges() {
		if (getBalance() < 1000) {
			return super.calcAccountCharges() + 5;
		}

		return 0;
	}

}