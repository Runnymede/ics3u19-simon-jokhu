package jokhu.unit2;
/**
 * CarRecall.java
 * Finds out if someones car is defective or not by its model.
 * October 7, 2019
 * @author Simon Jokhu
 */
import java.util.Scanner;

public class CarRecall {
	/**
	 * Beginning of Number Check program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Ask for the user for their car model
		System.out.print("What is the model of your car?");
		int carModel = sc.nextInt();

		//Finds Whether the user's car is defective or not by it's model number
		switch (carModel) {
		case 199:
			System.out.println("Your car is defective. It must be repaired.");
			break;

		case 179:
			System.out.println("Your car is defective. It must be repaired.");
			break;

		case 189:
			System.out.println("Your car is defective. It must be repaired.");
			break;

		case 190:
			System.out.println("Your car is defective. It must be repaired.");
			break;

		case 191:
			System.out.println("Your car is defective. It must be repaired.");
			break;

		case 192:
			System.out.println("Your car is defective. It must be repaired.");
			break;

		case 193:
			System.out.println("Your car is defective. It must be repaired.");
			break;

		case 194:
			System.out.println("Your car is defective. It must be repaired.");
			break;

		case 195:
			System.out.println("Your car is defective. It must be repaired.");
			break;

		case 221:
			System.out.println("Your car is defective. It must be repaired.");
			break;

		case 780:
			System.out.println("Your car is defective. It must be repaired.");
			break;

		default:
			System.out.println("Your car is uneffected.");
		}

	}

}
