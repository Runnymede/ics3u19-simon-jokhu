package jokhu.unit2;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lets play tic-tac-toe!");
		String [][] board=new String[3][3];
//while Loop
		for (int counter=0;counter<1;counter++) {
			counter=0;
			System.out.println("What row would you like to go in starting from 0, player 1");
			int playerOneR=sc.nextInt();
			System.out.println("What coloum would you like to go in starting from 0, player 1");
			int playerOneC=sc.nextInt();

			board[playerOneR][playerOneC]="x";
			System.out.println(board[playerOneR][playerOneC]);

			for (int counterTwo=0;counterTwo<1;counterTwo++){
				counter=0;
				System.out.println("What row would you like to go in starting from 0, player 2");
				int playerTwoR=sc.nextInt();
				System.out.println("What coloum would you like to go in starting from 0, player 2");
				int playerTwoC=sc.nextInt();
				board[playerTwoR][playerTwoC]="o";
				System.out.println(board[playerTwoR][playerTwoC]);

			}
		}

	}

}
