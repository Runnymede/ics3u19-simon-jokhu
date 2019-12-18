package jokhu.unit4;

import java.util.Scanner;

public class IsoTriangles {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give me a number to make a triangle.");
		int tri = sc.nextInt();
		
		for(int end=0;end<tri;end++){
			
			drawSpaces(tri);
			drawStars(tri);
			
		
			spaces--;
			stars+=2;
			System.out.println();
		}

	}

	public static void drawSpaces(int x) {
		int spaces=x-1;
		int counter=spaces;
			
		while(spaces>0) {
			System.out.print(" ");
			spaces--;
		}


	}
	public static void drawStars(int y) {
	int rows=0;
		for(int counter=0;counter<y;counter++) {
			System.out.print("*");
			if(rows<y)
				System.out.println();
		}
	}
}
