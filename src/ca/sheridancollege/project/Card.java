package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
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
         * @return this.suit
         */
	public Suit getSuit() {
		return this.suit;
	}//method returns card suit

        /**
         * 
         * @param suit 
         */
	public void setSuit(Suit suit) {
		this.suit = suit;
	}

        /**
         * 
         * @return this.value
         */
	public Value getValue() {
		return this.value;
	} //method returns card value

        /**
         * 
         * @param value 
         */
	public void setValue(Value value) {
		this.value = value;
	}

	/**
	 * Students should implement this method for their specific children classes
	 * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
	 */
	@Override()
	public String toString(){
            return " Value : " + value + " Suit: " + suit;
        }

        /*
	public int getRank() {
		// TODO - implement Card.getRank
		//throw new UnsupportedOperationException();
                int rankNum = 0;
                switch(this.value){
                        case TWO:
                        rankNum = 1;
                        break;
                        case THREE:
                        rankNum = 2;
                        break;
                        case FOUR:
                        rankNum = 3;
                        break;
                        case FIVE:
                        rankNum = 4;
                        break;
                        case SIX:
                        rankNum = 5;
                        break;
                        case SEVEN:
                        rankNum = 6;
                        break;
                        case EIGHT:
                        rankNum = 7;
                        break;
                        case NINE:
                        rankNum = 8;
                        break;
                        case TEN:
                        rankNum = 9;
                        break;
                        case JACK:
                        rankNum = 10;
                        break;
                        case QUEEN:
                        rankNum = 11;
                        break;
                        case KING:
                        rankNum = 12;
                        break;
                        case ACE:
                        rankNum = 13;
                        break;
                }
                return rankNum;
	}
        */

	/**
	 * 
	 * @param s
	 * @param v
	 */
	public Card(Suit s, Value v) {
		// TODO - implement Card.Card
		//throw new UnsupportedOperationException();
                suit = s;
                value = v;
	}//card constructor
    
}