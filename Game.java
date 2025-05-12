package blackJackGame;

//handles game logic

public class Game {
	
	private Player player;
	private Dealer dealer;
	private Deck mainDeck;
	private Deck discardDeck;
	private int wins, losses, pushes = 0;
	
	
	//game constructor creates a main deck and a deck to discard cards as well as new players/dealers. Starts a game round 
	Game(){
		
		mainDeck = new Deck(true);
		discardDeck = new Deck();
		
		player = new Player();
		dealer = new Dealer();
		
		mainDeck.shuffle();
		
		printGameTitle();
		gameRound();
	}
	
	public void printGameTitle() {
		System.out.println("!!!! BLACKJACK !!!");
		System.out.println();
	}
	public void dealStartingHand() {
		//deal player's hand
		player.getHand().addSingleCard(mainDeck);
		player.getHand().addSingleCard(mainDeck);
		
		//deal dealers hand
		dealer.getHand().addSingleCard(mainDeck);
		dealer.getHand().addSingleCard(mainDeck);
	}
	
	public void gameRound() {			
	
		checkDeckSize();
		discardHands();
		displayScoreTotals();
		dealStartingHand();
		player.printHandValue();
		dealer.printFirstHand();
		checkDealerBlackJack();
		hasPlayerBlackJack();
		player.playerDecision(mainDeck, discardDeck);
		isPlayerBust();
		dealer.printHand();
		
		dealerHit();
		checkWinner();	}
	
	public void displayScoreTotals() {
		
		if(wins > 0 || losses > 0 || pushes > 0 ) {
			
			System.out.println();
			System.out.println("Starting new round: Wins " + wins + " Losses " + losses + " Pushes " + pushes);
			discardHands();
		}
		
	}
	
	public void discardHands(){		
		player.getHand().discardHand(discardDeck);
		dealer.getHand().discardHand(discardDeck);
	}
	
	public void checkDeckSize() {
		
		//make sure at least 4 cards left in main deck
		if(mainDeck.hasCards() == true && mainDeck.getDeckSize() < 4) {
			mainDeck.reloadDeckIfLessThanFour(discardDeck);
		}
	}
	
	public boolean isPlayerBust() {
		
		if(player.getHand().handValue() > 21) {
			
			//if player busts print statement and return true
			System.out.println("Player Busts \n\n -----Starting new round:---- \n\n");
			gameRound();
		}
		return false;
	}
	
	public boolean hasPlayerBlackJack() {
		
		//if player has blackjack, print statement, start new round, return true
		if(player.getHand().handValue() == 21) {
			
			System.out.println("Player has Blackjack! \n\n");
			wins++;
			gameRound();
			return true;
		}
		
		return false;
	}
	
	public void checkDealerBlackJack() {
		
		if(dealer.hasBlackJack() == true) {
			
			dealer.printHand();
			
			if(player.hasBlackjack(player.getHand().handValue())){
				System.out.println("Player and Dealer have Blackjack - 21 - Push.");
				pushes++;
				gameRound();
			}
			else {
				System.out.println("Dealer has blackjack. Player loses round.");
				dealer.printHand();
				losses++;
				gameRound();
			}
		}	
	}
	
	public void dealerHit() {
		
		int dealerHandValue = dealer.getHand().handValue();
		
		while(dealerHandValue < 17) {
			dealer.hit(mainDeck, discardDeck);
			
		}
	}	
	
	public void checkWinner() {
		
		int playerHandTotal = player.getHand().handValue();
		int dealerHandTotal = dealer.getHand().handValue();
		
		if(dealerHandTotal > 21) {
			System.out.println("Dealer busts");
			wins++;
		}
		else if(dealerHandTotal > playerHandTotal){
			System.out.println("Player loses round");
			losses++;
		}
		else if(playerHandTotal > dealerHandTotal) {
			System.out.println("Player wins round");
		}
		else {
			System.out.println("Push");
			pushes++;
		}
		
		gameRound();
	}
}





