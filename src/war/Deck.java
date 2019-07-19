package war;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	Card card = new Card();

	// Note: I have the suits ranked Spades to Clubs to prevent in-game ties
	public List<Card> cards = new ArrayList<Card>();
	
	private String[] allCards = new String[] {
		"Two of Clubs", "Two of Diamonds", "Two of Hearts", "Two of Spades",
		"Three of Clubs", "Three of Diamonds", "Three of Hearts", "Three of Spades",
		"Four of Clubs", "Four of Diamonds", "Four of Hearts", "Four of Spades",
		"Five of Clubs", "Five of Diamonds", "Five of Hearts", "Five of Spades",
		"Six of Clubs", "Six of Diamonds", "Six of Hearts", "Six of Spades",
		"Seven of Clubs", "Seven of Diamonds", "Seven of Hearts", "Seven of Spades",
		"Eight of Clubs", "Eight of Diamonds", "Eight of Hearts", "Eight of Spades",
		"Nine of Clubs", "Nine of Diamonds", "Nine of Hearts", "Nine of Spades",
		"Ten of Clubs", "Ten of Diamonds", "Ten of Hearts", "Ten of Spades",
		"Jack of Clubs", "Jack of Diamonds", "Jack of Hearts", "Jack of Spades",
		"Queen of Clubs", "Queen of Diamonds", "Queen of Hearts", "Queen of Spades",
		"King of Clubs", "King of Diamonds", "King of Hearts", "King of Spades",
		"Ace of Clubs", "Ace of Diamonds", "Ace of Hearts", "Ace of Spades"
	};
		
	// constructor: instance of a class
	public Deck() {
		int i = 1;
		for (String aCard : allCards) {
			cards.add(new Card(i++, aCard));
		}
	}
	
	public List<Card> getList() {
		return cards;
	}
	
	//shuffle method
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	//draw method
	public Card draw() {
		return cards.remove(0);
	}
	
	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}

}
