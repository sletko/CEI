package week06_war;

import java.util.*;

@SuppressWarnings("serial")
public abstract class Abstractcardinhand extends LinkedList<Card> {


//creates the deck
@Override
public String toString() {
	StringBuilder result = new StringBuilder();
	String lf = System.lineSeparator();
	String space = "  ";
	
	result.append(getClass().getSimpleName()).append(": ").append(lf);
	
	for(Card card : this) {
		result.append(space).append(card).append(lf);
		}
	return result.toString();
	}
	public void describe() {
		System.out.println(this);
		}
}
