package jokhu.unit2;
/**
 * PowerTable.java  
 * Gets the exponents for 
 * November 19,2019
 * @author Simon Jokhu
 */
public class PowerTable {

	public static void main(String[] args) {
		int base=1;
		int num=1;
//Gives exponent tables from 1 to 6
		
		System.out.printf("%-9s %-9s %-9s %-9s %-10s" ,"X^1","X^2","X^3","X^4","X^5");
		for (base=1; base<=6; base ++) {
System.out.println();
			for(int exp=1; exp<=5 ;exp++) {
				num= (int) Math.pow(base,exp);
				System.out.printf("%-10s",num);

			}
		}

	}

}
