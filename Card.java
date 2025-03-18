package blackJackGame;

import java.util.ArrayList;


public class Card {
	
	//we call on the enums to create the variables that will be used for the card
	
	private Rank rank;
	private Suit suit;
	
	//create card constructor using rank and suite then assigning the values to the attribute
	Card(Suit suit, Rank rank)
	{
		this.rank = rank;
		this.suit = suit;
	}
	
	
	//constructor created for returning the top card of the deck into the hand
	public Card(Card cardFromTopOfDeck) {
		this.suit = cardFromTopOfDeck.getSuit();
		this.rank = cardFromTopOfDeck.getRank();
	}

	//returns the card "values" in a string
	public String toString() {
		
		return ("Card: " + rank + " of " + suit + " (" + this.getCardValue() +") ");
	}
	
	//getter to retrieve the rank value
	public Rank getRank() {
		return rank;
	}
	
	//getter to retrieve the suit value
	public Suit getSuit() {
		return suit;
	}

	//returns cards numerical value
	public int getCardValue() {
		return rank.value;
	}
	
	
}
