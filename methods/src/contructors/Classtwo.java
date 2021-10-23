package contructors;

public class Classtwo {

	 Classtwo() {
		this(10);
		System.out.println("welcome to techfios");}
	
	Classtwo(int a){
		this(100,"lala");
		System.out.println(a);}
	
	Classtwo(int a, String b){
		this(20,"mama",'8');
		System.out.println(a+b);
	}
	
	Classtwo(int a,String b,char c){
		System.out.println(a+b+c);
	}
	
	
}
