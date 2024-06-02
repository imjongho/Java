package Class6;

public class SafeArrayTest {

	public static void main(String[] args) {

		int size = 3;
		SafeArray safe_arr = new SafeArray(size);	// 객체 생성
		
		for(int i = 0; i < size+1; i++) {
			safe_arr.setA(i, i*10);	
		}
		
		
		
	}

}
