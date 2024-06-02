package Project2_Phone;

public class Phone {
	
	String model;
	private int brightness;
	private int battery;
	
	public Phone(String model) {	
		set(brightness);						  // 밝기 0으로 초기화
		brightness = set(model, brightness);	  // 메인 함수에서 받아온 model 초기화, 밝기 랜덤 숫자 발생(1 ~ 100)
		
		battery = (int)(Math.random() * 100 + 1); // 배터리 랜덤 숫자 발생(1 ~ 100)			
		prn(model, brightness, battery);		  // 기종, 밝기, 배터리 출력
	}
	
	// 오버 로딩
	private void set(int brightness) {		// 매개변수 1개(밝기)
		brightness = 0;
	}
	
	private int set(String model, int brightness) {	   // 매개변수 두개(기종, 밝기)
		this.model = model;
		brightness = (int)(Math.random() * 100 + 1);
		return brightness;
	}
	
	public int getBat() {
		return battery;		// 메인 함수로 배터리 값 반환(public)
	}
	
	public void prn(String model, int brightness, int battery) {
		System.out.println("기종 : " + model + "   밝기 : " + brightness + "   배터리 : " + battery + "%");
	}
	
}
