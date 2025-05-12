package blackJackGame;

//child of person. handles dealer operations: Hit, Stand, Stay

public class Dealer extends Person{

	//create new hand for dealer
	public Hand dealerHand = new Hand();
	
	Dealer(){
		//name dealer with the super keyword. This works by calling parent classes name setting fn
		super.setName("Dealer");
	
	}
	
	public boolean hasBlackJack() {
		
		if(this.getHand().handValue() == 21) {
			System.out.println("Dealer has blackjack");
			return true;
		}
		
		return false;
	}
	
	public void printFirstHand() {
		System.out.println(" This is the Dealer's hand: ");
		System.out.println(super.getHand().getCard(0));
		System.out.println("Second card is **** ");
	}
	
	public void printHand() {
		System.out.println("Dealer Hand: " + this.getHand().toString() + " ");
	}
	
	
}
