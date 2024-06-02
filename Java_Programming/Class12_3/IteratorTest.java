package Class12_3;
import java.util.Iterator;

public class IteratorTest implements Iterator<Object> {
	
	private String[] cardNames = {
			"2", "3", "4", "5", "6", "7", "8", "9",
			"10", "Jack", "Queen", "King", "Ace" }; 
	
	private int count = 0;
	
	@Override
	public boolean hasNext() {
		if(count == cardNames.length) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public Object next() {
		return (Object) cardNames[count++];
	}
	
	public static void main(String[] args) {
		IteratorTest it = new IteratorTest();
		for(int i = 0; i < 13; i++) {
			System.out.print("next()가 반환하는 값:");
			System.out.println(it.next());
		}
	}
	
}
