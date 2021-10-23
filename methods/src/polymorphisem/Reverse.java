package polymorphisem;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ui = new Scanner(System.in);
		String abel = ui.nextLine();
		char[] richArray = abel.toCharArray();
		String reveres = "";
		for(int i=richArray.length-1;i>=0;i--) {
			//System.out.println(richArray[i]);
			reveres = reveres + richArray[i];
		}
		System.out.println(reveres);

	}

}
