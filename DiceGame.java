
public class DiceGame {

	public static void main(String[] args) {
		
		//create an object of Dice
		Dice dice1 = new Dice(); 
		
		//Rolled dice 
		dice1.rollDice();
		
		//Printed out roll 
		System.out.println(dice1.getCurrentSide()); 
		
	}

}
