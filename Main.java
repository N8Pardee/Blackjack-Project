package blackJackGame;

public class Main {

	public static void main(String[] args) {

		System.out.println("BlackJack");
		
		//testing that suite enum works
		//System.out.println(Suit.CLUBS);
		//System.out.println(Rank.ACE);
		
		Deck testDeck= new Deck(true);
		
		testDeck.outputCards();
		
		/*
		//create cards
		Card aCard = new Card(Rank.QUEEN, Suit.CLUBS);
		Card bCard = new Card(Rank.ACE, Suit.DIAMONDS);
		Card cCard = new Card(Rank.SIX, Suit.SPADES);
		*/
		
		/*
		//add cards to deck
		testDeck.addCards(aCard);
		testDeck.addCards(bCard);
		testDeck.addCards(cCard);

		testDeck.outputCards();
		*/
		
		
		

	}

}
