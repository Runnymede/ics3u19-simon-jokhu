package jokhu.unit1;
/** 
 * AboutMe.java
 * Displays: Name,Instructors name, School and Encourage phrase for school team
 * Sept, 18. 2019
 * @author Simon Jokhu
 */
public class AboutMe {
	/**
	 * Beginning
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Simon Jokhu");
		System.out.println("Mrs.Kemp");
		System.out.println("Runnymede C.I.");
		System.out.println("\"Go Ravens Go\"");

		System.out.println(" ");

		System.out.printf("%-10s %8s %8s", "Period", "Day 1", "Day 2\n");
		System.out.printf("%-10s %8s %14s", "1", "PAF3/4OM-01", "PAF3/4OM-01\n");
		System.out.printf("%-10s %12s %14s", "08:45", "Kotsopoulo,J", "Kotsopoulo,J\n");
		System.out.printf("%-10s %4s %15s","10:02", "W.R.", "W.R.\n");

		System.out.println(" ");

		System.out.printf("%-10s %8s %14s", "2", "PLF4M1-01", "PLF4M1-01\n");
		System.out.printf("%-10s %12s %14s", "10:07", "Kotsopoulo,J", "Kotsopoulo,J\n");
		System.out.printf("%-10s %3s %14s", "11:24", "216", "216\n");

		System.out.println(" ");

		System.out.printf("%-5s", "Lunch\n");
		System.out.printf("%-4s", "11:24\n");
		System.out.printf("%-4s", "12:26\n");

		System.out.println(" ");

		System.out.printf("%-10s %8s %8s", "3", "ICS3U3-02", "ICS3U3-02\n");
		System.out.printf("%-10s %6s %10s", "12:26", "Kemp,C", "Kemp,C\n");
		System.out.printf("%-10s %3s %10s", "13:43", "024", "024\n\n");
	
		
		System.out.printf("%-10s %8s %8s", "4", "ENG3U1-03","ENG3U1-03\n");
		System.out.printf("%-10s %8s %8s", "13:48", "Lovell,C", "Lovell,C\n");
		System.out.printf("%-10s %3s %10s", "15:05", "214", "214\n\n");
		
		System.out.printf("%-10s", "5");
		System.out.println(" ");
		System.out.printf("%-4s", "15:05\n");
		System.out.println("16:22");
	}

}
