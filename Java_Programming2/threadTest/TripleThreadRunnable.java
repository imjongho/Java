package threadTest;

class CharThread2 implements Runnable {
	private char pchar;
	public int count;
	public CharThread2(char ch, int c) {
		pchar = ch;
		count = c;
	}
	
	public void run() {
		for(int i = 1; i < count; i++) {
			System.out.print(pchar + ",");
		}
	}
}

class NumThread2 implements Runnable {
	private int lastNum;
	public NumThread2(int c) {
		lastNum = c;
	}
	
	public void run() {
		for(int i = 1; i <= lastNum; i++) {
			System.out.print(i + ",");
		}
	}
}

public class TripleThreadRunnable {
	public static void main(String[] args) {
		CharThread2 ct1 = new CharThread2('x', 50);
		CharThread2 ct2 = new CharThread2('y', 50);
		NumThread2 nt1 = new NumThread2(50);
		
		Thread ct1t = new Thread(ct1);
		Thread ct2t = new Thread(ct2);
		Thread nt1t = new Thread(nt1);
		
		ct1t.start();
		ct2t.start();
		nt1t.start();

	}

}
