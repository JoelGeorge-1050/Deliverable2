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
 */
public class GroupOfCards 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private int size = 52;//the size of the grouping
    private Card[] card = new Card[size];
    
    private ArrayList<Card> deal1;
    private ArrayList<Card> deal2;
    
    public GroupOfCards()
    {
      
    }
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<Card> showCards()
    {
        return cards;
    }
    
    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }

	public ArrayList<Card> getCards() {
		return this.cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public void setSize() {
		// TODO - implement GroupOfCards.setSize
		throw new UnsupportedOperationException();
	}
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
    public ArrayList<Card> dealPlayer1(){
     ArrayList<Card> deal1 = new ArrayList<>();
     for (int i = 0; i <cards.size(); i = i + 2){
         deal1.add(cards.get(i));
     }
     return deal1;
    }
     public ArrayList<Card> dealPlayer2(){
     ArrayList<Card> deal2 = new ArrayList<>();
     for (int i = 1; i <cards.size(); i = i + 2){
         deal2.add(cards.get(i));
     }
     return deal2;
    }
}//end class
