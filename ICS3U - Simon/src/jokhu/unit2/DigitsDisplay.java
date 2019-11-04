package jokhu.unit2;

import java.util.Scanner;

public class DigitsDisplay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a 3-digit postive integer.");
		int integer= sc.nextInt();
		int div = 100;
		int mod = 1000;
		
		int digits;
		
		do {
			digits = integer%mod/div;
			System.out.println(digits);
			div = div/10;
			mod = mod/10;
			

		}while (mod >= 10);
		System.out.println("Done!");
	}

}
