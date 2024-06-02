package swingExample4;
import java.util.Calendar;

public class Calendar1 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.print("현재 날짜 : ");
		System.out.print(calendar.get(Calendar.YEAR) + "년 ");
		System.out.print((calendar.get(Calendar.MONTH) + 1) + "월 ");
		System.out.print(calendar.get(Calendar.DATE) + "일");

	}

}
