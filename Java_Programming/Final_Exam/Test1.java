package Final_Exam;
import java.util.Scanner;
import java.util.Arrays;

public class Test1 {

	public static int solution(int[] people, int limit) {
		int answer = 0;
		int startIndex = 0;
		int lastIndex = people.length - 1;
		
		Arrays.sort(people);	// 몸무게 정렬
		while(startIndex < lastIndex) {
			answer++;
			if(people[startIndex] + people[lastIndex] < limit) {
				startIndex++;
			}
			lastIndex--;
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] people = {70, 50, 80, 50, 20, 70, 50, 30, 40};
		int limit = 100;
		
		int answer = solution(people, limit);
		System.out.println("Answer : " + answer);
		
		sc. close();
	}

}
