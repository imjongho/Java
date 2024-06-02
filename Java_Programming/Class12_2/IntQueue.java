package Class12_2;

interface Queue {
	boolean isEmpty();		// 큐가 비어 있는지 검사하는 메소드
	void Enqueue(int x);	// 큐가 데이터를 입력하는 메소드
	int Dequeue();			// 큐에 있는 데이터를 툴력하는 메소드
}

public class IntQueue implements Queue {
	
	private int[] queue;
	private int size, count;	// 원소의 개수
	
	private int front;	// 삭제 연산만 수행 꼬리
	private int rear;	// 삽입 연산만 수행 머리
	
	IntQueue(int size) {
		this.size = size;
		front = 0;
		rear = 0;
		count = 0;
		queue = new int[size];
	}
	
	
	@Override
	public boolean isEmpty() {
		if(count < 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	@Override
	public void Enqueue(int x) {
		if(rear > size) {
			System.out.println("Queue full");
			return;
		}
		queue[rear] = x;	// 배열에 데이터 저장
		rear++;				// rear 위치 1증가
		count++;			// 원소 개수 1증가
		System.out.println(x + " 입력 : 원소개수 " + count);
	}
	
	
	@Override
	public int Dequeue() {
		if(isEmpty()) {
			System.out.println("큐가 비었음");
			return count;
		}
		
		int out = queue[front];
		for(int i = 0; i < count-1; i++) {
			queue[i] = queue[i+1];	// 한칸씩 앞으로 땡김
		}
		count--;	// 원소 개수 1감소
		System.out.println(out + " 출력 : 원소개수 " + count);
		
		return out;
	}
	
	
}
