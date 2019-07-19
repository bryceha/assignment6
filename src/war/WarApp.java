package war;

public class WarApp {

	public static void main(String[] args) {

		Deck deck = new Deck();
		//deck.describe(); System.out.println("");
		deck.shuffle(); 
		//deck.describe(); System.out.println("");
		Player playerOne = new Player("Me");
		Player playerTwo = new Player("Computer");
		
		for (int i = 0; i < 26; i++) {
			playerOne.draw(deck);
			playerTwo.draw(deck);
		}
		
		for (int i = 0; i < 26; i++) {
			// question about this variables vs not
			Card flippedCard1 = playerOne.flipTopCard();
			Card flippedCard2 = playerTwo.flipTopCard();
			
			if (flippedCard1.getValue() > flippedCard2.getValue()) { 
				playerOne.incrementScore();
				System.out.println(flippedCard1.getName().toUpperCase() + " -vs- " + flippedCard2.getName()); //System.out.println("");
			} else {
				playerTwo.incrementScore();
				System.out.println(flippedCard1.getName() + " -vs- " + flippedCard2.getName().toUpperCase()); //System.out.println("");
			}
		}
		
		System.out.println(repeat("~", 36)); //System.out.println("");
		System.out.print("Your Score: " + playerOne.getScore());
		System.out.println("  Computer's Score: " + playerTwo.getScore());
		if (playerOne.getScore() > playerTwo.getScore()) {
			System.out.println("\n...You Win =D");
		}
		else if (playerOne.getScore() == playerTwo.getScore()) {
			System.out.println("\n...It's a Tie =/");
		}
		else {
			System.out.println("\n...You Lose =C");
		}
		
	}
	
	public static String repeat(String str, int times) {
		   return new String(new char[times]).replace("\0", str);
	}

}
