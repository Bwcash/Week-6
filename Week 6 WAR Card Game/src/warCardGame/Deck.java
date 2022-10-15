package warCardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	final int TOP_CARD = 0;
	private List<Card> cards = new ArrayList<Card>(52);

	public Deck() {
		for(int cardName = 0; cardName <4; cardName++) {
		for(int cardValue = 2; cardValue <=14; cardValue++) {
				cards.add(new Card(cardName, cardValue));
			}		
		}
	}

	public  List<Card> getCards(){
		return cards;
		
	}
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		Card topCard = cards.get(TOP_CARD);
		cards.remove(TOP_CARD);
		return topCard;
	}
	 
}
