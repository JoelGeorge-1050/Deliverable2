package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *class to create a new game with the tittle of the game */

public class War {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
            Game game = new Game("Java War Game");
            //starting the game  
                game.play();
	}

}