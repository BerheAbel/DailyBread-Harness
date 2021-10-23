package polymorphisem;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		System.out.println("put any number");
		Scanner ui = new Scanner(System.in);
		Double A = ui.nextDouble();
		System.out.println("put another number");
		Double A1 = ui.nextDouble();		
	
		System.out.println("+ for addition");
		System.out.println("- for substraction");
		System.out.println("* for multiplication");
		System.out.println("/ for division");
		Scanner ui1 = new Scanner(System.in);
		String cal = ui1.nextLine();
	
		switch(cal) {
		case "+": System.out.println(A+A1);
		break;
		case "-": Sub.minus(A, A1);		
		break;
		case "*": Multi objm = new Multi();
                    objm.multi(A, A1);
		break;
		case "/": Div objd = new Div();
                	objd.div(A, A1);
		}
		
				
		
	}

}
