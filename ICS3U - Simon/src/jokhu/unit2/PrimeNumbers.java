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


		System.out.println("What are two of your numbers?");
		int num =sc.nextInt();
		int mod = 1;
		int div = 2;
		while (mod != 0 && div<num) {

			mod=num%div;
			div++;	


		}
		if (mod != 0) {
			System.out.println(num+" is a prime number");	
		}
		else {
			System.out.println(num+" is not a prime number");
		}

	}

}
