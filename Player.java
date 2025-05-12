package blackJackGame;
import java.util.Scanner;

//child of person class and handles player operations
public class Player extends Person{
	
	Scanner keyboardInput = new Scanner(System.in);
	private int playerChoice = 0;
	
	//constructor
	public Player(){
		
		super.setName("Player");
	}

	public int obtainKeyboardInput() {
		
		boolean getInput = true;
		playerChoice=0;
		
		//make sure input is not char or string
		while(getInput) {				
			try{				
					System.out.println();
					System.out.println("Press one of the following: 1.Hit, 2.Stand, 3.Quit game");
					playerChoice = keyboardInput.nextInt();
					getInput = false;
					
			}catch(Exception e) {			
				System.out.println("input type is incorrect");
				keyboardInput.next();
			}
		}		
		return playerChoice;
	}
	
	public void playerDecision(Deck deck, Deck discard) {		
		
		obtainKeyboardInput();
		
		//if player option is greater than 3 then it will call obtainKeyboardInput and playerdecision again
		
		if(playerChoice == 1) {
			
			System.out.println("You hit");
			
			this.hit(deck, discard);		
			
			//if we hit 21 or over we break from the function
			if(this.getHand().handValue() > 20) {
				return;
			}
			else {
				System.out.println(this.getHand().toString());
				System.out.println("Player hand total is " + this.getHand().handValue()+ ":");
				playerDecision(deck, discard);
			}				
		}
		else if(playerChoice==2) {
			System.out.println("You Stand");
		}
		else if (playerChoice==3) {
			System.out.println("Exit game");
		}
		else {
			System.out.println("Please select valid option");
			obtainKeyboardInput();
			playerDecision(deck, discard);
		}			
			
	}	
	
	public void printHandValue(){
		//print player hand
		System.out.println("Player hand total is " + super.getHand().handValue()+ ":");
		System.out.println("--- " + super.getHand().toString()+ " ---");
		System.out.println();
	}
}
