package jokhu.unit2;
/**
 * GuessingGame.java  
 * Gets a user to guess a random number and checks if it's the same as the random computer number. Then it tells them if they got it right or wrong.Then it repeats.
 * October 28 2019
 * @author Simon Jokhu
 */
import java.util.Scanner;

public class GuessingGame2 {
	/**
	 * Beginning of guessing game 2 program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Ask for a number between 1 and 20 and the computer generates a number

		int secretNumber=(int)(Math.random()*20)+1;
		int playerGuess = -1;
		
		while (playerGuess!=0) {
			
			System.out.println("Guess a number between 1 and 20. Pick 0 to finish");
			playerGuess =sc.nextInt();
			//Checks to see if the player guess was within one to twenty
			if ( playerGuess >0 && playerGuess < 21) {
				//Prints the computer's number and the player's number
				

				//Checks to see if the computer number and player number are the same and tells them if they got it right or not.
				if (secretNumber==playerGuess) {
					System.out.println("Good job you guessed correctly!");
				}
				else {
					System.out.println("You guessed wrong, Better luck next time!");
				}
			}
			else 
				System.out.println("That number is not between 1 and 20");
		}
		System.out.println("Done!");
	}

}
