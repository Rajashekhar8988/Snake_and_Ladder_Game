package bridgeLabz.Development.SnakeAndLadder;

class Game{
//player at start position 0
		public static int position=0;
		public static int diceNumber;
		public static int moment;
		public static final int ladder=1;
		public static final int snake=2;
		public static int diceCount;
	
//Using Random to get a Random of a dice from 1 to 6.
//Checking for the position whether its a ladder, snake or no play.
//Repeat till the Player reaches the winning position 100.
//number of times the dice was played to win the game.
		
		public void checkMoment() {
			while(position<100) {
				diceNumber=(int)(Math.floor(Math.random()*10)%6+1);
				diceCount=diceCount+1;
		    	System.out.println("Die number is : "+diceNumber);
		    moment=(int)(Math.floor(Math.random()*10)%3);
		    switch(moment) {
		    
		    case ladder:
//if the player position go above 100, the player stays in the same previous position till the player gets exact 100 
		    	
		    	int i=position+=diceNumber;
		    	
		    	if (i>100) {
		    		position=i-diceNumber;
			    	System.out.println("You are exceeding the winning position, please stay at the same position");
		    	}
		    	else {
		    		position=i;
			    	System.out.println("Ladder : " +diceNumber +" steps forward ");

		    	}	
		    	break;
		    	
		    case snake:
		    	position-=diceNumber;
		    	System.out.println("Snake bite : " +diceNumber +" steps backward ");
		    	break;
		    	
		    default:
		    	System.out.println("Stay at the same position");
		    } 
//In case the player position moves below 0, then the player restarts from 0.
		    
		    if(position<0)
		    	position=0;
		    
//Position of the player after after each roll of a die.
		    
	    	System.out.println("Current position of player is : "+position);

		    }
			
	    	System.out.println("Final position of player is : "+position);
	    	System.out.println("No of times the Dice was rolled is : "+diceCount);
		}
		}

public class SnakeAndLadderGame {
	public static void main(String[] args) {
		Game g=new Game();
		g.checkMoment();
	}
}
