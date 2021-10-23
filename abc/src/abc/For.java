package abc;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		//System.out.println("give me your name");
		Scanner ui = new Scanner(System.in);
		Scanner ui2 = new Scanner(System.in);
		int size = ui2.nextInt();
		String[] name = new String[size];
		for(int i=1;i<size;i=i++) {
			System.out.println("give a name");
			name[1] = ui.nextLine();
		}
		
	}

}
