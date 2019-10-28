package jokhu.unit1;

/**
 * Digits.java
 * Ask for a three digit number and separates the number by its digit number
 * October 01,2019
 * @author Simon Jokhu
 */
import java.util.Scanner;

public class Digits {
	/**
	 * Beginning of Digit program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Question Part
		System.out.print("Enter a three digit number.");
		double threeDigit =sc.nextInt();

		//The Digit Separation Part
		int hundredsDigit= (int)threeDigit/100;
		System.out.println("Hundreads: " +hundredsDigit);

		int tenDigit = (int)threeDigit/10 % 10;
		System.out.println("Tens: " + tenDigit);

		int oneDigit = (int)threeDigit%10;
		System.out.println("Ones: " + oneDigit);

	}

}
