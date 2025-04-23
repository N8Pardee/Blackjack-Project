package blackJackGame;
import java.util.Scanner;

//child of person class and handles player operations
public class Player extends Person{
	
	Scanner keyboardInput = new Scanner(System.in);
	private int playerChoice;
	
	//constructor
	public Player(){
		
		super.setName("Player");
	}
	
	public int promptPlayerForInput()
	{
		System.out.println("Press one of the following: 1.Hit, 2.Stand, 3.Quit game");
		playerChoice = keyboardInput.nextInt();
		return playerChoice;
	}
	public void playerDecision(Deck deck, Deck discard) {		
		
		promptPlayerForInput();
		
		if(playerChoice == 1) {
			this.hit(deck, discard);
		}
		else if(playerChoice==2) {
			System.out.println("You Stand");
		}
		else {
			System.exit(0); 
		}
		
	}

	
}
