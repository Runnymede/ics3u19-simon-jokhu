package jokhu.unit2;

public class HappyAndYouKnowIt {

	public static void main(String[] args) {
		String happy=("If yout happy and you know it");
		String showIt=("If your happy and you know it and you really want to show it if your happy and you know it");
		String  [] actions= {" clap your hands"," stomp your feet"," do a dab"," jump a jack"," say hello"," give high five"," touch your nose"," raise the roof"," close your eyes"," take a deep breath"};
//prints different verses including the main 
		for (int counter=0;counter<10;counter++) {
		System.out.println(happy+actions[counter]);
		System.out.println(happy+actions[counter]);
		System.out.println(showIt+actions[counter]);
		System.out.println();
		}
	}

}
