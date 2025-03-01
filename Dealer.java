package blackJackGame;

//child of person. handles dealer operations: Hit, Stand, Stay

public class Dealer extends Person{

	//create new hand for dealer
	public Hand dealerHand = new Hand();
	
	Dealer(){
		//name dealer with the super keyword. This works by calling parent classes name setting fn
		super.setName("Dealer");
	
	}
	
	
	
}
