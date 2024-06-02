package Class6;
import java.util.*;

public class DateTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("연 월 일을 입력하세요 : ");
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		Date date = new Date(year, month, day);
		date.print1();
		date.print2();
		
		sc.close();
	}

}
