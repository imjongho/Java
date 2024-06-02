package Class6;

public class Date {
	
	int year, month, day;	// 년 월 일
	
	// 생성자
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	// 날짜를 2022.08.15와 같이 출력
	void print1() {
		System.out.println(year + "." + month + "." + day);
	}
	
	// 날짜를 8 15, 2022롸 같이 출력
	void print2() {
		System.out.println(month + " " + day + ", " + year);
	}
	
}
