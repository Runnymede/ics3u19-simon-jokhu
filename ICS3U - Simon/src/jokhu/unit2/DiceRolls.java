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
		int counter=0;
		int diceRoll = 0;
		int diceSum=0;
		//prints Dice table
		System.out.println("Dice1 Dice2 Total");
	//Dice roll gets a value of dice twice then prints the roll
		while (counter<=1) {
			counter++;
			diceSum=diceRoll;
			diceRoll=(int)(Math.random()*6)+1;
			System.out.print(diceRoll+"      ");
			
		}
		//adds both rolls of the dice up
		System.out.print(diceSum+diceRoll);
	}

}
