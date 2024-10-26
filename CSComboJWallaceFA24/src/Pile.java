import java.util.ArrayList;

public class Pile {
	private ArrayList<Card> cards;

	public Pile() {
		this.cards = new ArrayList<Card>();
		
	}
	public Card popCard(){
		return this.cards.remove(0);
	}
	public Card popCard(int ind) {
		return this.cards.remove(ind);
	}
	public void addCard(Card card) {
		this.cards.add(card);
	}
	public boolean isEmpty() {
		return this.cards.isEmpty();
	}
	public void addDeck(Deck deck) {
		for(Card card : deck.getCards()) {
			this.addCard(card);
		}
	}
	public void addPile(Pile oldPile) {
		for(Card card : oldPile.getCards()) {
			this.cards.add(card);
		}
		oldPile.getCards().clear();
	}
	public ArrayList<Card> getCards(){
		return cards;
	}
	public int size() {
		return cards.size();
	}

}
