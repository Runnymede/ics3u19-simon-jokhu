package jokhu.unit2;
/**
 * PrimeNumberBonus.java 
 * Ask a user for two numbers and tells them whether their numbers are prime numbers or not.
 */
import java.util.Scanner;

public class PrimeNumberBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		System.out.println("What are two of your numbers?");
		int num =sc.nextInt();
		int numTwo = sc.nextInt();
		int mod = 1;
		int modTwo=1;
		int div = 2;
		int divTwo=2;
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

		while (modTwo != 0 && divTwo<numTwo) {

			modTwo=numTwo%divTwo;
			divTwo++;	


		}
		if (modTwo != 0) {
			System.out.println(numTwo+" is a prime number");	
		}
		else {
			System.out.println(numTwo+" is not a prime number");
		}
	}

}
