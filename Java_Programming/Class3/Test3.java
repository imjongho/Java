package Class3;
import java.util.*;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요일을 입력하세요 : ");
		String week = sc.next();
		
		switch(week)
		{
			case "Mon":
			case "Tue":
			case "Wes":
			case "Thu":
			case "Fri":
				System.out.print("주중");
				break;
			case "Sat":
			case "Sun":
				System.out.print("주말");
				break;
		}

	}

}
