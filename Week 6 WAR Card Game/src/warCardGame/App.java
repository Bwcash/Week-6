package warCardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("Player 1 enter your name: ");
//		String nameOfPlayer1 = sc.nextLine();
//		System.out.println("Player 2 enter your name: ");
//		String nameOfPlayer2 = sc.nextLine();
//	Deck deck = new Deck();
//	deck.shuffle();
//	Player player1 = new Player();
//	player1.player()
//	}
// 
//}
	public static List<Players>getPlayers(Scanner sc){
		List<Players>players = new ArrayList<Players>(2);
		for(int index = 0;index<2;index++) {
			System.out.printf("Enter Player %d name: ", index+1);
			String name = sc.nextLine();
			if((name == null)||(name.isEmpty())) {
				name = String.format("Player %d", index+1);
			}
			Players player = new Players();
			players.add(player);
		}
		return players;
	}

	public static void main(String[]args) {
		List<Players>players = getPlayers(sc);
		Players player1 = players.get(0);
		Players player2 = players.get(1);
		
		Deck deck = new Deck();
	
		deck.shuffle();
		
		player1.draw(deck);
		player2.draw(deck);
		
		Players playerone = new Players();
		
		for(int counter = 0; counter<26;counter++) { 
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
			if(player1Card.getValue()>player2Card.getValue()) {
				System.out.println("_______________________________________");
				playerone.describePlayer();System.out.println("Player 1 Card: " + player1Card.describe());
				System.out.println("Player 2 Card: "+ player2Card.describe());
				System.out.println("Player 1 gets a point");
				player1.scoreIncrease();
				System.out.println("Player 1 Score: "+player1.getScore());
				System.out.println("Player 2 Score: "+player2.getScore());
				System.out.println("_______________________________________");
			}
			else if(player1Card.getValue()<player2Card.getValue()) {
				System.out.println("_______________________________________");
				System.out.println("Player 1 Card: "+ player1Card.describe());
				System.out.println("Player 2 Card: "+ player2Card.describe());
				System.out.println("Player 2 gets a point");
				player2.scoreIncrease();
				System.out.println("Player 1 Score: "+player1.getScore());
				System.out.println("Player 2 Score: "+player2.getScore());
				System.out.println("_______________________________________");
			}
			else {
				System.out.println("_______________________________________");
				System.out.println("Player 1 Card: "+ player1Card.describe());
				System.out.println("Player 2 Card: "+ player2Card.describe());
				System.out.println("Tie. No points awarded");
				System.out.println("Player 1 Score: "+player1.getScore());
				System.out.println("Player 2 Score: "+player2.getScore());
				System.out.println("_______________________________________");
			}
		}
		
		System.out.println("Player 1 Score: "+player1.getScore());
		System.out.println("Player 2 Score: "+player2.getScore());
		if(player1.getScore()>player2.getScore()) {
			System.out.println("Player 1 is the winner!");
		}
		else if(player1.getScore()<player2.getScore()) {
			System.out.println("Player 2 is the winner!");
		}
		else {
			System.out.println("Tie!");
		}
	} 

}
	
	
	
	

