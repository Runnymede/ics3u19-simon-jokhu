package jokhu.unit2;
/**
 * VowelCount.java  
 * Counts vowel from what the user inputs
 * November 20,2019
 * @author Simon Jokhu
 */
import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter Text:");
	 String text = sc.nextLine();
	 int letter=0;
	 int counter=0;
	 for(text.charAt(letter);letter<text.length();letter++) {
		 //checks to see if a value has a vowel in it
		 if (text.charAt(letter) == 'a') {
			 counter++;
		 } else if (text.charAt(letter) == 'e') {
			 counter++;
		 } else if (text.charAt(letter) == 'i') {
			 counter++;
		 } else if (text.charAt(letter) == 'o') {
			 counter++;
		 } else if (text.charAt(letter) == 'u') {
			 counter++;
		 }
	}
	 //tells user the total value
	 System.out.println("Your total values are "+counter);
	}
}
