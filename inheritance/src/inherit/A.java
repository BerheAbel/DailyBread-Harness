package inherit;

public class A extends B{
	int car = 100;

	public static void main(String[] args) {
		
		A obja = new A();
//		obja.B1();
//		B2();
		
		obja.love();
		
	}
//	public void B1() {
//		System.out.println(50);
//	}
//
//	public static void B2() {
//		System.out.println(30);
//		}
	public void love() {
		System.out.println(super.car);
	}
	
	
}
