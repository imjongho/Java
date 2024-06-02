package Class10_Work;

// 좌석 각각에 대한 관리
public class Seat extends Group {	// 상속 사용: 좌석의 배열을 사용하기 위함
	
	
	// 생성자
	Seat() {
		//super();
	}
	
	
	// 좌석을 이름으로 예약하는 메소드(좌석 하나에 간섭)
	public void inputSeat(String name, int number, int seatType) {
		
		switch(seatType) 
		{
			case 1:
				if(seatS[number-1].equals("---")) {
					seatS[number-1] = name;
				}
				else {
					System.out.println("예약된 자리입니다.");
				}
				break;
			case 2:
				if(seatA[number-1].equals("---")) {
					seatA[number-1] = name;
				}
				else {
					System.out.println("예약된 자리입니다.");
				}
				break;
			case 3:
				if(seatB[number-1].equals("---")) {
					seatB[number-1] = name;
				}
				else {
					System.out.println("예약된 자리입니다.");
				}
				break;
		}
		
	}
	
	
	// 예약자의 이름을 찾아 취소하는 메소드(좌석 하나에 간섭)
	public void cancelSeat(String name, int seatType) {
		switch(seatType) 
		{
			case 1:
				for(int i = 0; i < 10; i++) {
					if(name.equals(seatS[i])) {
						seatS[i] = "---";
					}
				}
				break;
			case 2:
				for(int i = 0; i < 10; i++) {
					if(name.equals(seatA[i])) {
						seatA[i] = "---";
					}
				}
				break;
			case 3:
				for(int i = 0; i < 10; i++) {
					if(name.equals(seatB[i])) {
						seatB[i] = "---";
					}
				}
				break;
		}
		
		
	}
	
	
}
