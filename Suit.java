package blackJackGame;

public enum Suit {

	CLUBS("Clubs"), 
	SPADES("Spades"),
	DIAMONDS("Diamonds"),
	HEARTS("Hearts");
	
	private String suitName;
	
	//constructor for suit
	Suit(String suitName){
		
		this.suitName = suitName;
	}	
	
	public String toString() {
		return suitName;
	}
}
