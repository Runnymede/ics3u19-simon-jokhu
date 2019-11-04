package jokhu.unit2;
/**
 * Investments.java
 * Checks to see how many years it will take to make $5000 from 2500 with an interest of 7.5%.
 * October 31 2019
 * @author Simon Jokhu
 *
 */
public class Investments {
//COMMENTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT!!!!!!!!!!!!!!!!!!!!!!!!
	public static void main(String[] args) {
		double investmentNow = 2500;
		int year=0;
		do {
			investmentNow = investmentNow*0.075 + investmentNow;

			year = year +1;


		}while (investmentNow <=5000);
		System.out.println("It will take "+year+" year to make $5000.");
	}

}
