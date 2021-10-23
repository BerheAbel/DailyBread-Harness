package abc;

import java.util.Scanner;

public class Assigenmentfour {

	public static void main(String[] args) {
		//System.out.println("give me number");
		//System.out.println("down to zero");
		//Scanner ui = new Scanner(System.in);
		Scanner ui1 = new Scanner(System.in);
		//int a = ui.nextInt();
		String b = ui1.nextLine();
		
//		System.out.println(1);
//		for(int i=4;i<=a;i=i+4) {
//			System.out.println(i);
//		}
		
//		for(int i=5;i>=0;i--) {
//			System.out.println(i);
//		}
		
		for(int i=0;i<b.length();i++) {
			System.out.println(b.charAt(i));
		}
	}

}
