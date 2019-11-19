package jokhu.unit2;
/**
 * LicenseToDrive.java
 * Counts the amount of times that the sum of digits reach 34 or over
 * November 19 2019
 * @author Simon Jokhu
 */
public class LicenseToDrive {
	/**
	 * Beginning of LicenseToDrive program
	 * @param args
	 * 
	 */
	public static void main(String[] args) {

//Starts at the highest digit sum
		int integer=9999;


		int digits;



		int counterTwo=0;
//Counts Down from 9999 then how ever many times a number has a digit sum of 34 or over it adds one to counter.
		for (int digitSum=0;digitSum>=0;integer--) {
			digitSum=0;
			int counter = 0;
			int div = 1000;
			int mod = 10000;
			do {
				counter += 1;
				digits = integer%mod/div;
				div = div/10;
				mod = mod/10;
				digitSum=digitSum+digits;

			}while (counter <4);
			if (digitSum>=34)
				counterTwo++;

//Prints the counterTwo which is the number of times a digit sum of 15 has been reached.
		}
		System.out.println(counterTwo);
	}



}


