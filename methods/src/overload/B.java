package overload;

public class B {
	public static int add(int x) {
		System.out.println(x);
		return x;
	}
	public static int add(int x,int y) {
		System.out.println(x+y);
		return x+y;
	}
	public static double add(double x,double y) {
		System.out.println(x*y);
		return x+y;
	}
	public static String add(String x) {
		System.out.println(x);
		return x;
	}
}
