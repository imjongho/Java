package threadTest;

class CharThread extends Thread {
	private char pchar;
	public int count;
	public CharThread(char ch, int c) {
		pchar = ch;
		count = c;
	}
	
	public void run() {
		for(int i = 1; i < count; i++) {
			System.out.print(pchar + ",");
		}
	}
}

class NumThread extends Thread {
	private int lastNum;
	public NumThread(int c) {
		lastNum = c;
	}
	
	public void run() {
		for(int i = 1; i <= lastNum; i++) {
			System.out.print(i + ",");
		}
	}
}


public class TripleThread {
	public static void main(String[] args) {
		CharThread ct1 = new CharThread('x', 50);
		CharThread ct2 = new CharThread('y', 50);
		NumThread nt1 = new NumThread(50);
		
		ct1.start();
		ct2.start();
		nt1.start();
		
	}

}
