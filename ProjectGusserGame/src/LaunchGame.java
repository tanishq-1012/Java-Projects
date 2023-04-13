import java.util.Scanner;
import java.util.*;

class Gusser{
	
	int guessNum;
	
	int guessNum() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Gusser Kindly Guess the number");
		guessNum = s.nextInt();
		return guessNum;
	}
}

class Player{
	
	int guessNum;
	
    int guessNum() {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Player Kindly Guess the number");
		guessNum = s.nextInt();
		return guessNum;
	}
}

class Umpire{
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGusser() {
		
		Gusser g = new Gusser();
		 numFromGuesser = g.guessNum();
	}
	
	void collectFromPlayers() {
		
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		
		numFromPlayer1 = p1.guessNum();
		numFromPlayer2 = p2.guessNum();
		numFromPlayer3 = p3.guessNum();
		
	}
	
	void compare() {
		
		if(numFromGuesser == numFromPlayer1) {
			System.out.println("Player 1 Won the game");
		}
		else if(numFromGuesser == numFromPlayer2 ) {
			System.out.println("Player 2 Won the game ");
		}
		else if(numFromGuesser == numFromPlayer3) {
			System.out.println("Player 3 won the game");
		}
		else {
			System.out.println("Game lost Try Again");
		}
	}
	
}


public class LaunchGame {

	public static void main(String[] args) {
		Umpire u = new Umpire();
		u.collectNumFromGusser();
		u.collectFromPlayers();
		u.compare();

	}

}
