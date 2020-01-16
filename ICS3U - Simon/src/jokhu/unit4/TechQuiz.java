package jokhu.unit4;

import java.util.Scanner;

public class TechQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Tech practice/quiz/review program!");
		System.out.println("What topic would you like to work on?");
		System.out.println("1.Loop questions 2. MathClass, string methods and switch statements");
		System.out.println("3.Primitive Data types and object types 4.Boolean");
		int userInput=sc.nextInt();
		int question=0;
		if (userInput==0)
			System.out.print(loopQuiz(quiz));
			for(int counter=loopQuiz(quiz[0]);counter==0;counter--){
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
		quiz[9] = "What is an example of a primitive data type?";
		quiz[10]= "What is an example of an object data type";

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

		choices[9][0]="1.";
		choices[9][1]="2.";
		choices[9][2]="3.";
		choices[9][3]="4.";
		
		choices[10][0]="1.";
		choices[10][1]="2.";
		choices[10][2]="3.";
		choices[10][3]="4.";
				
		answer[0]=2;
		answer[1]=3;
		answer[2]=4;
		answer[3]=3;
		answer[4]=4;
		answer[5]=3;
		answer[6]=3;
		answer[7]=2;
		answer[8]=4;
		answer[9]=;
		answer[10]=;
		return answer;
		return choices;
		return quiz;
	}
	public static String mathClassQuiz(String []quiz,int[]answer,String [][]choices) {
		quiz[0] = "1.What does math.abs do?";
		quiz[1] = "2.What does math.cbrt do";
		quiz[2] = "3.what does math.rint do?";
		quiz[3] = "4.What does a switch statement test?";
		quiz[4] = "5.What does the following statement print?\n int month=8; \n switch(month) \n {\n case 1: system.out.println(\"January\");\n case 2: system.out.println(\"Febuary\");\n case 3: system.out.println(\"March\");\n case 4: system.out.println(\"April\");\n case 5: system.out.println(\"May\");\n case 6: system.out.println(\"June\");\n case 7: system.out.println(\"July\");\n case 8: system.out.println(\"August\");\n case 9: system.out.println(\"Sepetember\");\n case 10: system.out.println(\"October\");\n case 11: system.out.println(\"November\");\n case 12: system.out.println(\"December\");\n default: break;\n}";
		quiz[5] = "6.When does a switch statement end?";
		quiz[6] = "7.What does a.substring(3,6) do?";
		quiz[7] = "8.What does str.equals(y) do?";
		quiz[8] = "9.what does z.trim do?";
		quiz[9] = "10.What does word.split(\" \") do?";

		choices[0][0]="1.It returns all positives to negatives and positives to negatives";	
		choices[0][1]="2.It returns negatives to positives";
		choices[0][2]="3.It returns positve to negatives";
		//
		choices[0][3]="4.It returns negative to positives and positives to positives";

		//
		choices[1][0]="1.It returns the cube root of a double value";
		choices[1][1]="2.It returns the cube root of a int value";
		choices[1][2]="3.It returns the square root of a double value";
		choices[1][3]="4.It returns the square root of a int value";

		choices[2][0]="1.It cuts of remaining decimals of a value";
		//
		choices[2][1]="2.It rounds remaining decimals of a value";
		choices[2][2]="3.It gives the exponent of a value";
		choices[2][3]="4.It turns a double value into an int value";

		choices[3][0]="1.It test for any boolean expression";
		choices[3][1]="2.It test for inequality";
		choices[3][2]="3.It test for only greater than and less than";
		//
		choices[3][3]="4.It test for equality";

		choices[4][0]="1.January-August";
		//
		choices[4][1]="2.August-December";
		choices[4][2]="3.August";
		choices[4][3]="4.January-December";

		choices[5][0]="1.When it goes through all the code";
		//
		choices[5][1]="2.When it reaches a break statement";
		choices[5][2]="3.It doesn't end";
		choices[5][3]="4.When It reaches an invalid statement";

		choices[6][0]="1.Returns the portion of string a from 3 to 6";
		//
		choices[6][1]="2.Returns the portion of string a from 3 to 5";
		choices[6][2]="3.Returns the portion of string a at point 3 and point 6";
		choices[6][3]="4.Returns the portion of string a at point 3 and point 5";

		choices[7][0]="1.Returns false if the contents of string is exatly the same as the contens of string y";
		choices[7][1]="2.Returns true if the contents of string is almost exatly the same as the contens of string y";
		choices[7][2]="3.Returns true if the contents of string is not exatly the same as the contens of string y";
		//
		choices[7][3]="4.Returns true if the contents of string is exatly the same as the contens of string y";

		//
		choices[8][0]="1.Returns a new string that is the same as z except all whitespace characters(spaces,tabs, and carriage returns) have been removed from beginning to end";
		choices[8][1]="2.Returns a new string that is the same as z except the last half of the string has been removed";
		choices[8][2]="3.Returns a new string that is the same as z except the first half of the string has been removed";
		choices[8][3]="4.Returns a new string that is the same as z except all whitespace characters(spaces,tabs, and carriage returns) have not been removed from beginning to end";

		choices[9][0]="1.Splits a string at every character";
		choices[9][1]="2.Splits a string in half";
		choices[9][2]="3.Splits a string at every space";
		choices[9][3]="4.Splits a string at every white space character";

		answer[0]=4;
		answer[1]=1;
		answer[2]=2;
		answer[3]=4;
		answer[4]=2;
		answer[5]=2;
		answer[6]=2;
		answer[7]=4;
		answer[8]=1;
		answer[9]=3;
		return answer;
		return choices;
		return quiz;
	}
	public static String booleanExpressions(String []quiz,int[]answer,String [][]choices) {
		quiz[0] = "1.What does || operator mean?";
		quiz[1] = "2.What does && operator mean?";
		quiz[2] = "3.What does ! operator do?";
		quiz[3] = "4.What is the correct order of operators?";
		quiz[4] = "5.The \"less than or equal to\" comparison operator in java is_____.";
		quiz[5] = "6.The equal comparison operator in java is_______.";
		quiz[6] = "7.A cast is required in which of the following situations";
		quiz[7] = "8.Suppose x is one. What is x after x+=2";
		quiz[8] = "9.Wgat will be printed when the following code is executed?\ndouble x = 45678.259;\n DecimalFormat formatter=new DecimalFormat(\"#,###,##0.00\");\n System.out.println(formatter.format(x));";
		quiz[9] = "10.Which of the following is the correct expression that evaluates to true if the number x is between 1 and 100 or the number is negative?";

		choices[0][0]="1.It seperates two varibles";	
		choices[0][1]="2.It means Or";
		choices[0][2]="3.It means And";
		choices[0][3]="4.It means parallel";

		choices[1][0]="1.It adds a bowtie";
		choices[1][1]="2.It means not";
		choices[1][2]="3.It means double infinty";
		choices[1][3]="4.It means and";

		choices[2][0]="1.It makes all letters capitals";
		choices[2][1]="2.It makes sure all statements are true";
		choices[2][2]="3.It reverses statements like true and false to their oppisites";
		choices[2][3]="4.It adds exclamiton marks at the end of each string";

		choices[3][0]="1 Brackets, Arithmetic operators, Boolean operators, not, and, or";
		choices[3][1]="2.Brackets, Boolean operators, Arithmetic operators, and, or, not";
		choices[3][2]="3.Brackets, Arithmetic operators, Boolean Operators, and, or, not";
		choices[3][3]="4.And, Or, Not, Brackets, Arithmetic operators, Boolean operators";

		choices[4][0]="1.=<";
		choices[4][1]="2.!=";
		choices[4][2]="3.<=";
		choices[4][3]="4.<";

		choices[5][0]="1==.";
		choices[5][1]="2.<>";
		choices[5][2]="3.^=";
		choices[5][3]="4.!=";

		choices[6][0]="1.Storing an int in a double";
		choices[6][1]="2.Storing a double in a double";
		choices[6][2]="3.Storing a double in an int";
		choices[6][3]="4.All of the above";

		choices[7][0]="1.0";
		choices[7][1]="2.1";
		choices[7][2]="3.2";
		choices[7][3]="4.3";

		choices[8][0]="1.0,045,678.26";
		choices[8][1]="2.45,678.3";
		choices[8][2]="3.45678.259";
		choices[8][3]="4.45,678.26";

		choices[9][0]="1.(1>x>100)||(x<0)";
		choices[9][1]="2.1<x<100 && x<0";
		choices[9][2]="3.((x<100)&&(x>1))||(x<0)";
		choices[9][3]="4.((x<100)&&(x>1))&&(x<0)";

		answer[0]=2;
		answer[1]=4;
		answer[2]=3;
		answer[3]=1;
		answer[4]=3;
		answer[5]=1;
		answer[6]=3;
		answer[7]=4;
		answer[8]=4;
		answer[9]=3;
		return answer;
		return choices;
		return quiz;
	}
}
