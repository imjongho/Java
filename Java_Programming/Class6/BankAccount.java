package Class6;

public class BankAccount {
	
	String owner;	// 주인?
	int accountNumber;	// 계좌번호?
	int balance = 0;	// 잔액
	
	// 예금 입금 메소드
	public void deposit(int money) {
		balance += money;
	}
	
	// 예금 인출 메소드
	public void withdraw(int money) {
		balance -= money;
	}
	
	public String toString() {		// toString 이어야 함
		return "현재 잔액은 "+ balance + "입니다.";
	}
	
}
