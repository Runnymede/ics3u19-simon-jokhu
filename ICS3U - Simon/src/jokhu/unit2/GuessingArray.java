package jokhu.unit2;

import java.util.Scanner;

public class GuessingArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] drinks= {"Gingerale","Coke","Pepsi","Sprite","Ice Tea","Dr.Peper","7-up","Root-beer","Orange Juice","Water","Apple Juice","Tea","Hot Chocolate","Fruit Punch","Lemonade","Coffee","Beer","Wine","Vodka","Rum","Honey" };
		String question=("Is your drink ");
		System.out.println("Come up with a random drink and press enter when your ready.");
		for (int counter=0;counter<=20;counter++) {
			System.out.println(question+drinks[counter]+"?");
			String correct=sc.next();
			if (correct.equalsIgnoreCase("yes"))
			{
				System.out.println("Ha that was easy");
				break;

			}
		}
		if (counter<=20) {
			System.out.println("Darn I should have guessed that.");
		}
	}
}
