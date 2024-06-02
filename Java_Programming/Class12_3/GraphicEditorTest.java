package Class12_3;
import java.util.Scanner;

class GraphicEditor {
	static Scanner sc;
	private static Shape head, tail;	
	// tail(끝), head(시작) Shape 자료형 객체 선언
	
	public GraphicEditor(){
		head = null;
		tail = null;
		sc = new Scanner(System.in);
	}
	
	public void run() {
		
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			int flag = sc.nextInt();
			
			if(flag == 1) {
				insert();
			}
			else if(flag == 2) {
				if(!delete()) {
					System.out.println("삭제할 수 없습니다.");
				}
			}
			else if(flag == 3) {
				printAll();
			}
			else if(flag == 4) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			else {
				System.out.println("잘못 입력");
			}
		}
	}
	
	
	private static void insert() {
		System.out.print("도형 종류 Line(1), Rect(2), Circle(3)>>");
		int shapeType = sc.nextInt();
		Shape s = null;
		
		switch(shapeType)
		{
			case 1:
				s = new Line();
				break;
			case 2:
				s = new Rect();
				break;
			case 3:
				s = new Circle();
				break;
			default:
				System.out.println("잘못 입력");
				break;
		}
		
		// 리스트 연결
		if(head == null) {	// 리스트가 비었을 때
			head = s;
			tail = s;
		}
		else {
			tail.setNext(s);	// 마지막 원소 뒤에 삽입
			tail = s;			
		}

	}
	
	
	private static boolean delete() {
		System.out.print("삭제할 도형의 위치>>");
		int index = sc.nextInt();
		
		Shape current = head;	// 현재 노드	
		Shape prev = head;		// 이전 노드
		
		if(head == null) {
			return false;
		}
		for(int i = 0; i < index; i++) {
			prev = current;
			current = current.getNext();	// 다음 원소로 이동
			if(current == null) {	// 인덱스(삭제할 위치)가 리스트 원소 개수보다 큰 경우
				return false;
			}
		}
		
		if(head == tail) {		// 리스트에 원소가 한개밖에 없는 경우
			head = tail = null;
			return true;
		}
		
		if(current == head) {	// 첫번째 원소를 삭제하는 경우
			head = head.getNext();	// 다음 원소가 첫번째 원소가 됨
		}
		else if(current == tail) {	// 마지막 원소를 삭제하는 경우
			tail = prev;	// 이전 원소가 마지막 원소가 됨
			tail.setNext(null);
		}
		else {
			prev.setNext(current.getNext());	// 현재 원소를 리스트에서 삭제
		}
		
		return true;
	}
	
	
	
	public void printAll() {
		Shape temp = head;
		while(temp != null) {
			temp.draw();
			temp = temp.getNext();
		}
	}
	
}




public class GraphicEditorTest {
	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor();
		ge.run();
	}
}





