import java.util.*;

public class DeckOfCards{
	public static final int DECK_SIZE = 52;

	private List<Card> cards;
	private int currentCard = 0;

	public DeckOfCards(){
		cards = new ArrayList<>(DECK_SIZE);
		this.createDeck();
	}

	private void createDeck(){

		for (Shade s: Shade.values())
			for (Value v : Value.values())
				this.cards.add(new Card(s,v));

		this.shuffle();
	}

	void shuffle(){
		Collections.shuffle(this.cards);
		this.currentCard = 0;
		System.out.println("Deck shuffled...");
	}

	Card dealOneCard(){
		Card card = null;
		if (currentCard < DECK_SIZE ){
			card = this.cards.get(currentCard++);
		}
		return card;
	}
}