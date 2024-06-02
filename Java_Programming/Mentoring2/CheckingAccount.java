package Mentoring2;

public class CheckingAccount extends Account {

	public CheckingAccount(String number, double balance, double interestRate) {
		super(number, balance, interestRate);
	}

	@Override
	public double calculateInterest() {
		return (getBalance() * getInterestRate());
	}

}
