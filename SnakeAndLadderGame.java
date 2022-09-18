package bridgeLabz.Development.SnakeAndLadder;

class Game{
	//player at start position 0
		public static int position=0;
		public static int diceNumber;
		public static int moment;
		public static final int ladder=1;
		public static final int snake=2;
		
		//Using Random to get a Random of a dice from 1 to 6 
		public void rollADie() {
			diceNumber=(int)(Math.floor(Math.random()*10)%6+1);
	    	System.out.println("Die number is : "+diceNumber);

		}
		
		//Checking for the position whether its a ladder, snake or no play
		public void checkMoment() {
		    moment=(int)(Math.floor(Math.random()*10)%3);
		    switch(moment) {
		    case ladder:
		    	System.out.println("your are at ladder climb up ");
		    	break;
		    case snake:
		    	System.out.println("Snake bites, move back to the tail ");
		    	break;
		    default:
		    	System.out.println("Stay at the same position");
		    }
		}
}

public class SnakeAndLadderGame {
	public static void main(String[] args) {
		Game g=new Game();
		System.out.println("position of the player : " + Game.position);
		g.rollADie();
		g.checkMoment();
	}
}
