package blackJackGame;
import java.util.ArrayList;

//contains card objects such as dealer and player hands

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
	
	
	public String toString() {
		String handOutput = "";
		
		for(Card card: hand) {
			
			handOutput += card + " ";
		}
		
		return handOutput;
	}
	
}
