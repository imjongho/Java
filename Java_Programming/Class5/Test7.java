package Class5;

public class Test7 {

	public static void main(String[] args) {
		String[] card = {"Clubs", "Diamonds", "Hearts", "Spades"};
		String[] num = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		
		for(int i = 0; i < 5; i++) {
			int card_index = (int)(Math.random() * card.length);
			int num_index = (int)(Math.random() * num.length);
			System.out.println(card[card_index] + "의 " + num[num_index]);
		}
		
	}

}
