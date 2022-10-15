package warCardGame;

import java.util.ArrayList;
import java.util.List;

public class Players {

private int score;
private String name;
final int TOP_CARD =0;
List<Card> hand = new ArrayList<Card>();
public  Players () {
	
	setScore(0);
	setName(name);
}

public int getScore() {
	return score;
}

public void setScore(int score) {
	this.score = score;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void describePlayer() {
	System.out.println("Player Name: " + getName());
	for(Card card: hand) {
		card.describe();
	}
}

	public Card flip() {
		Card cardFlipped = hand.get(TOP_CARD);
		hand.remove(TOP_CARD);
		return cardFlipped;
	}
	
	public void draw(Deck deck) {
		for(int i = 1; i <= 26; i++) {
			Card card = deck.draw();
			hand.add(card);
		}
	}
	
	public void scoreIncrease() {
		score++;
		
	} 
	
}
