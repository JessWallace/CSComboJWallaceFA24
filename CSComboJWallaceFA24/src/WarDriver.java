import java.util.Scanner;

public class WarDriver {

	public static void main(String[] args) {
		Deck deck = new Deck();	
		Scanner scnr = new Scanner(System.in);
		deck.shuffle();

		Pile p1 = new Pile();
		p1.addDeck(deck.subdeck(0, 26));
		
		Pile p2 = new Pile();
		p2.addDeck(deck.subdeck(26, 52));
		
		Pile mid = new Pile();
//		Pile p1Win = new Pile();
//		Pile p2Win = new Pile();
		
		int round = 0;
		while(!p1.isEmpty() && !p2.isEmpty()) {
			Card c1 = p1.popCard();
			Card c2 = p2.popCard();
			mid.addCard(c1);
			mid.addCard(c2);
			
			
			int difference = c1.getRank() - c2.getRank();
			
			if(difference > 0) {
				p1.addPile(mid);				
			} else if(difference < 0) {
				p2.addPile(mid);				
			} else {
				System.out.println("It's a tie!");
				Card c9 = p1.popCard();
				mid.addCard(c9);
				Card c10 = p1.popCard();
				mid.addCard(c10);
				Card c3 = p1.popCard();
				mid.addCard(c3);
				Card c4 = p2.popCard();
				mid.addCard(c4);
				Card c5 = p2.popCard();
				mid.addCard(c5);
				Card c6 = p2.popCard();
				mid.addCard(c6);
				Card c7 = p1.popCard();
				Card c8 = p2.popCard();
				
				if(c7.getRank() > c8.getRank()) {
					mid.addCard(c7);
					mid.addCard(c8);
					p1.addPile(mid);
				}else if (c7.getRank() < c8.getRank()) {
					mid.addCard(c7);
					mid.addCard(c8);
					p2.addPile(mid);
				} else {}
			}
//			System.out.println(p1.getCards() + " " + p1.size());
//			System.out.println(p2.getCards()+ " " + p2.size());
//			System.out.println("Player 1 card: " + c1.getRank() + ", Player 2 card: " + c2.getRank());
//			System.out.println("Difference: " + difference);
//			System.out.println("Player 1 pile size: " + p1.size());
//			System.out.println("Player 2 pile size: " + p2.size());
//			System.out.println("Mid pile size: " + mid.size());
//			String input = scnr.nextLine();
			round ++;
			System.out.println(round);
		}
		if(p1.isEmpty()) {
			System.out.println("Player 2 wins!");
		} else {
			System.out.println("Player 1 wins!");
		}
	}
	public static void printDeck(Card[] cards) {
		
		for (int i = 0; i <52; i++) {
			System.out.println(cards[i]);
		}
	}
	public static int search(Card[] cards, Card target) {
		for(int i = 0; i <cards.length; i ++) {
			if(cards[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}
	public static int binarySearch(Card[]cards, Card target) {
		int low = 9;
		int high = cards.length-1;
		while(low<=high) {
			int mid = (low + high)/2;
			int comp = cards[mid].compareTo(target);
			
			if(comp == 0) {
				return mid;
			}else if(comp<0) {
				low = mid+1;
			}else {
				high = mid -1;
			}
		}
		return -1;
	}

}
