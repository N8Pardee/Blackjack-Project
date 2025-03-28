package blackJackGame;

//handles game logic

public class Game {
	
	private Player player;
	private Dealer dealer;
	private Deck mainDeck;
	private Deck discardDeck;
	private Hand playerHand;
	private Hand dealerHand;
	//game constructor creates a main deck and a deck to discard cards as well as new players/dealers
	Game(){
		mainDeck = new Deck(true);
		discardDeck = new Deck();
		
		player = new Player();
		dealer = new Dealer();
		
		mainDeck.shuffle();
		gameRound();
	}
	
	public void gameRound() {
		
		Hand playerHand = new Hand();
		Hand dealerHand = new Hand();
		
		//deal player's hand
		playerHand.addSingleCard(mainDeck);
		playerHand.addSingleCard(mainDeck);
		
		//deal dealers hand
		dealerHand.addSingleCard(mainDeck);
		dealerHand.addSingleCard(mainDeck);
		
		//call check score method
		System.out.println("Player Score is " + checkScore(player.getHand()) + ":");
		System.out.println("Dealer hand total is " + checkScore(dealer.getHand()) + ":");
	}
	
	//take the hand that is passed in and calculate the total score for that hand and return the score to the gameRound fn 
	//leaving off here 3/27/25
	public int checkScore(Hand hand) {
		
		int score = 0;
		
		
		return score;
	}
	//pass in the sum of the players cards
	//public boolean isBust() {
		
		
		/*if(playerHandTotal > 21)
		 * {
		 * 		return true;
		 * }
		 * else{
		 * 		return false;
		 * } 
		 * 
		 */
	//}

}

/*
 * functions that handle game logic 
 * 
 * FN:
 		Start game
 		hit
 		stand
 		bust
 		
 * 
 */


