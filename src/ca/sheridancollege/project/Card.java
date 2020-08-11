package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 * @modifield by Andrew Pereira,2020
 */

/**
 *class to create cards of 4 different suits and each having 13 cards in it 
 */
public class Card {

	private Suit suit;
	private Value value;
        
        public enum Suit{
            CLUB, SPADE, HEARTS, DIAMOND
            
        };
        public enum Value{
          ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING;  
        };

        /**
         * 
         * @return this.suit -suit of the card 
         */
	public Suit getSuit() {
		return this.suit;
	}//method returns card suit

        /**
         * 
         * @param suit -suit of the card
         */
	public void setSuit(Suit suit) {
		this.suit = suit;
	}

        /**
         * 
         * @return this.value -value of the card
         */
	public Value getValue() {
		return this.value;
	} //method returns card value

        /**
         * 
         * @param value -value of the card
         */
	public void setValue(Value value) {
		this.value = value;
	}

	/**
	 * Students should implement this method for their specific children classes
	 * @return a String representation of a card. suits and values of the cards  
	 */
	@Override()
	public String toString(){
            return " Value : " + value + " Suit: " + suit;
        }

        

	/**
	 * 
	 * @param s :Suits - the suit of the card
	 * @param v :value - the value of the  card
	 */
	public Card(Suit s, Value v) {
		// TODO - implement Card.Card
		//throw new UnsupportedOperationException();
                suit = s;
                value = v;
	}//card constructor
    
}