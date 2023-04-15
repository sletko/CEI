package week06_war;

import java.util.*;

@SuppressWarnings("serial")
public class Deck extends Abstractcardinhand {

// private List<String> cardNames = List.of("Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King");
// private List<String> Suits = List.of("Clubs", "Diamonds", "Hearts", "Spades");

private List<String> cardNames;
private List<String> suits;
private int startRank;

 private boolean useCard = true;
 
 public Deck() {
	 initList();
	 
	 for (int rank = startRank; rank < cardNames.size() + startRank; rank++) {
	 String cardName = cardNames.get(rank - startRank);
	 generateCardForPerson(rank, cardName);

	 }
 }


 
private void generateCardForPerson(int rank, String cardName) {
	for (String suit : suits)
		 add(new Card(cardName, suit, rank));
	
}



private void initList() {
	if(useCard) {
		cardNames = List.of("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace");

		suits = List.of("Clubs", "Diamonds", "Hearts", "Spades");
		startRank = 2;

	
	}
}
//Method to shuffle cards
public void shuffle() {
	Collections.shuffle(this);
	}

}



