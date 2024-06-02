package Mentoring2;

// Account 클래스는 은행 계좌의 기본 특징을 나타내는 추상 클래스
public abstract class Account {
	
	public String number;	// 식별 코드(본인)
	private double balance;	// 잔금
	private double interestRate;	// 이자 비율
	
	// 각 계좌의 이자를 계산하여 반환하는 추상 메소드
	public abstract double calculateInterest();

	// 생성자
	public Account(String number, double balance, double interestRate) {
		this.number = number;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	// 예금
	public void deposit(double money) {
		balance += money;
	}
	
	// 인출
	public void withdrawal(double money) {
		balance -= money;
	}
	
	
	// getter/setter 부분
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
}
