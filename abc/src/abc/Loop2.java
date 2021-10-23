package abc;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner ui = new Scanner(System.in);
	Scanner ui1 = new Scanner(System.in);
//	Scanner ui2 = new Scanner(System.in);
	int size = ui1.nextInt();
	String[] myArray = new String[2];
	
//	System.out.println("give me name");
//	myArray[0]=ui.next();
//	System.out.println("give me name");
//	myArray[1]=ui1.nextLine();
//	System.out.println("give me name");
//	myArray[2]=ui2.nextLine();
//	
	for(int i=0;i<size;i++) {
		System.out.println("give me name");
		myArray[i]=ui.nextLine();
	}
	
	
	}

}
