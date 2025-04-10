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
	public ArrayList<Card> getCards() {
		
		return deck;
	}
	
	public void addSingleCard(Card card) {
		
		//use the add method from the ArrayList class to add card to end of the list
		deck.add(card);
	}
	
	public void addMultipleCardstoDeck(ArrayList<Card> cards) {
		
		deck.addAll(cards);
	}
	
	public void outputCards() {
				
		//loop through the deck of cards
		for(int i = 0; i < deck.size() ;i++) {
			
			System.out.println(deck.get(i));			
		}
	}
	
	public void shuffle() {
		
		//create a new arraylist to store a random card pulled from organized deck
		ArrayList <Card> shuffledDeck = new ArrayList<Card>();
		
		while(deck.size() > 0)
		{
			//create a new integer variable to generate number b/t 0 and 1. This is done in the loop 
			//since we will need to do this for each card in the deck
			int randomizedCard = (int)(Math.random() * (deck.size()-1));
			shuffledDeck.add(deck.get(randomizedCard));
			
			//remove the card from the organized deck by reducing the array lists size
			deck.remove(randomizedCard);
		}
		
		//set the organized deck to the now shuffled deck
		deck = shuffledDeck;	
	}
	
	//check if deck is empty
	public boolean hasCards() {
		if(deck.size() <= 0) {
			return false;
		}
		else {
			return true;
		}
	}
	

	public Card takeCardFromDeck() {
		
		Card topCard = new Card(deck.get(0));
		deck.remove(0);
		return topCard;
	}
	
	

}
