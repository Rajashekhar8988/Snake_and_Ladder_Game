package bridgeLabz.Development.SnakeAndLadder;

public class SnakeAndLadderGame {
	
	//player at start position 0
	static int position=0;
	
	 //Using Random to get a Random of a dice from 1 to 6 
	static int diceNumber=(int)(Math.floor(Math.random()*10)%6+1);
	public static void main(String[] args) {
		System.out.println("position of the player : " + position);
		System.out.println("Random number of Dice is : " + diceNumber);

	}
}
