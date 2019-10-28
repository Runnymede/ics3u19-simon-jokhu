package jokhu.unit2;
/**
 * NumberCheck.java
 * Finds whether a random given number is postive or negative and if its divisible by 7
 * October 2, 2019
 * @author Simon Jokhu
 */
import java.util.Scanner;

public class NumberCheck {
	/**
	 * Beginning of Number Check program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Give Me a random whole number");
		int randomNumber = sc.nextInt();

		
		//The part that test whether the number is positive or negative
		if (randomNumber > 0)
		{
			System.out.println("Your number is positive");
		}
		else 
		{
			System.out.println("Your number is negative");
		}

		//The part that test whether the number is divisible by 7
		if (randomNumber % 7 == 0)
		{
			System.out.println("Your Number is divisible by 7");
		}
		else
		{
			System.out.println("Your Number is not divisible by 7");
		}
	}
}