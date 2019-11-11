package jokhu.unit2;
/**
 * PrimeNumbers.java   
 * Ask a user for a numbers and tells them whether their number is a prime numbers or not.
 * November 7 2019
 * @author Simon Jokhu
 */
import java.util.Scanner;

public class PrimeNumbers {
	/**
	 * Beginning of Prime Number program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//Ask for two numbers and gets a division and modulus operator variable
		System.out.println("What is your numbers?");
		int num =sc.nextInt();
		int mod = 1;
		int div = 2;
		//Checks to see if the number is prime or not
		while (mod != 0 && div<num) {

			mod=num%div;
			div++;	


		}
		//Tells you if your number is prime or not
		if (mod != 0) {
			System.out.println(num+" is a prime number");	
		}
		else {
			System.out.println(num+" is not a prime number");
		}

	}

}
