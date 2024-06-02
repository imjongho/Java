package swingExample3;
import java.util.*;
import java.time.*;

public class DateCompareTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1번째 날짜 입력(입력 형태 : 2000-03-22) : ");
		String date1 = sc.nextLine();
		StringTokenizer st1 = new StringTokenizer(date1, "-");
		LocalDate start = LocalDate.of(Integer.parseInt(st1.nextToken()),
				Integer.parseInt(st1.nextToken()), Integer.parseInt(st1.nextToken()));
		/* 내가 쓴 코드
		int year = Integer.parseInt(st1.nextToken());
		int month = Integer.parseInt(st1.nextToken());
		int day = Integer.parseInt(st1.nextToken());
		LocalDate start = LocalDate.of(year, month, day);
		*/
		
		
		System.out.print("2번째 날짜 입력(입력 형태 : 2000-03-22) : ");
		String date2 = sc.nextLine();
		StringTokenizer st2 = new StringTokenizer(date2, "-");
		LocalDate end = LocalDate.of(Integer.parseInt(st2.nextToken()),
				Integer.parseInt(st2.nextToken()), Integer.parseInt(st2.nextToken()));
		/*
		year = Integer.parseInt(st2.nextToken());
		month = Integer.parseInt(st2.nextToken());
		day = Integer.parseInt(st2.nextToken());
		LocalDate end = LocalDate.of(year, month, day);
		*/
		
		Period a = Period.between(start, end);
		
		System.out.print("날짜의 차이는(년월일) : " + a.getYears() + "년" + a.getMonths() + "월" + a.getDays() + "일");
		
		
	}

}
