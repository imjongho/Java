package Project1;
import java.util.*;

public class Main1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] subject = { "국어", "수학", "영어" };
		int[] score = new int[subject.length];
		System.out.println("이름을 입력해주세요.");
		String name = sc.next();
		int sum = 0;
		for(int i = 0; i < subject.length; i++)
		{
			System.out.println(subject[i] + "점수를 입력해주세요.");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		System.out.println(name + "의" + subject.length + "과목 합계는" + sum + "입니다.");
	}
}
