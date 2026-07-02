package comA;
import java.util.*;
public class Demo1 {
	public static void main(String[] args) {
		//LIST		
		// bad for insrt/deleet+ best for search 
		//ArrayList al = new ArrayList<>();
		// bad for search + best for search insrt/deleet
		LinkedList al = new LinkedList<>();
//		HashSet al = new HashSet<>(); // no dup  + no order 
//		LinkedHashSet al = new LinkedHashSet<>();
		//TreeSet al = new TreeSet<>();
		al.add(100);
		al.add(300);
		al.add(200);
		al.add(500);
		al.add(876);
		al.add(200);
		al.add(500);
		al.add(876);
		Iterator i =al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		Collections.sort(al);
		System.out.println(al);
		Collections.reverse(al);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
	}
}
		// sort - BS, MS , QS , SS, IS ...!

		//100 , 22,22, 44 ,44 55 ,99,88 
				