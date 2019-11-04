package jokhu.unit1;
/**
 * ObjectHeight.java
 * Asks for a time less than 4.5 seconds and prints out the height of an object from an equation
 * Sept, 9. 2019
 * @author Simon Jokhu
 */
import java.util.Scanner;

public class ObjectHeight {

	/**
	 * Beginning
	 * @param args
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a time less than 4.5 seconds.");
		double time=sc.nextDouble();
		double height =100-2.9*time*time;
		System.out.print("The height of the object is " +height+ ("m"));
	}

}
