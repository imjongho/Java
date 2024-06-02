package Class6;

public class SafeArray {
	private int a[];
	private int length;					// 잘못된(보호될) 인덱스, public이 아닌 private로 해줌
	
	public SafeArray(int size) {
		a = new int[size];
		length = size;		// 보호할 인덱스를 저장
	}
	
	
	public int getA(int index) {	
		if(index >= 0 && index < length) {
			return a[index];
		}
		
		return -1;
	}
	
	public void setA(int index, int value) {
		if(index >= 0 && index < length) {
			a[index] = value;
		}
		else {
			System.out.println("잘못된 인덱스 " + index);
		}
	}

	
}
