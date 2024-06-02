package threadTest;

class BankAccount {
	private int balance = 0;	// 초기 잔액 0원
	
	public synchronized void deposit(int money) {
		balance = balance + money;
		System.out.println("저축" + money + "원\t잔액 : " + balance);
		notify();	// 인출 스레드를 깨움
	}
	
	public synchronized void withdraw(int money) {
		if(balance < money) {
			try {
				System.out.println("인출" + money);
				wait();	// 저축이 발생하기를 기다림
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		else {
			balance = balance - money;
			System.out.println("인출" + money + "원\t잔액 : " + balance);
		}
		
	}
	
	public int gettotal() {
		return balance;
	}
}


class DepositThread extends Thread {		// 스레드 동작
	
	private BankAccount account;
	
	DepositThread(BankAccount ba){
		account = ba;
	}
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			int money = (int)(Math.random()*10) + 1;	// 1~10원
			account.deposit(money);
			try {	// 천천히 보려고 넣음
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
	}
}


class WithdrawThread extends Thread {
    private BankAccount account;

    public WithdrawThread(BankAccount ba) {
        account = ba;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            int money = (int)(Math.random()*10) + 1;
            account.withdraw(money);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Test3 {
	public static void main(String[] args) throws Exception {
	
		BankAccount account = new BankAccount();
        DepositThread depositThread = new DepositThread(account);
        WithdrawThread withdrawThread = new WithdrawThread(account);

        depositThread.start();
        withdrawThread.start();

	}

}
