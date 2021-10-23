package polymorphisem;

public class Sum {

	public static void main(String[] args) {
		System.out.println("good evening");
		System.out.println(sum(20,30));
		
		lala();
		Sum ll = new Sum();
		ll.abel();
	}

	public static String sum(int x, int y) {	
		System.out.println(x+y);
		return "hello";
	}
		
	public void abel() {
		System.out.println("hi bella");
	}
	public static int lala() {
		System.out.println("hi lala");
		return 10;
	}
	
}
