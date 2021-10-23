package polymorphisem;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		Scanner ui = new Scanner(System.in);		
		int number = ui.nextInt();
		int result = number%2;
		if(result==0) {System.out.println(number+" "+"is even number.");}
		else {System.out.println(number+" "+"is odd number.");}
	}

}
