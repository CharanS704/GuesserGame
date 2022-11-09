import java.util.*;

//Guesser class
class Guesser {
	int guessNum;
	boolean b = true;

	int guessNum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser please guess a number within 1 to 10!!");
		while (b) {
			guessNum = scan.nextInt();
			if (guessNum >= 1 && guessNum <= 10) {
				System.out.println("Thank you for your response Guesser!!");
				break;
			} else {
				System.out.println("Value exceeds the limit, please guess a number within 1 to 10");
			}
		}

		return guessNum;
	}
}

class Player1 {
	int guessNum;
	boolean b = true;
	String pname;

	int guessNum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hey " + pname + " please guess a number within 1 to 10!!");
		// The loop runs until provides the input within range
		while (b) {
			guessNum = scan.nextInt();
			if (guessNum >= 1 && guessNum <= 10) {
				System.out.println("Thank you for your response " + pname);
				break;
			} else {
				System.out.println("Value exceeds the limit, please guess a number within 1 to 10");
			}
		}

		return guessNum;
	}

	// Method to ask user a nickname
	String playerName() {
		Scanner name = new Scanner(System.in);
		System.out.println("Player 1 please enter your nickname: ");
		pname = name.nextLine();
		return pname;

	}

}

class Player2 {
	int guessNum;
	String pname;
	boolean b = true;

	int guessNum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hey " + pname + " please guess a number within 1 to 10!!");
		// The loop runs until provides the input within range
		while (b) {
			guessNum = scan.nextInt();
			if (guessNum >= 1 && guessNum <= 10) {
				System.out.println("Thank you for your response " + pname);
				break;
			} else {
				System.out.println("Value exceeds the limit, please guess a number within 1 to 10");
			}
		}

		return guessNum;
	}

	// Method to ask user a nickname
	String playerName() {
		Scanner name = new Scanner(System.in);
		System.out.println("Player 2 please enter your nickname: ");
		pname = name.nextLine();
		return pname;

	}

}

class Player3 {
	int guessNum;
	boolean b = true;
	String pname;

	int guessNum() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Hey " + pname + " please guess a number within 1 to 10!!");
		// The loop runs until provides the input within range
		while (b) {
			guessNum = scan.nextInt();
			if (guessNum >= 1 && guessNum <= 10) {
				System.out.println("Thank you for your response " + pname);
				break;
			} else {
				System.out.println("Value exceeds the limit, please guess a number within 1 to 10");
			}
		}

		return guessNum;
	}

	// Method to ask user a nickname
	String playerName() {
		Scanner name = new Scanner(System.in);
		System.out.println("Player 3 please enter your nickname: ");
		pname = name.nextLine();
		return pname;

	}

}

class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	String player1Name;
	String player2Name;
	String player3Name;

	void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
	}

	void collectNumFromPlayers() {
		Player1 p1 = new Player1();
		Player2 p2 = new Player2();
		Player3 p3 = new Player3();
		player1Name = p1.playerName();
		numFromPlayer1 = p1.guessNum();
		player2Name = p2.playerName();
		numFromPlayer2 = p2.guessNum();
		player3Name = p3.playerName();
		numFromPlayer3 = p3.guessNum();

	}

	void compare() {
		System.out.println();
		System.out.println("Number guessed by guesser: " + numFromGuesser);
		System.out.println("Number guessed by " + player1Name + " : " + numFromPlayer1);
		System.out.println("Number guessed by " + player2Name + " : " + numFromPlayer2);
		System.out.println("Number guessed by " + player3Name + " : " + numFromPlayer3);
		System.out.println();

		if (numFromGuesser == numFromPlayer1) {
			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("All players won the game!!!");
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println(player1Name + " & " + player2Name + " won the game!!");
			} else if (numFromGuesser == numFromPlayer3) {
				System.out.println(player1Name + " & " + player3Name + " won the game!!");
			} else {
				System.out.println(player1Name + " won the game!!");
			}
		} else if (numFromGuesser == numFromPlayer2) {
			if (numFromGuesser == numFromPlayer3) {
				System.out.println(player2Name + " & " + player3Name + " won the game!!");
			} else {
				System.out.println(player2Name + " won the game!!");
			}
		} else if (numFromGuesser == numFromPlayer3) {
			System.out.println(player3Name + " won the game!!");
		} else {
			System.out.println("Game lost, Guesser WON!");
			System.out.println("Hey " + player1Name + ", " + player2Name + ", " + player3Name
					+ " no worries, let's play the game again!!");
		}

	}

}

public class GuesserGame {

	public static void main(String[] args) {

		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();

	}

}

/*
 * Enhancements done: 
 * 1) System will ask guesser and players for input until the values provided are within the expected range. 
 * 2) System will ask players for their nickname. (Guesser remains anonymous!!) 
 * 3) Messages printed will now be having the player names and the values provided by them.
 * 
 */
