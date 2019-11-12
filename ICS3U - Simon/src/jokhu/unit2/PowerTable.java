package jokhu.unit2;

public class PowerTable {

	public static void main(String[] args) {
		int base=1;
		int num=1;
//NF
		for (base=1; base<=6; base ++) {
System.out.println();
			for(int exp=1; exp<=5 ;exp++) {
				num= (int) Math.pow(base,exp);
				System.out.print(num+" ");

			}
		}

	}

}
