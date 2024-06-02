package Class7;

public class Account {
	
	public String owner;	// 주인
	private int pin = 0;
	private int balance = 0;	// 잔액
	
	
	// 생성자
	public Account() {
		
	}
	
	
	// 입금 메소드
	public void input_money(int money) {
		balance += money;
		show_balance();
	}
	
	// 인출 메소드
	public void output_money(int money) {
		balance -= money;
		if(balance < 0) {
			System.out.println("잔액이 부족합니다.");
			balance += money;	// 확인해서 음수면 다시 원상복구 시켜줌
		}
		else {
			show_balance();
		}
	}
	
	public void show_balance() {
		System.out.println("현재 잔액은 "+ balance + "입니다.");
	}
	
	
	// 핀번호, 잔액은 private로 보호
	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
}
