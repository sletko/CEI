package week06_war;

import java.util.*;

@SuppressWarnings("unused")
public class Player {
	private String name;
	private Hand hand = new Hand();
	private int score;
	
	public Player(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public void draw(Deck deck) {
		hand.add(deck.remove());
		
	}
	
	public void describe() {
		StringBuilder builder = new StringBuilder();
		builder.append("Player").append(name).append(hand);
		System.out.println(builder.toString());
	}

	public Hand getHand() {
		
		return hand;
	}

	public Card flip() {
		
		return hand.remove();
	}

	public void increamentScore() {
		score = getScore() + 1;
		
	}

	public int getScore() {
		return score;
	}
}
