package abc;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		
		System.out.println("give me number");
		Scanner ui1 = new Scanner(System.in);
		Scanner ui = new Scanner(System.in);
		int size = ui1.nextInt();
		String[] name = new String[size];
		
		
			
//		System.out.println("give me your name");
//		name[0]=ui.nextLine();
//		System.out.println("give me your name");
//		name[1]=ui.nextLine();
//		System.out.println("give me your name");
//		name[2]=ui.nextLine();
		for(int i=0;i<name.length;i++) {
			System.out.println("give me your name");
		name[i]=ui.nextLine();
		}
		
	}

}
