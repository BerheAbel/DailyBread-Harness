package abc;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		
		Scanner ui = new Scanner(System.in);
		Scanner ui2 = new Scanner(System.in);
		int size = ui2.nextInt();
		String[] name = new String[size];
//		System.out.println("What is your name?");
//		name[0]= ui.next();
//		System.out.println("What is your name?");
//		name[1]=ui.next();
//		System.out.println("What is your name?");
//		name[2]=ui.next();
//		System.out.println("What is your name?");
//		name[3]=ui.next();
		
		for(int i=0;i<size;i++) {
			System.out.println("What is your name?");
			name[i]=ui.next();
		}
		
		

	}

}
