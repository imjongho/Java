package Class5;
import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input matrix size (row, col) : ");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		String[][] arr = new String[row][col];
		
		System.out.print("  ");
		for(int i = 0; i < row; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i = 0; i < row; i++) {		// 0 초기화
			System.out.print(i);
			for(int j = 0; j < col; j++) {
				arr[i][j] = Integer.toString(0);
				System.out.print(" " + arr[i][j]);
			}
			System.out.println();
		}
		
		
		while(true) {
			
			System.out.print("Row index : ");
			int user_row = sc.nextInt();
			if(user_row == 99) {
				System.out.print("End");
				break;
			}
			
			System.out.print("Column index : ");
			int user_col = sc.nextInt();
			
			System.out.print("  ");
			for(int i = 0; i < row; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			
			for(int i = 0; i < row; i++) {
				System.out.print(i);
				for(int j = 0; j < col; j++) {
					if(i == user_row && j == user_col) {
						arr[user_row][user_col] = "X";
					}
					System.out.print(" " + arr[i][j]);
				}
				System.out.println();
			}
			
		}
		
		sc.close();
	}

}
