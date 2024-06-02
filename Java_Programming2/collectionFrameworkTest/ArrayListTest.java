package collectionFrameworkTest;
import java.util.*;

public class ArrayListTest {
	public static void main(String[] args) {
		String[] fruitName = {"Apple", "Banana", "Mango", "Pear", "Grape"};
		ArrayList<String> fruitList = new ArrayList<String>(Arrays.asList(fruitName));
		
		System.out.println("Mango의 위치:" + fruitList.indexOf("Mango"));
	}

}
