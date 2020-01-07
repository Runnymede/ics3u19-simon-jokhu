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
		double array2[]= {5,10,6,2,3,4,8};
		System.out.println(min(array2));
		System.out.println(max(array2));
		System.out.println(sum(array2));
		System.out.println(average(array2));
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
}
