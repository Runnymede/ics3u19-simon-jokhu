package jokhu.unit2;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lets play tic-tac-toe!");
		char [][] board=new char[3][3];
		//player one loop
		for (int counter=0;counter<4;counter++) {
			System.out.println("What row would you like to go in starting from 0, player 1");
			int playerOneR=sc.nextInt()-1;
			System.out.println("What coloum would you like to go in starting from 0, player 1");
			int playerOneC=sc.nextInt()-1;
//moh for -1
			board[playerOneR][playerOneC]='x';
			for (int row=0;row<board.length;row++) {
				for (int col=0;col<board[0].length;col++) {
					System.out.print("|"+board[row][col]+"|");
				}
				System.out.println("\n---------");
			}
			//player two loop
			for (int counterTwo=0;counterTwo<1;counterTwo++){
				counter=0;
				System.out.println("What row would you like to go in starting from 0, player 2");
				int playerTwoR=sc.nextInt()-1;
				System.out.println("What coloum would you like to go in starting from 0, player 2");
				int playerTwoC=sc.nextInt()-1;
				board[playerTwoR][playerTwoC]='o';

				for (int row=0;row<board.length;row++) {
					for (int col=0;col<board[0].length;col++) {
						System.out.print("|"+board[row][col]+"|");
					}
					System.out.println("\n---------");
				}
			}
		}


	}

}
