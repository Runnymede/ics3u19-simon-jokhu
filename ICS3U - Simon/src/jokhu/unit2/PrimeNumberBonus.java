package jokhu.unit2;
/**
 * PrimeNumberBonus.java  
 * Ask a user for two numbers and tells them whether their numbers are prime numbers or not and the numbers in between.
 * November 7 2019
 * @author Simon Jokhu
 */ 

import java.util.Scanner;

public class PrimeNumberBonus {
	/**
	 * Beginning of Prime Number-Bonus program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

/*
 *  Ask for the user's number and tells them to make sure their first number is smaller than the second.
 *  Then it declares the num in variables
 *  Adds a modulus variable called mod
 *  adds a division variable
 *  Then it determines whether the numbers are prime or not
 */
		System.out.println("What are two of your numbers?\nMake sure your second number is larger than the first number.");
		int num =sc.nextInt();
		int numTwo = sc.nextInt();
		int mod;
		int div = 2;
		numTwo++;
	
		while (num != numTwo) {

			do{

				mod=num%div;
				div++;


			}while (mod != 0 && div<num);
			if (mod != 0) {
				System.out.println(num+" is a prime number");	
			}
			else if(num==2){
				System.out.println(num+" is a prime number");
			}
			else {
				System.out.println(num+" is not a prime number");

			}
			num++;
			div=2;
		}

	}

}
