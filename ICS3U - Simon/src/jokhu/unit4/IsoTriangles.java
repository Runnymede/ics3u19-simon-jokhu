package jokhu.unit4;

import java.util.Scanner;

public class IsoTriangles {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a number to make a triangle.");
		int tri = sc.nextInt();
//spaces tri-i
//stars i+i-1
		
		for(int i=1;i<=tri;i++) {
			
			
			drawSpaces(tri-i);
		
			drawStars(i+i-1);
		System.out.println();
	}
			



		

	
	}


	public static void drawSpaces(int x) {
		for(int counter=0;counter<x;counter++) {
			System.out.print(" ");

		}

	}
	public static void drawStars(int y) {
		for(int counter=0;counter<y;counter++) {
			System.out.print("*");
		}
	
	}
}

