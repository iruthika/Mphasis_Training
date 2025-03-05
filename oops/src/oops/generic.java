package oops;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class generic {
	public static void main(String[] args) {
		ArrayList<String> listNames=new ArrayList<>();
		 listNames.add("java");
		 listNames.add("program");
		 listNames.add("spring");
		 listNames.add("Boot");
		 listNames.add("camp");
		 listNames.add("Microsoft");
		 listNames.add("Boot");
		 
		 Iterator<String> itr=listNames.iterator();
		 while(itr.hasNext()) {
				System.out.println(itr.next());
			  }
		 ListIterator<String> ltr= listNames.listIterator();
		 while(ltr.hasNext()) {
				 System.out.println(ltr.next());
			  }
		 while(ltr.hasPrevious()) {
			 System.out.println(ltr.previous());
		  }	  
		 for(String dt:listNames)
		 {
			 System.out.println(dt);
		 }
		 Collections.sort(listNames);
		 Collections.sort(listNames.reversed());
	}
	
}
