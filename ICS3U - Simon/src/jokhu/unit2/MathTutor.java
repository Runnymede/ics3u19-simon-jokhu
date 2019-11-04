package jokhu.unit2;
/**
 * MathTutor.java
 * Prints an eqaution and ask the user for the answer. Tells them if they are right or wrong
 * October 25 2019
 *  @author Simon Jokhu
 */
import java.util.Scanner;

public class MathTutor {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		double numberOne=(int)(Math.random()*10)+1;

		double numberTwo=(int)(Math.random()*10)+1;

		int operator = (int)(Math.random()*4)+1;

		if (operator==1) {
			System.out.print("What is " +numberOne+ "*" +numberTwo);
			double answer=sc.nextDouble();
			if (answer== (numberOne * numberTwo)) {
				System.out.print("Correct");
			}
			else {
				System.out.print("Wrong");	
			}
		}
//Divison is not proper
		else if (operator==2) {
			System.out.print("What is " +numberOne+ "/" +numberTwo);
			double answer=sc.nextDouble();
			Math.rint(answer);
			System.out.print(numberOne / numberTwo);
			
			if (answer== (numberOne / numberTwo)){
				System.out.print("Correct");
			}
			else {
				System.out.print("Wrong");
			}
		}
		else if (operator==3) {
			System.out.print("What is " +numberOne+ "+" +numberTwo);
			double answer=sc.nextDouble();

			if (answer== (numberOne + numberTwo)){
				System.out.print("Correct");
			}
			else {
				System.out.print("Wrong");

			}
		}
		else if (operator==4) {
			System.out.print("What is " +numberOne+ "-" +numberTwo);
			double answer=sc.nextDouble();
			if  (answer== (numberOne - numberTwo)) {
				System.out.print("Correct");
			}
			else {
				System.out.print("Wrong");
			}
		}

	}
}
