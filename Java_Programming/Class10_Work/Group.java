package Class10_Work;

// S, A, B 그룹 별 좌석 관리
public class Group {
	
	// S석, A석, B석으로 구분
	String[] seatS;
	String[] seatA;
	String[] seatB;
	
	// 생성자
	Group() {
		// 각각 10개의 좌석이 있음
		seatS = new String[10];
		seatA = new String[10];
		seatB = new String[10];
		
		// 좌석 초기화
		for(int i = 0; i < 10; i++) {
			seatS[i] = "---";
			seatA[i] = "---";
			seatB[i] = "---";
		}
	}
	

	// 오버로딩 showSeat
	public void showSeat(int seatType) {
		switch(seatType)
		{
			case 1:
				System.out.print("S>> ");
				showSeat(seatS);
				break;
			case 2:
				System.out.print("A>> ");
				showSeat(seatA);
				break;
			case 3:
				System.out.print("B>> ");
				showSeat(seatB);
				break;
		}
	}
	
	
	// 좌석 한줄 출력 메소드
	public static void showSeat(String seat[]) {
		for(int i = 0; i < seat.length; i++) {
			System.out.print(seat[i] + " ");
		}
		System.out.println();
	}
	
	
	// 모든 좌석 출력하는 메소드
	public void showAll() {
		System.out.print("S>> ");
		showSeat(seatS);
		
		System.out.print("A>> ");
		showSeat(seatA);
		
		System.out.print("B>> ");
		showSeat(seatB);
		
		System.out.println("<<<조회를 완료하였습니다.>>>");
	}
	
	
	
	
}
