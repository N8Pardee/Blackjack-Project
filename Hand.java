package blackJackGame;
import java.util.ArrayList;

//contains card objects such as dealer and player hands

public class Hand {
	
	
	
	private ArrayList<Card> hand;
	
	//constructor for hand
	Hand() {
		
		hand = new ArrayList<Card>();
		
	}
	
	public void addSingleCard(Deck deck) {
		
		hand.add(deck.takeCardFromDeck());
	}
	

	public String toString() {
		String handOutput = "";
		
		for(Card card: hand) {
			
			handOutput += card + " ";
		}
		
		return handOutput;
	}
	
}
