import java.util.Random;

public class Deck {
	Random rand = new Random();
	private Card[] cards;
	public Deck(int n) {
		this.cards = new Card[n];
		}
	public Card[] getCards() {
	return this.cards;
	}

	public Deck() {
		this.cards = new Card[52];
		int index = 0;
		for (int suit = 0; suit <= 3; suit++) {
			for (int rank = 1; rank <= 13; rank++) {
				this.cards[index] = new Card(rank, suit);
				index++;
			}
		}
	}
	public void print() {
		for (Card card : this.cards) {
		System.out.println(card);
		}
	}
	public void shuffle() {
		for each index i {
			// choose a random number between i and length - 1
			// swap the ith card and the randomly-chosen card
		}
		}
	private static int randomInt(int low, int high) {
		// return a random number between low and high,
		// including both
		}
		private void swapCards(int i, int j) {
		// swap the ith and the jth cards in the array
		}
		
}
