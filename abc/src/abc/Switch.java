package abc;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("what is your age?");
		Scanner ui = new Scanner(System.in);
		int a = ui.nextInt();
		
		switch(a) {
		case 8:System.out.println("young");
		break;
		case 10:System.out.println("kid");
		break;
		case 5:System.out.println("big");
		break;
		default:System.out.println("old");
		};

	}

}
