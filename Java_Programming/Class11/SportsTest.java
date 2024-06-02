package Class11;

class Sports {
	String getName() {
		return "아직 결정되지 않음";
	}
	
	int getPlayers() {
		return 0;
	}
}

class Soccer extends Sports {
	String name = "축구";
	int member = 11;
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	int getPlayers() {
		return member;
	}
}


public class SportsTest {

	public static void main(String[] args) {
		Soccer sc = new Soccer();
		System.out.println("경기이름: " + sc.getName());
		System.out.println("경기자수: " + sc.getPlayers());
		
	}

}
