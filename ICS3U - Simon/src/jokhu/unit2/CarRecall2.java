package jokhu.unit2;

import java.util.Scanner;

public class CarRecall2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your car model. Press 0 to end program");
		int carModel = -1;

		while (carModel !=0) {
			carModel = sc.nextInt();
			if (carModel == 199 || carModel== 179 || carModel== 189 || carModel==190 || carModel== 191|| carModel== 192|| carModel== 193|| carModel== 194|| carModel== 195|| carModel== 221|| carModel== 780) { 
				System.out.println("Your car is defective. It must be repaired.");
				System.out.println("What is your car model?");
			} 
			else{
				System.out.println("Your Car is not defective");
				System.out.println("What is your car model?");
			}
		}

		System.out.println("Done!");
	 }
}

