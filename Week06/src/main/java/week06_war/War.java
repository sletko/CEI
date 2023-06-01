package week06_war;

import java.util.*;


public class War {
	
	private List<String> members = List.of("Bob", "Todd", "Sam", "Jula");
	private Random random = new Random();
	private Player player1;
	private Player player2;
	private Deck deck;
	
	
	public static void main(String[] args) {
		new War().run();
	}

	private void run() {
		selectPlayers();
		deckShuffle();
		cards();
		playGame();
		declareWinner();
		
	}

	private void declareWinner() {
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1 + " is the Winner");
		}
		else if (player1.getScore() < player2.getScore()) {
			System.out.println(player2 + " is the Winner");
		}
		else {
			System.out.println("It is a tie");
		}
		
	}

	private void playGame() {
		int numTurns = player1.getHand().size();
		
		for (int turn = 0; turn < numTurns; turn++) {
			playersFlipCards();
		}
		
	}

	private void playersFlipCards() {
		Card card1 = player1.flip();
		Card card2 = player2.flip();
		
		if (card1.getRank() > card2.getRank()) {
			player1.increamentScore();
		}
		else if (card1.getRank() < card2.getRank()) {
			player2.increamentScore();
		}
		
		
	}

	private void cards() {
		int size = deck.size();
		
		for(int i = 0; i < size; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
			}
			else {
				player2.draw(deck);
			}
		}
				player1.describe();
		
	}

	private void deckShuffle() {
		deck = new Deck();
		
		//Use this print to check the deck
		//System.out.println(deck);
		deck.shuffle();
		
	}


	private void selectPlayers() {
		List <String> names = new LinkedList<>(members);
		player1 = selectPlayer(names);
		player2 = selectPlayer(names);
		
		System.out.println(player1 + " is playing " + player2);
		
	}

	private Player selectPlayer(List<String> names) {
		int pos = random.nextInt(names.size());
		String name = names.remove(pos);
		return new Player(name);
	}

}
