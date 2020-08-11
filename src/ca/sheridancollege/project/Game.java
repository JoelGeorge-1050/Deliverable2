/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye, 2018
 * @modifield by Andrew Pereira,2020
 */
public class Game 
{
    private final String gameName;//the title of the game
    private ArrayList <Player> players;// the players of the game
    
    /***/
    public Game(String givenName)
    {
        gameName = givenName;
        players = new ArrayList();
    }

    /**
     * @return the gameName
     */
    public String getGameName() 
    {
        return gameName;
    }
    
     /**
     * @return the players of this game
     */
    public ArrayList <Player> getPlayers() 
    {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList <Player> players) 
    {
        this.players = players;
    }
    
    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public void play(){
        Scanner input = new Scanner(System.in);
                ArrayList <Player> players = new ArrayList<>();
                System.out.println("Welcome to the War Game!");
                //input names of players
                System.out.println("Enter your player1 ID");
                String player1 = input.nextLine();
                players.add(new Player(player1));
                System.out.println("Enter your player2 ID");
                String player2 = input.nextLine();
                players.add(new Player(player2));
                
                System.out.println("There are " + players.size() + " in this game. Battle!");
                
                GroupOfCards cards = new GroupOfCards();
                
                cards.createHand();
                cards.shuffle();
                
                System.out.println("Player 1 has cards \n" + cards.dealPlayer1() );
                System.out.println("Player 2 has cards \n" + cards.dealPlayer2() );
                
                
                
                
             
    };
    public void compare(Card card1, Card card2) {

        if (card1.getValue() == card2.getValue()) {
            System.out.println("This is a war");
            System.out.println("Turn 3 Cards");
        } else if (card1.getValue().compareTo(card2.getValue())
                > card2.getValue().compareTo(card1.getValue())) {
            System.out.println("Player 1 won the round!");

        } else if (card2.getValue().compareTo(card1.getValue())
                > card1.getValue().compareTo(card2.getValue())) {
            System.out.println("Player 2 won the round!");

        }
    }
    
    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
   // public abstract void declareWinner();

	/**
	 * 
	 * @param p1
	 * @param p2
     * @return 
	 */
	public int checkNumCards(Player p1, Player p2) {
		// TODO - implement Game.checkNumCards
		throw new UnsupportedOperationException();
	}

   
    
}//end class
