package blackJackGame;

//handles game logic

public class Game {
	
	private Player player;
	private Dealer dealer;
	private Deck mainDeck;
	private Deck discardDeck;
	
	
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
		player.getHand().addSingleCard(mainDeck);
		player.getHand().addSingleCard(mainDeck);
		
		//deal dealers hand
		dealer.dealerHand.addSingleCard(mainDeck);
		dealer.dealerHand.addSingleCard(mainDeck);
	}
	
	public void gameRound() {			
		//call methods that compare scores
		//since this method is for one game round, 
		dealStartingHand();
		printHandValues();
		player.playerDecision(mainDeck, discardDeck);
		printHandValues();
		player.playerHand.discardHand(discardDeck);
		dealer.dealerHand.discardHand(discardDeck);
	}
	
	
	public void printHandValues(){
		//print player hand
		System.out.println("Player hand total is " + player.getHand().handValue()+ ":");
		System.out.println("--- " + player.playerHand.toString()+ " ---");
		System.out.println();
		
		//print dealer's hand
		System.out.println("Dealer hand total is " + dealer.getHand().handValue() + ":");
		System.out.println("--- " + dealer.dealerHand.toString()+ " ---");
	}
	


}



