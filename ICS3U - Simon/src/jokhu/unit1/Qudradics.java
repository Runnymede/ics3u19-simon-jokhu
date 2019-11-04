package jokhu.unit1;
/**
 * Quadratics.java
 * Solves a quadratics equation given a, b and c
 * September 9, 2019
 * @author Simon Jokhu
 */
import java.util.Scanner;

public class Qudradics {
	/**
	 * Beginning of quadratics program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Question Part
		System.out.print("What is the value for a?");
		double numberA =sc.nextInt();
		System.out.print("What is the value for b?");
		double numberB =sc.nextInt();
		System.out.print("What is the value for c?");
		double numberC =sc.nextInt();
		
		//Calculation Part
		double xPositive =((-numberB + Math.sqrt(Math.pow(-numberB, 2) -4 * numberA * numberC))/(2*numberA));
		double xNegative =((-numberB - Math.sqrt(Math.pow(-numberB, 2) -4 * numberA * numberC))/(2*numberA));
		
		//Answer Part
		System.out.println("The 2 anwsers are " + xPositive +" and " + xNegative);

	}

}
