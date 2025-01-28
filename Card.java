package blackJackGame;

import java.util.ArrayList;


public class Card {
	
	private Rank rank;
	 private Suit suit;
	
	Card(Rank rank, Suit suit)
	{
		this.rank = rank;
		this.suit = suit;
	}

	public String toString() {
		
		return ("Card: " + rank + " of " + suit + " (" + this.getCardValue() +") ");
	}
	
	public Rank getRank() {
		return rank;
	}
	public Suit getSuit() {
		return suit;
	}

	public int getCardValue() {
		return rank.value;
	}
	
	
}
