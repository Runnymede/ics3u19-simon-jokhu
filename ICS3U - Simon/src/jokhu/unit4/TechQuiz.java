package jokhu.unit4;

import java.util.Scanner;

public class TechQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Tech practice/quiz/review program!");
Do{
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


		Else if (userInput==2){
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
					question=1;
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
		Else {
		for(int counter=booleanExpressions(quiz).length;counter==0;counter--){
		booleanExpressions(quiz)[question];
		booleanExpressions(choices)[question];
		int userAnswer=sc.readInt;
		if (userAnswer=booleanExpressions(answer)[question]){
		System.out.print("correct");
		}
		else{
		system.out.print("incorrect");
		}
		question++;
		}
			}
		System.out.println("would you like to try again");
		String restart =sc.readline;
		}while(restart.equalsIgnoreCase("yes"));

	}

	public static String loopQuiz(String []quiz,String[]answer,String [][]choices) {
		
	}
}
