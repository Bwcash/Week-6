package warCardGame;

import java.util.HashMap;


public class Card {
	
	
	private int value;
	private int name;
	
	public Card(int value, int name) {
		this.value = value;
		this.name = name;
	}
	
	
	public int getValue() {
		return value;
	}
		public int getName() {
		return name;
	}
	
	public StringBuilder describe() {
		StringBuilder cardInfo = new StringBuilder();
		HashMap<Integer, String> cardValue = new HashMap<Integer, String>();
		cardValue.put(2, "Two");
		cardValue.put(3, "Three");
		cardValue.put(4, "Four");
		cardValue.put(5, "Five");
		cardValue.put(6, "Six");
		cardValue.put(7, "Seven");
		cardValue.put(8, "Eight");
		cardValue.put(9, "Nine");
		cardValue.put(10, "Ten");
		cardValue.put(11, "Jack");
		cardValue.put(12, "Queen");
		cardValue.put(13, "King");
		cardValue.put(14, "Ace");
		
		HashMap<Integer, String> cardName = new HashMap<Integer, String>();
		cardName.put(0, "Spades");
		cardName.put(1, "Diamonds");
		cardName.put(2, "Clubs");
		cardName.put(3, "Hearts");
		
		return cardInfo.append(cardValue.get(getValue())).append(" of ").append(cardName.get(getName()));
		
	}
	 
	
	
	
	
}
	
	
	
	
	
	

 
