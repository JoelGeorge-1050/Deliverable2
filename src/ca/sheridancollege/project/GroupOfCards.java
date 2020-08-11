/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 * @modifield by Andrew Pereira,2020
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
   //the size of the grouping
    private int size = 52;
    private Card[] card = new Card[size];
    
    //the cards dealed for the player one 
    private ArrayList<Card> deal1;
     //the cards dealed for the player two
    private ArrayList<Card> deal2;
    
        
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    /**
     *method to shuffle the cards 
     */
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * to return the size of the group of cards
     * @return size:int The size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * method to set the size for the group of cards 
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    /**
     *method to return the cards 
     * @return cards:ArrayList<Card> -the cards 
     */
    public ArrayList<Card> getCards() {
	return this.cards;
    }

    /**
     *the method to set the values of the cards 
     * @param cards: ArrayList<card>- the cards
     */
    public void setCards(ArrayList<Card> cards) {
	this.cards = cards;
    }

	/**
         *method to create the hand 
         */
        public void createHand() {
            int count = 0;
            cards = new ArrayList<>();
            for (Card.Suit s : Card.Suit.values()) {
                for(Card.Value r: Card.Value.values()){
                    cards.add(new Card(s, r));
                    count++;
                }
            }
            
        }
        /**
         *method to deal cards to player 1
         *@return deal1:ArrayList<card> - the cards of the player 1*/
    public ArrayList<Card> dealPlayer1(){
      deal1 = new ArrayList<>();
     for (int i = 0; i <cards.size(); i = i + 2){
         deal1.add(cards.get(i));
     }
     return deal1;
    }
    
    /**
         *method to deal cards to player 2
         *@return deal2:ArrayList<card> - the cards of the player 2*/
     public ArrayList<Card> dealPlayer2(){
      deal2 = new ArrayList<>();
     for (int i = 1; i <cards.size(); i = i + 2){
         deal2.add(cards.get(i));
     }
     return deal2;
    }
}//end class
