package blackJackGame;
import java.util.ArrayList;

//parent of player and dealer

public abstract class Person {
	
	private Hand playerHand;
	private String name; 
	
	//constructor for person
	public Person(){		
		//create hand object for person object
		this.playerHand = new Hand();		
		
	}
	
	//create setter and getter for player hand
	public Hand getHand() {
		return this.playerHand;
	}
	
	public void setHand(Hand playersHand){
		this.playerHand = playersHand;
	}
	
	//setters and getters to obtain persons name
	public void setName(String playerName){
		this.name = playerName;
	}
	
	public String getName(){
		return this.name;
	}
	//check for blackjack in player hand. takes in hand parameter
	public boolean hasBlackjack(int currentHandValue){
		if(currentHandValue == 21){
			return true;
		}
		else {
			return false;
		}
	}
	
	public String showHand(String playerHand){		
		return("Current hand : " + playerHand);
	}	
	
	public void hit(Deck mainDeck, Deck Discard){
	
		if(mainDeck.hasCards()) {
			playerHand.addSingleCard(mainDeck);
		}
		else {
			System.out.println("Main Deck has no cards");
			mainDeck.reloadEmptyDeck(Discard);
		}
	}
	
	public void stand() {
		
	}
}
