package war;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private String name;
	private int score;
	private List<Card> hand = new ArrayList<Card>();

	//constructor
	public Player(String name) {
		this.name = name;
		
	}
	
	// describe method
	public void describe() {
		System.out.println("Player: " + name + "Score: " + score);
	}
	
	// flip
	public Card flipTopCard() {
		return hand.remove(0);
	}
	
	// draw
	public void draw(Deck deck) {
		hand.add(deck.draw());
		
	}
	// increment score
	public void incrementScore() {
		score++;
	}
	
	public int getScore() {
		return score;
	}
}

