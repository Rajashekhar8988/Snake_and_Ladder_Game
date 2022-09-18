package bridgeLabz.Development.SnakeAndLadder;

class Game{
	//player at start position 0
		public static int position=0;
		public static int diceNumber;
		public static int moment;
		public static final int ladder=1;
		public static final int snake=2;
		
		//Using Random to get a Random of a dice from 1 to 6 
		//Checking for the position whether its a ladder, snake or no play
		//Repeat till the Player reaches the winning position 100.
		public void checkMoment() {
			while(position<100) {
				diceNumber=(int)(Math.floor(Math.random()*10)%6+1);
		    	System.out.println("Die number is : "+diceNumber);
		    moment=(int)(Math.floor(Math.random()*10)%3);
		    switch(moment) {
		    case ladder:
		    	position+=diceNumber;
		    	System.out.println("your are at ladder climb up : " +diceNumber);
		    	break;
		    case snake:
		    	position-=diceNumber;
		    	System.out.println("Snake bites, move back to the tail : " +diceNumber);
		    	break;
		    default:
		    	System.out.println("Stay at the same position");
		    } 
		    
		    //In case the player position moves below 0, then the player restarts from 0
		    if(position<0)
		    	position=0;
		    }
	    	System.out.println("position of player is : "+position);

		}
		}

public class SnakeAndLadderGame {
	public static void main(String[] args) {
		Game g=new Game();
		g.checkMoment();
	}
}
