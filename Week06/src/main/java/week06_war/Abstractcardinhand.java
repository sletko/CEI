package week06_war;

import java.util.*;

@SuppressWarnings("serial")
public abstract class Abstractcardinhand extends LinkedList<Card> {


//creates the deck and also used to create the hand
@Override
public String toString() {
	StringBuilder result = new StringBuilder();
	String lf = System.lineSeparator();
	String space = "  ";
	
	// This creates providing the geter and seter function
	result.append(getClass().getSimpleName()).append(": ").append(lf);
	
	//Removes the card from the deck as it is dealt
	for(Card card : this) {
		result.append(space).append(card).append(lf);
		}
	return result.toString();
	}
	public void describe() {
		System.out.println(this);
		}
}
