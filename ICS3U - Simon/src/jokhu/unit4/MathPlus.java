package jokhu.unit4;
/**
 * MathPlus.java
 * 
 *
 */
public class MathPlus {
/**
 * This prints out all the values obtained from the methods that came from the given array.
 * @param args
 */
	public static void main(String[] args) {
		int array[] = {5,10,6,2,3,4,8};
		System.out.println(min(array));
		System.out.println(max(array));
		System.out.println(sum(array));
		System.out.println(average(array));
		double array2[]= {2,3,4,5,6,8,10};
		System.out.println(min(array2));
		System.out.println(max(array2));
		System.out.println(sum(array2));
		System.out.println(average(array2));
		System.out.println(median(array2));
		System.out.println(mode(array2));
		int prime=6;
		System.out.println(prime(prime));
		long factor=5;
		System.out.println(factorial((int) factor));
		
	}
	/**
	 * It finds the Minumum of the number in the given array
	 * @param minArray-Array of Int values
	 * @return- Returns the minimum of all the values in the given array
	 */
	public static int min(int[]minArray) {
		int current=0;
		for(int lessThan=1;lessThan<minArray.length;lessThan++) {
			if (minArray[lessThan]<minArray[current])
				current=lessThan;

		}
		return current;

	}
	/**
	 * It finds the Maximum of the number in the given array
	 * @param maxArray-Array of Int values
	 * @return- Returns the maximum of all the values in the given array 
	 */
	public static int max(int[]maxArray) {
		int current=0;
		for(int moreThan=1;moreThan<maxArray.length;moreThan++) {
			if (maxArray[moreThan]>maxArray[current])
				current=moreThan;
		}
		return current;
	}
	/**
	 * It finds the sum of the number in the given array
	 * @param sumArray-Array of Int values
	 * @return-Returns the sum of all the values in the given array 
	 */
	public static int sum(int[]sumArray) {
		int sum=0;
		for(int next=0;next<sumArray.length;next++) {
			sum+=(sumArray[next]);
		}
		return sum;
	}
	/**
	 * It finds the average of the number in the given array
	 * @param averageArray-Array of Int values
	 * @return - Returns the average of all the values in the given array 
	 */
	public static double average(int[]averageArray) {
		double sum=0;
		for(int next=0;next<averageArray.length;next++) {
			sum+=(averageArray[next]);
		}

		sum=sum/averageArray.length;		
		return sum;
	}


	/**
	 * It finds the Minumum of the number in the given array
	 * @param minArray-Array of double values
	 * @return- Returns the minimum of all the values in the given array
	 */
	public static int min(double[]minArray) {
		int current=0;
		for(int lessThan=1;lessThan<minArray.length;lessThan++) {
			if (minArray[lessThan]<minArray[current])
				current=lessThan;

		}
		return current;

	}
	/**
	 * It finds the Maximum of the number in the given array
	 * @param maxArray-Array of double values
	 * @return- Returns the maximum of all the values in the given array 
	 */
	public static int max(double[]maxArray) {
		int current=0;
		for(int moreThan=1;moreThan<maxArray.length;moreThan++) {
			if (maxArray[moreThan]>maxArray[current])
				current=moreThan;
		}
		return current;
	}
/**
 * It finds the sum of the number in the given array
 * @param sumArray-Array of double values
 * @return-Returns the sum of all the values in the given array 
 */
	public static double sum(double[]sumArray) {
		int sum=0;
		for(int next=0;next<sumArray.length;next++) {
			sum+=(sumArray[next]);
		}
		return sum;
	}
	/**
	 * It finds the average of the number in the given array
	 * @param averageArray-Array of double values
	 * @return - Returns the average of all the values in the given array 
	 */
	public static double average(double[]averageArray) {
		double sum=0;
		for(int next=0;next<averageArray.length;next++) {
			sum+=(averageArray[next]);
		}

		sum=sum/averageArray.length;		
		return sum;
	}
	public static double median(double[]medianArray) {//{5,10,6,2,5,3,4,8}
		double even =0;
		//int chops off
		int divider=medianArray.length/2;
		for(int counter=0;counter<medianArray.length;counter++) {
			if (medianArray.length%2==0) {
			even = (medianArray[divider]+medianArray[divider+1])/2;
			}
			else 
				even=medianArray[medianArray.length/2];
			
					
		}
		return even;
	}
	public static double mode(double[]modeArray) {
		int sameCheck=1;
		double modeCounter=0;
		for (int counter=0;counter<modeArray.length;counter++) {
			if (modeArray[counter]==modeArray[sameCheck]) {
				modeCounter++;
				if (modeCounter==1){
	
				}
			}
			
		}
		return modeCounter;
	}
	public static boolean prime(int primeArray) {
		boolean num = true;
		for(int counter=0;counter<primeArray;counter++) {
		 int mod= 1;
		int div = 2;
		//Checks to see if the number is prime or not
	
		while (mod != 0 && div<primeArray) {

			mod=primeArray%div;
			div++;	
			if (mod!=0) {
				num=false;
			}
		}
		
	}
		return num;
}
	public static long factorial(int factorialArray) {
		long factor=factorialArray;
		for(int counter=1;counter<factorialArray;counter++){
	
			factor*=counter;
		}
		return factor;
	}
	public static 
}
