package random;

import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		Scanner ui = new Scanner(System.in);
		String a = ui.nextLine();
		char[] b = a.toCharArray();
		for(int i=0;i<a.length();i++) {
			for (int j=i+1;j<a.length();j++) {
				if(b[i]==b[j]) {
				System.out.println("Duplicate characters are :   "+b[j]);
				
				}
			}
		}

	}

}
