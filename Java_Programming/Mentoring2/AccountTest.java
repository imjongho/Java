package Mentoring2;

public class AccountTest {

	public static void main(String[] args) {
		// SavingsAccount 객체 생성
		SavingsAccount sa = new SavingsAccount("SA001", 1000.0, 0.05);
		System.out.println("Savings Account:");
		System.out.println("Account Number: " + sa.number);
		System.out.println("Balance: $" + sa.getBalance());
		System.out.println("Interest: $" + sa.calculateInterest());
		System.out.println();
		
		// CheckingAccount 객체 생성
		CheckingAccount ca = new CheckingAccount("CA001", 2000.0, 1.0);
		System.out.println("Checking Account:");
		System.out.println("Account Number: " + ca.number);
		System.out.println("Balance: $" + ca.getBalance());
		System.out.println("Interest: $" + ca.calculateInterest());
		System.out.println();
		
		// 예금 및 인출 테스트
		sa.deposit(500.0);
		ca.deposit(1000.0);
		sa.withdrawal(200.0);
		ca.withdrawal(300.0);
		
		System.out.println("Savings Account - Updated Balance: $" + sa.getBalance());
		System.out.println("Checking Account - Updated Balance: $" + ca.getBalance());
	}

}
