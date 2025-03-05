package oops.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Maps {
	public static void main(String[] args) {
		//Map data =new HashMap();become command as we use linked hash map to print
		//format: data.put(key,value);
		LinkedHashMap data = new LinkedHashMap();//print in the same order how i insert data ,but only the unique one;
		data.put("java","java");
		data.put(99,"Launch");
		data.put(33,33);
		data.put(99,"java");
		data.put(101,"Dharun");
		//duplicates wont get printed;
		System.out.println(data);
		Iterator<Entry> itr= data.entrySet().iterator();
		
		while(itr.hasNext()) {
			Entry et = itr.next();
			System.out.println(et.getKey()+"--> "+et.getValue());
		}
	}
}
