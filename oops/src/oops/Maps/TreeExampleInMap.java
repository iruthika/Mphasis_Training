package oops.Maps;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Map.Entry;
public class TreeExampleInMap {
	public static void main(String[] args) {
		TreeMap<String, Integer> data =new TreeMap<>();
		data.put("Lenova",3000);
		data.put("Hp",2000);
		data.put("samsung",5000);
		data.put("Apple",7000);
		data.put("Ipad",7500);
		data.put("Lenova",1000);
		
		System.out.println(data);
		//one way to iterate and print
		Iterator<Entry<String, Integer>> itr= data.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String, Integer> dt =itr.next();
			System.out.println("Prod: "+dt.getKey()+" Price: "+dt.getValue());
		}
		System.out.println();
		//another way iteration using enhanced for loop to print;
		System.out.println("another output using for loop:");
		for(String k: data.keySet()) {
			System.out.println(k+" "+data.get(k));
		}
		System.out.println();
		System.out.println("To print only the values: ");
		for(Integer x: data.values()) {
			System.out.println(x);
		}
		System.out.println();
		System.out.println("output using java 8 new features:");
		data.forEach((k,v)->System.out.println(k+" "+v));
		
	}
}
