package Project3_ex2;

public class Puppy extends Dog {	// Puppy: 하위 클래스, Dog : 상위 클래스
	
	@Override	// 재정의
	public void Crying() {
		System.out.println("강아지 : 멍~!! 멍~!!");
	}
	
	@Override
	public void Feature() {
		System.out.println("강아지 : 눈이 감겨있고 귀가 막혀있습니다.");
	}
	
}
