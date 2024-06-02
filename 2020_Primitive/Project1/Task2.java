package Project1;
import java.util.*;

public class Task2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문장 입력");
		String s = sc.nextLine();	
		char[] arr = new char[s.length()];
		
		String str = "";
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = s.charAt(i);	
			if(arr[i] != ' ')
			{
				str += arr[i];
			}
		}	
		System.out.println(str);
	}
}

