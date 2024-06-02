package Class9;
import java.util.*;

class Player {
   private String name;
   private String word;
   
   public Player(String name) {
      this.name = name;
   }
   
   public void inputWord(String word) {
      this.word = word;
   }
   public String outputWord() {
      return this.word;
   }
   public String outputName() {
      return this.name;
   }
}



public class WordGameApp2 {
	public static void main(String[] args) {
		
	      Scanner sc = new Scanner(System.in);
	      ArrayList<Player> list = new ArrayList<>();
	      int cnt = 0;
	      
	      System.out.println("끝말잇기 게임을 시작합니다...");
	      System.out.print("게임에 참가하는 인원은 몇명입니까>>");
	      int num = sc.nextInt();
	      
	      for(int i=0;i<num;i++) {
	         System.out.print("참가자의 이름을 입력하세요>>");
	         String name = sc.next();
	         list.add(new Player(name));
	      }
	      System.out.println("시작하는 단어는 java입니다.");
	      String preWord = "java";
	      
	      while(true) {
	         if(cnt>=num) {
	            cnt = 0;
	         }
	         System.out.printf("%s>>", list.get(cnt).outputName());
	         String name = sc.next();
	         list.get(cnt).inputWord(name);
	         
	         if(preWord.charAt(preWord.length()-1) == list.get(cnt).outputWord().charAt(0)) {
	            preWord = list.get(cnt).outputWord();
	            cnt++;
	         }
	         else {
	            System.out.println(list.get(cnt++).outputName()+"이 졌습니다.");
	            break;
	         }
	      }
	      
	      sc.close();
	      
	}

}
