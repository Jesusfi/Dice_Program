import java.util.Random;

public class Dice {
	
	// property of currentSide 
	private int currentSide; 
	
	//Constructor for Dice object
	public Dice() {
		this.currentSide = 1;
	}
	
	//A method that will get will set 'side' to a random 
	//number between 1-6
	public void rollDice() {
		Random random = new Random();
		this.currentSide = random.nextInt(6) + 1; 
	}
	
	//A method that will return the cur
	public int getCurrentSide() {
		return currentSide;
	}
}
