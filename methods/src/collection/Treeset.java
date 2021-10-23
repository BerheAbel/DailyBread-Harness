package collection;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		
//		String[] name = new String[5];
//		name[0]= "abel";
//		name[1]= "nana";
//		name[2]= "sena";
//		System.out.println(name[0]);
//		System.out.println(name[1]);
//		System.out.println(name[2]);
		
		Set<String> birthdate = new TreeSet<String>();
		birthdate.add("lala");
		birthdate.add("rich");
		birthdate.add("zem");
		birthdate.add("bella");
		System.out.println(birthdate);
		for(String a:birthdate) {
			System.out.println(a);
		}
	}

}
