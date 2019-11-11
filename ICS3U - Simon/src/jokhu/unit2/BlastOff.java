package jokhu.unit2;
/**
 * BlastOff.java
 * Counts Down from 10 to 1 with a 1 second delay then prints blast off
 * November 11 2019
 * @author Simon Jokhu
 */
public class BlastOff {
	/**
	 * Beginning of BlastOff program
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		//Counts Down from 10 
		for (int countDown=10; countDown>0; countDown--) {
			System.out.println(countDown);

			//Adds a 1 second delay
			Thread.sleep(1000);

		}

		//Prints Blast off
		System.out.println("BLAST OFFFFFFFF!!!!!!!!!");
	}

}
