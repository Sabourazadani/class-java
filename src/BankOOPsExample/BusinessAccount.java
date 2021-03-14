package BankOOPsExample;

public class BusinessAccount extends Customer {
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(String firstName, String lastName, int accountNumber, double balance) {
		super(firstName, lastName, accountNumber, balance);
	}

	@Override
	public double calcAccountCharges() {
		if (getBalance() < 1000) {
			return super.calcAccountCharges() + 15;
		}

		return 0;
	}
}