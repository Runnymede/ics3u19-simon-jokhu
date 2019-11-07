package jokhu.unit2;
/**
 * Necklace.java
 * Ask the user for two numbers then adds the numbers together and prints the first digit of the new number until the first two numbers repeat.
 * November 7 2019
 * @author Simon Jokhu
 */
import java.util.Scanner;

public class Necklace {
	/**
	 * Beginning of Necklace program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Ask for Two numbers and adds finishing variables to end the loop
		//Makes number three equal number one plus number two
		System.out.print("What are the two of your numbers?");
		int num=sc.nextInt();int fin = num;
		int numTwo=sc.nextInt();int finTwo = numTwo;
		int numThree = num  + numTwo;
// Prints the first digit of the new number until the first two numbers repeat
		do {
			numThree=(num+numTwo)%10;
			System.out.println(numThree);
			num=numTwo;
			numTwo=numThree;

		}while(fin!=num || finTwo!=numTwo);

	}

}
