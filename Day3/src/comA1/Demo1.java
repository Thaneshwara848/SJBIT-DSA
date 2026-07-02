package comA1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Demo1 {
	public static void main(String[] args) {
//		HashMap<Integer, String> map= new HashMap<>();// no dup + no order
//		LinkedHashMap map = new LinkedHashMap<>(); // no dup + user order
		TreeMap map = new TreeMap<>(); // soreted order 
		map.put(111, "Ramesh");
		map.put(222, "Rajesh");
		map.put(777, "Pradeep");
		map.put(987, "Praveen");
		map.put(333, "Rakesh");
		map.put(555, "Mahesh");
		map.put(555, "Amit");
		Set s=map.entrySet();
		Iterator i =s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
