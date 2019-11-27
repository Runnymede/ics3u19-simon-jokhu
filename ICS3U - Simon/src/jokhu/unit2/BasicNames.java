package jokhu.unit2;

import java.util.Scanner;

public class BasicNames {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("How many names you got?");
		int namesAmount=sc.nextInt();
		String[]names1 =new  String[namesAmount];

		System.out.println("What are your names?"); 
		String names= sc.nextLine();
		//names1.length()
//straigt order
		for(int counter=0;counter<namesAmount;counter++) {
			names1[counter]=sc.next();
		
		
		}
		for(int counter=0;counter<namesAmount;counter++) {
			System.out.println(names1[counter]);
		}
		//reverse order
		for(int counter=names1.length-1;counter>=0;counter--) {
			System.out.println(names1[counter]);
		}
	}

}