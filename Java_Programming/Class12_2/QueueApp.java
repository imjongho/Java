package Class12_2;
import java.util.Scanner;

public class QueueApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("큐의 저장 공간의 크기 입력 >> ");
		int size = sc.nextInt();
		IntQueue q = new IntQueue(size);
		
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		
		q.Dequeue();
		q.Dequeue();
		q.Dequeue();
		
		sc.close();
	}

}
