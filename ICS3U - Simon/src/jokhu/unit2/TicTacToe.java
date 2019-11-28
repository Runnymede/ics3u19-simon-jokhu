package jokhu.unit2;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lets play tic-tac-toe!");
		
		//player one loop
		int end=1;
		String again ="";
		do {
			end=1;
			char [][] board=new char[3][3];
			for (int counter=0;counter<4;counter++) {
				if (end!=1) break;
				System.out.println("What row would you like to go in starting from 0, player 1");
				int playerOneR=sc.nextInt();
				System.out.println("What coloum would you like to go in starting from 0, player 1");
				int playerOneC=sc.nextInt();
				board[playerOneR][playerOneC]='x';

				if (board[0][0]=='x' && board[0][1]=='x' && board[0][2]=='x') {
					System.out.println("Player 1 wins");
					end++;
				}
				if (board[1][0]=='x' && board[1][1]=='x' && board[1][2]=='x') {
					System.out.println("Player 1 wins");
					end++;
				}
				if (board[2][0]=='x' && board[2][1]=='x' && board[2][2]=='x') {
					System.out.println("Player 1 wins");
					end++;
				}
				if (board[0][0]=='x' && board[1][0]=='x' && board[2][0]=='x') {
					System.out.println("Player 1 wins");
					end++;
				}
				if (board[0][1]=='x' && board[1][1]=='x' && board[2][1]=='x') {
					System.out.println("Player 1 wins");
					end++;
				}
				if (board[0][2]=='x' && board[1][2]=='x' && board[2][2]=='x') {
					System.out.println("Player 1 wins");
					end++;
				}
				if (board[0][0]=='x' && board[1][1]=='x' && board[2][2]=='x') {
					System.out.println("Player 1 wins");
					end++;
				}
				if (board[0][2]=='x' && board[1][1]=='x' && board[2][0]=='x') {
					System.out.println("Player 1 wins");
					end++;
				}
				if (end!=1) break;
				for (int row=0;row<board.length;row++) {
					for (int col=0;col<board[0].length;col++) {
						System.out.print("|"+board[row][col]+"|");
					}
					System.out.println("\n---------");
				}

				//player two loop
				for (int counterTwo=0;counterTwo<1;counterTwo++){
					if (end!=1) break;
					counter=0;
					System.out.println("What row would you like to go in starting from 0, player 2");
					int playerTwoR=sc.nextInt();
					System.out.println("What coloum would you like to go in starting from 0, player 2");
					int playerTwoC=sc.nextInt();
					board[playerTwoR][playerTwoC]='o';

					if (board[0][0]=='o' && board[0][1]=='o' && board[0][2]=='o') {
						System.out.println("Player 2 wins");
						end++;
					}
					if (board[1][0]=='o' && board[1][1]=='o' && board[1][2]=='o') {
						System.out.println("Player 2 wins");
						end++;
					}
					if (board[2][0]=='o' && board[2][1]=='o' && board[2][2]=='o') {
						System.out.println("Player 2 wins");
						end++;
					}
					if (board[0][0]=='o' && board[1][0]=='o' && board[2][0]=='o') {
						System.out.println("Player 2 wins");
						end++;
					}
					if (board[0][1]=='o' && board[1][1]=='o' && board[2][1]=='o') {
						System.out.println("Player 2 wins");
						end++;
					}
					if (board[0][2]=='o' && board[1][2]=='o' && board[2][2]=='o') {
						System.out.println("Player 2 wins");
						end++;
					}
					if (board[0][0]=='o' && board[1][1]=='o' && board[2][2]=='o') {
						System.out.println("Player 2 wins");
						end++;
					}
					if (board[0][2]=='o' && board[1][1]=='o' && board[2][0]=='o') {
						System.out.println("Player 2 wins");
						end++;
					}
					if (end!=1) break;
					for (int row=0;row<board.length;row++) {
						for (int col=0;col<board[0].length;col++) {
							System.out.print("|"+board[row][col]+"|");
						}
						System.out.println("\n---------");
					}

				}
			}
			System.out.println("Would You like to play again?");
			again=sc.next();
		}while(again.equals("yes"));
	}

}
