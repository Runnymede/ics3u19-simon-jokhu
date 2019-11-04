package jokhu.unit2;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a 3-digit postive integer.");
		int integer= sc.nextInt();
		int div = 100;
		int mod = 1000;
		int summer=0;
		int digits;
		int counter = 0;
		
		do {
			counter += 1;
			digits = integer%mod/div;
			div = div/10;
			mod = mod/10;
			summer=summer+digits;

		}while (counter <3);
		System.out.println(summer);
	}

}
