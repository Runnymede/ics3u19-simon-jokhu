package jokhu.unit4;

import java.util.Scanner;

public class IsoTriangles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a number to make a triangle.");
		int tri = sc.nextInt();
		int end=0;
		while(end<=tri){
			end++;
		drawSpaces(tri);
		drawStars(tri);
		System.out.println();
		}
		
	}
	
	public static void drawSpaces(int x) {
		int spaces=x-1;
		int counter=spaces;
		while (counter>=x)
			spaces--;
		while(spaces>0) {
			System.out.print(" ");
			spaces--;
		}


	}
	public static void drawStars(int y) {
		int stars=1;
		int counter=y;
	while (counter>=y)
		counter+=2;
		while (stars!=y) {
			stars+=2;
			System.out.print("*");
		}

	}
}
