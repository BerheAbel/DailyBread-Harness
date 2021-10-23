package excelFile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Collections {

	public static  void main(String[] args) {
//		List<String>obj = new ArrayList<String>();
//
//		obj.add("rose");
//		obj.add("sent");
//		obj.add("elsa");
//		System.out.println(obj.get(0));
//		obj.set(0, "keti");
//	
//		System.out.println(obj.get(0));
//		obj.remove(0);
//		System.out.println(obj.get(0));
//		System.out.println(obj.size());
//		for(int i=0;i<obj.size();i++) {
//			System.out.println(obj.get(i));
//		}
//		for(String x:obj) {
//			System.out.println(x);
//		}
//		HashSet<Integer> obj1 = new HashSet<Integer>();
//		obj1.add(10);
//		obj1.add(4);
//		obj1.add(6);
//		obj1.add(10);
//		System.out.println(obj1.contains(10));
//		for(int x:obj1) {
//			System.out.println(x);
//			for(int i=0;i<10;i++) {
//				if(obj1.contains(6)) {
//					System.out.println(i + "was found");}
//					else {
//						System.out.println(i + "not found");}
		
//		to get single value from set collection
//			Object[] b = obj1.toArray();
//			System.out.println(b[0]);
		HashMap<String,String> obj2 = new HashMap<String,String>();
		obj2.put("England", "London");
		obj2.put("France", "Paris");
		obj2.put("Usa", "Dc");
		System.out.println(obj2);
		System.out.println(obj2.get("England"));
			
		
	}

}
