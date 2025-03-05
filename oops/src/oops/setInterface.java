package oops;

import java.util.Iterator;
import java.util.TreeSet;

public class setInterface {
	public static void main(String[] args) {
		//Collection data=new HashSet();
		//Set data = new HashSet();
		//hashset int,string collection is allowed.
		//treeset int not allowed;
		
		TreeSet<String> data=new TreeSet<>();
		data.add("Java");
		data.add("keerthi");
		data.add("Java");
		data.add("false");
		
		System.out.println(data);
		//reverse order;
		System.out.println(data.reversed());
		Iterator<String> itr=data.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		data.forEach(x->System.out.println(x));
		System.out.println(data.subSet("Java","false"));
		System.out.println(data.getFirst());
	}
}
