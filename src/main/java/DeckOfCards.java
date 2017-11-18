import java.util.*;
import java.security.SecureRandom;

public class DeckOfCards{
	public static final int DECK_SIZE = 52;
	private static DeckOfCards deck = null;

	public static DeckOfCards getDeck(){
		if (deck == null)
			deck = new DeckOfCards();
		return deck;
	}

	private List<Card> cards;
	private int currentSize;
	private SecureRandom random;

	private DeckOfCards(){
		cards = new ArrayList<>(DECK_SIZE);
		this.currentSize = DECK_SIZE-1;
		this.random = new SecureRandom();
		
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
		this.currentSize = DECK_SIZE-1;
		System.out.println("Deck shuffled...");
	}

	Card dealOneCard(){
		Card card = null;
		if (currentSize >=0 ){
			int cardNo = random.nextInt(this.currentSize-1);
			card = this.cards.get(cardNo);
			this.cards.set(cardNo,this.cards.get(this.currentSize));
			this.cards.set(currentSize--,card);
		}
		return card;
	}
}