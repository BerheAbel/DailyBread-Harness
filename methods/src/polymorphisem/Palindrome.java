package polymorphisem;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner ui = new Scanner(System.in);
		String a = ui.nextLine();
		char[] b =a.toCharArray();
		String rev = "";
		for(int i=b.length-1;i>=0;i--) {
			rev = rev + b[i];
		}
	System.out.println(rev);
	}

}
