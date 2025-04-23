package blackJackGame;

//handles game logic

public class Game {
	
	private Player player;
	private Dealer dealer;
	private Deck mainDeck;
	private Deck discardDeck;
	private Hand playerHand = new Hand();
	private Hand dealerHand = new Hand();
	
	//game constructor creates a main deck and a deck to discard cards as well as new players/dealers
	Game(){
		mainDeck = new Deck(true);
		discardDeck = new Deck();
		
		player = new Player();
		dealer = new Dealer();
		
		mainDeck.shuffle();
		gameRound();
	}
	
	public void dealStartingHand() {
		//deal player's hand
		playerHand.addSingleCard(mainDeck);
		playerHand.addSingleCard(mainDeck);
		
		//deal dealers hand
		dealerHand.addSingleCard(mainDeck);
		dealerHand.addSingleCard(mainDeck);
	}
	
	public void gameRound() {			
		//call methods that compare scores
		//since this method is for one game round, 
		dealStartingHand();
		printHandValues();
		playerHand.discardHand(discardDeck);
		dealerHand.discardHand(discardDeck);
	}
	
	
	
	public void printHandValues(){
		//call check score method
		System.out.println("Player hand total is " + playerHand.handValue()+ ":");
		System.out.println("Dealer hand total is " + dealerHand.handValue() + ":");
	}
	
	public void compareHandValues() {
		
		//compare dealer and player hand
	}
	



}



