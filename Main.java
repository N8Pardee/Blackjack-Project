package blackJackGame;

public class Main {

	public static void main(String[] args) {

		System.out.println("BlackJack");
		
		//testing that suite enum works
		//System.out.println(Suit.CLUBS);
		//System.out.println(Rank.ACE);
		Card oneCard = new Card(Rank.ACE, Suit.CLUBS);
		
		System.out.println(oneCard);

	}

}
