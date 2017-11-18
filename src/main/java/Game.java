import java.util.*;

public class Game{
	private DeckOfCards deck = null;
	Scanner in;

	public Game(){
		in = new Scanner(System.in);
		this.deck = new DeckOfCards();
	}

	public void startGame(){
		System.out.println("You have been handed a deck of 52 cards,\nPlay with it. enjoy!!");
		System.out.println("Please Select option from below options:");
		System.out.println("1. Shuffle Deck");
		System.out.println("2. Deal One Card");
		System.out.println("0. Exit and put deck away");
		int selection = 3;
		while (selection != 0){
			try{
				System.out.println("Your selection: ");
				selection = in.nextInt();
				switch(selection){
					case 0:
						System.out.println("Throwing deck away........");
						return;
					case 1:
						this.deck.shuffle();
						System.out.println();
						break;
					case 2:
						Card card = this.deck.dealOneCard();
						System.out.println("Your Card: " + card);
						System.out.println();
						break;
					default:
						throw (new NoSuchElementException());
				}
			} 
			catch(NullPointerException e){
				System.out.println("Your deck is empty, Please shuffle first then try.");
			}
			catch(NoSuchElementException e){
				System.out.println("Invalid input " + selection + ", try again");
			}
			finally{
				selection = 3;
			}
		}
	}
}