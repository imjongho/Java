package threadTest;

class Account1 {
	private int total = 0;
	synchronized void deposit() {
		total = total + 1000;
	}
	int gettotal() {
		return total;
	}
}


class Customer1 implements Runnable {
	Account1 same_a;
	String name;
	
	Customer1(Account1 a, String s){
		same_a = a;
		name = s;
	}
	
	public void run() {
		for(int i = 1; i <= 200; i++) {
			System.out.println(name + " : " + i + "번째");
			same_a.deposit();
			if(same_a.gettotal() >= 500000) {
				break;
			}
		}
	}
}


public class Test1 {
	public static void main(String[] args) throws Exception {
		Account1 same_account = new Account1();
		Customer1 donator1 = new Customer1(same_account, "1번째 성금자");
		Customer1 donator2 = new Customer1(same_account, "2번째 성금자");
		Customer1 donator3 = new Customer1(same_account, "3번째 성금자");
		Customer1 donator4 = new Customer1(same_account, "4번째 성금자");
		Customer1 donator5 = new Customer1(same_account, "5번째 성금자");
		
		Thread t1 = new Thread(donator1);
		Thread t2 = new Thread(donator2);
		Thread t3 = new Thread(donator3);
		Thread t4 = new Thread(donator4);
		Thread t5 = new Thread(donator5);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();
		
		System.out.println("성금 총액은 : " + same_account.gettotal());
		
	}

}
