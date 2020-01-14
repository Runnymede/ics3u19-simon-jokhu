package jokhu.unit4;

import java.util.Scanner;

public class TechQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Tech practice/quiz/review program!");
		do{
			System.out.println("What topic would you like to work on?");
			System.out.println("1.Loop questions 2. MathClass, string methods and switch statements");
			System.out.println("3.Primitive Data types and object types 4.Boolean");
			int userInput=sc.nextInt();
			int question=0;
			if (userInput==0){
				for(int counter=loopQuiz(quiz).length;counter==0;counter--){
					loopQuiz(quiz)[question];
					loopQuiz (choices)[question];
					int userAnswer=sc.nextInt;
					if userAnswer=loopQuiz(answer)[question]{
						System.out.print("correct");
					}
					else{
						System.out.print("incorrect");
					}
					question++;
				}
			}
			else if (userInput==2){
				for(int counter=mathClass(quiz).length;counter==0;counter--){
					mathClass(quiz)[question];
					mathClass(choices)[question];
					int userAnswer=sc.readInt;
					If userAnswer=mathClass(answer)[question]{
						System.out.print("correct");
					}
					else{
						System.out.print("incorrect");
					}
					question++;
				}
			}
			else if (userInput=3){
				for(int counter=primitiveData(quiz).length;counter==0;counter--){
					primitiveData (quiz)[question];
					primitiveData (choices)[question];
					int userAnswer=sc.readInt;
					if userAnswer=primitiveData(answer)[question]{
						System.out.print("correct");
					}
					else{
						System.out.print("incorrect");
					}
					question++;
				}
			}
			else {
				for(int counter=booleanExpressions(quiz).length;counter==0;counter--){
					booleanExpressions(quiz)[question];
					booleanExpressions(choices)[question];
					int userAnswer=sc.readInt;
					if (userAnswer=booleanExpressions(answer)[question]){
						System.out.print("correct");
					}
					else{
						System.out.print("incorrect");
					}
					question++;
				}
			}
			System.out.println("would you like to try again");
			String restart =sc.readline;
		}while(restart.equalsIgnoreCase("yes"));

	}

	public static String loopQuiz(String []quiz,int[]answer,String [][]choices) {
		quiz[0] = "What is the difference between do-while and while loop?";
		quiz[1] = "What are for-loops good for?";
		quiz[2] = "What is debugging used for?";
		quiz[3] = "Which is the correct order of making a while loop?";
		quiz[4] = "A loop that repeats a specified number times is know as a _____.";
		quiz[5] = "In all but rare cases, loops must contain within themselves";
		quiz[6] = "If a loop does not contain a way to terminate, it is called";
		quiz[7] = "What is the number of iterations for the following Loop\n for (int i=1;i<=n;i++) {\n}";
		quiz[8] = "What is the number of iterations for the following Loop\n for (int i=1;i<n;i++) {\n}";

		choices[0][0]="1.Do-while loops only work if a condition is met";
		//		
		choices[0][1]="2.Do-while loops play through at least once";
		choices[0][2]="3.While loops and do while loops are the same";
		choices[0][3]="4.While loops play through at least once";

		choices[1][0]="1.For loops are like if-statement loops";
		choices[1][1]="2.For loops are good for going through the loop at least once";
		//
		choices[1][2]="3.For loops are good for having counters in them";
		choices[1][3]="4.For loops are good for nothing";

		choices[2][0]="1.Debugging is used for getting insects out of your computer";
		choices[2][1]="2.Debugging is used for getting viruses out of your computer";
		choices[2][2]="3.Debugging is used for fixing syntax errors";
		//
		choices[2][3]="4.Debugging is used for fixing logic errors";

		choices[3][0]="1.Test, Initialize, Change, Select";
		choices[3][1]="2.Initialize, Change, Select, Test";
		//
		choices[3][2]="3.Select, Initialize, Test, Change";
		choices[3][3]="4.Select, Initialize, Change, Test";
		
		//
		choices[4][0]="1.Counted Loop";
		choices[4][1]="2.Infinite Loop";
		choices[4][2]="3.Sentinel Loop";
		choices[4][3]="4.Conditional Loop";

		choices[5][0]="1.Arithmatic Statements";
		choices[5][1]="2.Nested Loops";
		//
		choices[5][2]="3.A way to terminate";
		choices[5][3]="4.If-Statements";
		
		choices[6][0]="1.A do-While loop";
		choices[6][1]="2.A while loop";
		//
		choices[6][2]="3.An infinite loop";
		choices[6][3]="4.A for Loop";
		
		choices[7][0]="1.n+1";
		choices[7][1]="2.n-1";
		//
		choices[7][2]="3.n";
		choices[7][3]="4.2*n";
		
		choices[8][0]="1.2*n";
		choices[8][1]="2.n+1";
		choices[8][2]="3.n";
		//
		choices[8][3]="4.n-1";
		
		answer[0]=2;
		answer[1]=3;
		answer[2]=4;
		answer[3]=3;
		answer[4]=4;
		answer[5]=3;
		answer[6]=3;
		answer[7]=2;
		answer[8]=4;
	}
}
