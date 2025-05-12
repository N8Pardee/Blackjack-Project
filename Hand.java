package blackJackGame;
import java.util.ArrayList;
import java.util.List;

public class Hand {	
	
	private ArrayList<Card> hand;
	
	
	//constructor for hand
	Hand() {		
		hand = new ArrayList<Card>();		
	}
	
	//---------DELETE if not used--------
	//create setter and getter for player hand
//		public ArrayList<Card> getHandList() {
//			return hand;
//		}
	
	
	public Card getCard(int index) {
		return hand.get(index);
	}
	//takes card from top of deck and adds it to the hand
	public void addSingleCard(Deck deck) {
		hand.add(deck.takeCardFromDeck());
	}
	
	//returns sum of the total value of cards
	public int handValue() {
		int handSum = 0;
		
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
