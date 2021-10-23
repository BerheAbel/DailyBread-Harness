package polymorphisem;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		System.out.println("what is the color");
		Scanner ui = new Scanner(System.in);
		
		String a = ui.nextLine();
				
		if(a.equals("yellow")) {
			System.out.println("slow down");
		}
		if(a.equals("green")) {
			System.out.println("keep going");
		}
		if(a.equals("red")) {
			System.out.println("stop");
		}
		else {System.out.println("warning");}
		
	}

}
