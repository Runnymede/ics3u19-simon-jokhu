package jokhu.unit2;

import java.util.Scanner;

public class PowerTableBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your exponent Value?");
		System.out.println("What is your base value?");
		int expoStop= sc.nextInt();
		int baseStop= sc.nextInt();
		int base=1;
		int num=1;

		for (int exp=1; exp<=expoStop; exp++) {
			
			System.out.printf("%-25s","x^"+exp);	
		}
		for (base=1; base<=baseStop; base ++) {
			System.out.println();


			for(int exp=1; exp<=expoStop ;exp++) {
				num= (int) Math.pow(base,exp);
				System.out.printf("%-25s",num);
			}
		}

	}
}






