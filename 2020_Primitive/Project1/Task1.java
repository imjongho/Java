package Project1;
import java.util.*;

public class Task1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String[] Seat_info = new String[] { "A1", "A2", "A3","A4","B1", "B2", "B3","B4","C1", "C2", "C3","C4" }; 
		//각 자리 주소 DB
	    int[] Seat_value = new int[12]; //실제 그 자리에 예약 여부
	    int num = 0;
	    
	    for(int i = 0; i < 12; i++) 
	    {
	    	Seat_value[i] = 0; // 값 초기화
	    }
	           
	    do
	    {
	    	System.out.println("<자리 예매 프로그램>");
	        System.out.println("1.예매 2.예매 취소 3.종료");
	        
	        num = sc.nextInt();
	         
	        switch(num)
	        {
	        case 1:
	        	System.out.println("자리를 선택해주세요.");
	            System.out.println("(A~C)(1~4) ex.A3");
	            
	            int Seat_num = Arrays.binarySearch(Seat_info, sc.next()); 
	            //입력받은 내용을 주소 DB에서 검색해서 번호를 저장
	            
	            //이미 예약된 좌석인지 확인
	            if(Seat_value[Seat_num] == 1) 
	            { 	
	            	System.out.println("이미 예약된 자리입니다");
	            	break;
	            }
	            else
	            {
	            	for(int i = 0; i < 12; i += 0)
	            	{            			            		
	            		Seat_value[Seat_num] = 1;
	            		
	            		// j : 4개씩 끊어서 출력
	            		for(int j = 0; j < 4; j++)
	            		{
	            			if(Seat_value[i] == 1) 
		            		{
		            			System.out.print("■ ");
		            			i++;
		            		}
		            		else 
		            		{
		            			System.out.print("□ ");
		            			i++;
		            		}
	            		}       			            	
	            		System.out.println("");
	            	}
	            	break;
	            }
	            
	        case 2:
	        	System.out.println("취소할 자리를 선택해주세요.");
	            System.out.println("(A~C)(1~4)");
	            
	            int Seat_num2 = Arrays.binarySearch(Seat_info, sc.next()); 
	            
	            if(Seat_value[Seat_num2] == 0) 
	            { 	
	            	System.out.println("비어있는 자리입니다.");
	            	break;
	            }
	            else
	            {
	            	for(int i = 0; i < 12; i += 0)
	            	{
	            		Seat_value[Seat_num2] = 0;
	            		
	            		// j : 4개씩 끊어서 출력
	            		for(int j = 0; j < 4; j++)
	            		{
	            			if(Seat_value[i] == 1) 
		            		{
		            			System.out.print("■ ");
		            			i++;
		            		}
		            		else 
		            		{
		            			System.out.print("□ ");
		            			i++;
		            		}
	            		}       			            	
	            		System.out.println("");
	            	}
	            	break;
	            }

	        case 3:
	            System.out.println("프로그램을 종료합니다.");
	            break;
	        case 4:
	            System.out.println("메뉴를 잘못 선택하셨습니다.");
	            break;
	        } 
	        System.out.println("");
		} while(num != 3);	
	}
}
