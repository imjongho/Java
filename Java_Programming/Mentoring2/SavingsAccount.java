package Mentoring2;

public class SavingsAccount extends Account {

	public SavingsAccount(String number, double balance, double interestRate) {
		super(number, balance, interestRate);
	}

	
	@Override
	public double calculateInterest() {
		return (getBalance() * getInterestRate());
	}
	
	
}
