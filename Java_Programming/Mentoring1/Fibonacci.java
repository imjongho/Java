package Mentoring1;
import java.util.Scanner;

public class Fibonacci {
	
	// 반복횟수
	static int cnt1 = 0;
	static int cnt2 = 0;
	
	public static int fib(int n) {
		if(n==1 || n==2) {
			cnt1++;
			return 1;
		}
		else {
			return (fib(n-1)+fib(n-2));
		}
	}
	
	public static int fibonacci(int n){
		int f[] = new int[n];
		f[0] = f[1] = 1;
		for(int i = 2; i < n; i++) {
			f[i] = f[i-1] + f[i-2];
			cnt2++;
		}
		return f[n-1];
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			n = sc.nextInt();
		} while((n<5)||(n>40));
		
		fib(n);
		fibonacci(n);
		System.out.print(cnt1 + " " + cnt2);
		
		sc.close();
	}

}
