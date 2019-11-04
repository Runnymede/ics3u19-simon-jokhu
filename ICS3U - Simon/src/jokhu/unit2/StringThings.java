package jokhu.unit2;

import java.util.Scanner;

public class StringThings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Ask for a seven or more letter word
		System.out.println("Enter a 7 or more letter word");
		String word = sc.next();
		System.out.println(word);
		//Changes the word to upper case
		word=word.toUpperCase();
		System.out.println(word);
		//Changes the word to lower case
		word=word.toLowerCase();
		System.out.println(word);
		//Prints the length of the word
		System.out.println(word.length());

		//Prints a char at index of 6 and ask the user to guess the index. Checks to see if they are right or not.
		System.out.println(word.charAt(6));
		System.out.println("What was the index of your words number at?");
		int index = sc.nextInt();	
		if (index==6)
			System.out.println("You Are correct");
		else
			System.out.println("You are Incorrect");


		//Part That ask for two words and checks to see if they match
		System.out.println("Give me two words.");
		String FirstWord = sc.next();
		String SecondWord = sc.next();

		if (SecondWord.equalsIgnoreCase(FirstWord))
			System.out.print("These are the same words. ");
		else
			System.out.print("These are different words. ");

		// Checks to see what word comes lexicographically before the other
		if (FirstWord.compareTo(SecondWord) < 0)
			System.out.println(FirstWord+" comes before "+SecondWord+" in the Ascii alphebet");
		else 
			System.out.println(SecondWord+" comes before "+FirstWord+" in the Ascii alphebet");

		//Ask for a user name and password and allows a user to be accepted or not
		String UserName = ("Superman");
		String Password = ("IronMan");

		System.out.println("What is your username");
		String InputUserName = sc.next();
		System.out.println("What is your password");
		String InputPassword =sc.next();

		if (UserName.equals(InputUserName))

		{
			if (Password.equals(InputPassword)) {
				System.out.print("Welcome Superman");

			}

			else  {
				System.out.print("Incorrect Username and/or password");
			}
		}
	}
}
