package blackJackGame;

import java.util.ArrayList;

//parent of card class and contains operations for shuffling 

public class Deck {
	
	private ArrayList<Card> deck;
	
	/*create another constructor that takes boolean as parameter. if true then return
	  standard deck of cards.
	  the .values method will return an array of enums that we use. use a nested for loop to iterate through 
	  rank and suite 
	*/
	
	public Deck(boolean standardDeck) {
		
		//call empty constructor
		deck = new ArrayList<Card>();
		
		if(standardDeck == true) {
			
			for(Suit suit : Suit.values())
			{
				for(Rank rank : Rank.values()) {
					
					deck.add(new Card(suit, rank));
				}
			}
		}
		
	}
	
	public Deck() {
		
		deck = new ArrayList<Card>();
	}	
	
	//getter to return a card from the deck
	public ArrayList<Card> getCard() {
		
		return deck;
	}
	
	public void addCards(Card card) {
		
		//use the add method from the ArrayList class to add card to end of the list
		deck.add(card);
	}
	
	public void outputCards() {
				
		//loop through the deck of cards
		for(int i = 0; i < deck.size() ;i++) {
			
			System.out.println(deck.get(i));			
		}
	}
	
	

}
