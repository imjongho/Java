package threadTest;

class Account2 {
	private int total = 0;
	synchronized void deposit() {
		total = total + 1000;
	}
	int gettotal() {
		return total;
	}
}


class Customer2 extends Thread {
	Account2 same_a;
	
	Customer2(Account2 a, String s){
		same_a = a;
		setName(s);
	}
	
	public void run() {
		for(int i = 1; i <= 200; i++) {
			System.out.println(getName() + " : " + i + "번째");
			
			if(same_a.gettotal() >= 500000) {
				break;
			}
			else {
				same_a.deposit();	// 이 문장만 이동함
			}
		}
	}
}


public class Test2 {
	public static void main(String[] args) throws Exception {
		Account2 same_account = new Account2();
		Customer2 donator1 = new Customer2(same_account, "1번째 성금자");
		Customer2 donator2 = new Customer2(same_account, "2번째 성금자");
		Customer2 donator3 = new Customer2(same_account, "3번째 성금자");
		Customer2 donator4 = new Customer2(same_account, "4번째 성금자");
		Customer2 donator5 = new Customer2(same_account, "5번째 성금자");
		
		donator1.start();
		donator2.start();
		donator3.start();
		donator4.start();
		donator5.start();
		
		donator1.join();
		donator2.join();
		donator3.join();
		donator4.join();
		donator5.join();
		
		System.out.println("성금 총액은 : " + same_account.gettotal());
		
	}

}
