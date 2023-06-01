package week06_war;

public class Card {
	private String card;
	private String suit;
	private int rank;
		
	public Card(String card, String suit, int rank) {
		this.card = card;
		this.suit = suit;
		this.rank = rank;
	}

	public String getCard() {
		return card;
	}

	public String getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}

	@Override
	public String toString() {
		return card + " of " + suit;
	}
}

