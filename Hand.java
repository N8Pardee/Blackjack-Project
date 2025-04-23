package blackJackGame;
import java.util.ArrayList;
import java.util.List;

public class Hand {	
	
	private ArrayList<Card> hand;
	private int handSum = 0;
	
	//constructor for hand
	Hand() {		
		hand = new ArrayList<Card>();		
	}
	
	//takes card from top of deck and adds it to the hand
	public void addSingleCard(Deck deck) {
		hand.add(deck.takeCardFromDeck());
	}
	
	//returns sum of the total value of cards
	public int handValue() {
		for(Card card: hand) {
			handSum+= card.getCardValue();
		}		
		return handSum;
	}
	
	//adds cards currently in hand to the discard ArrayList
	public void discardHand(Deck discardDeck) {
		discardDeck.addMultipleCardstoDeck(hand);		
		hand.clear();
	}	
	
	public String toString() {
		String handOutput = "";
		
		for(Card card: hand) {			
			handOutput += card + " ";
		}		
		return handOutput;
	}
	
}
