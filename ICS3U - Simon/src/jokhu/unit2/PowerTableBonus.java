package jokhu.unit2;

import java.util.Scanner;

public class PowerTableBonus {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("What is your exponent Value");
			System.out.println("What is your base value");
			int expoStop= sc.nextInt();
			int baseStop= sc.nextInt();
			int base=1;
			int num=1;

			for (base=1; base<=6; base ++) {
	System.out.println();
				for(int exp=1; exp<=5 ;exp++) {
					num= (int) Math.pow(base,exp);
					System.out.print(num+" ");

				}
			}

		}
}



	}

}
