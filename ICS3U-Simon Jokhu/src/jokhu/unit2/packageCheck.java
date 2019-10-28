package jokhu.unit2;
/**
 * packageCheck.java 
 * Ask the user the weight and dimensions of their package and determines what's wrong with it or if it can be accepted.
 * October 15,2019
 * @author Simon Jokhu
 */
import java.util.Scanner;

public class packageCheck {
	/**
	 * Beginning of packageCheck program
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//The part that finds out the dimentions and weight of a package
		System.out.println("What is the package weight in kilograms");
		int packageWeight = sc.nextInt();
		System.out.println("What is the length of the package in centimetres");
		int packageLength = sc.nextInt();
		System.out.println("What is the width of the package in centimetres");
		int packageWidth = sc.nextInt();
		System.out.println("What is the height of the package in centimetres");
		int packageHeight = sc.nextInt();
		
		// Part that figures out the package size from the dimentions
		int packageSize = (packageLength*packageWidth*packageHeight);
		
		//Determines whether the package can be accepted or if its too big or heavy or both
		if (packageSize <= 100000 && packageWeight<=27)
			System.out.print("Accepted");
		else if (packageSize > 100000 && packageWeight > 27 )
			System.out.print("Package is too heavy and too big");
		else if (packageSize >100000)
			System.out.print("The package is too big");
		else if (packageWeight >27 )
			System.out.print("The package is too heavy");



	}

}
