package Class2;

public class Class2_ex2 {

	public static void main(String[] args) {
		int u_price = -300;
		int count = 9;		
		
		System.out.printf("%d원짜이 %d개 사면 %d입니다.\n", 300, 9, 300*9);
		System.out.printf("%10d원짜이 %+10d개 사면 %10d입니다.\n", u_price, count, u_price * count);
		System.out.printf("10진수 15를 16진수로 출력하면 : %x, 8진수로 출력하면 : %o\n", 15, 15);
		System.out.printf("음수값 -10을 %%d로 출력하면 %d\n", -10);
	}

}
