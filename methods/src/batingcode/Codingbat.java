package batingcode;

public class Codingbat {

	public static void main(String[] args) {
		String a = "hello there";
		//char[] b = a.toCharArray();
		//a.substring(0,5);
		//System.out.println(a.substring(0, 5));

//question 3 System.out.println( a.substring( 2, a.length() - 1 ) );
//question 13
	String c = "zemen";
	int d = c.length();
	String e = c.substring(d-2, d);
	System.out.println(e+e+e);	
	
	// question 4 Given a string of even length, return the first half. So the string "WooHoo" yields "Woo"
		String str = "WooHoo";
		System.out.println(str.substring(0, 3));
	}

}
