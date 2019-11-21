package jokhu.unit2;
/**
 * DiceRolls.java  
 * Gets two random numbers from 1-6 then adds them up
 * November 19,2019
 * @author Simon Jokhu
 */
import java.util.Scanner;

public class DiceRolls {
	/**
	 * Beginning of DiceRolls program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int diceRoll = 0;
		int diceRollTwo=0;
		int total=0;
		int totalTwo=0;
		int counterTwo=0;
		//prints Dice table
		System.out.println("Dice1 Dice2 Total");
	//Dice roll gets a value of dice twice then prints the roll
		for(int counter=0;counter<10;counter++) {
			diceRoll=(int)(Math.random()*6)+1;
			diceRollTwo=diceRoll;
			System.out.print(diceRoll+"      ");
			counterTwo++;
			if (counterTwo==2) {
			System.out.print(diceRoll+diceRollTwo);
			System.out.println();
				counterTwo=0;
				
				
			}
		}
		
	}

}
