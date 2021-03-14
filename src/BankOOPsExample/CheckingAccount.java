package BankOOPsExample;

public class CheckingAccount extends Customer {
	public CheckingAccount() {
		super();
	}

	public CheckingAccount(String firstName, String lastName, int accountNumber, double balance) {
		super(firstName, lastName, accountNumber, balance);
	}

	@Override
	public double calcAccountCharges() {
		if (getBalance() < 1000) {
			return super.calcAccountCharges() + 10;
		}
		return 0;
	}

	public boolean transferWithZelle(double amount) {
		// charges for the zelle is 10% of the amount transferring
		// if the balance is more than charges + amount, then transfer, if not, don't
		double amountToDeduct = amount + (amount * .1);
		if (amountToDeduct < getBalance()) {
			withdraw(amountToDeduct);
			System.out.println("Success Zelle transfer: $" + amount + " is sent and $" + (amount * .1)
					+ " charges are deducted from your balance. ");
			return true;
		} else {
			System.out.println("Fail Zelle transfer: $" + amount + " and $" + (amount * .1) + " charges ($"
					+ amountToDeduct + ") is more than your existing balance ($" + getBalance() + ").");
			return false;
		}
	}
}