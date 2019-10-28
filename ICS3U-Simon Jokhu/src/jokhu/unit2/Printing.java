package jokhu.unit2;
/**
 * Printing.java
 * Finds out how much paper the user wants and tells them the cost of how much they want as well as the price per copy.
 * October 7, 2019
 * @author Simon Jokhu
 */
import java.util.Scanner;

public class Printing {
	/**
	 * Beginning of Number Check program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Part that finds out the print cost by how many copies they would like
		System.out.print("How many copies would you like?");
		int printCopies = sc.nextInt();
		double printCost = 0;
		if (printCopies > 1000) {
			printCost = (0.25);
		} else if (printCopies >= 750) {
			printCost = (0.26);
		} else if (printCopies >= 500) {
			printCost = (0.27);
		} else if (printCopies >= 100) {
			printCost = (0.28);
		} else if (printCopies >= 0) {
			printCost = (0.30);
		} else {
			System.out.println("Invalid Number");
		}
		
		//Tells you the cost per page and your total price
		System.out.format("Cost $%.2f a page\n", printCost);
		System.out.format("Your total cost is $%.2f", printCost * printCopies);

	}

}
