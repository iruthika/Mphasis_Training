package oops;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class arylst {
  public static void main(String[] args) {
	  ArrayList data= new ArrayList();
	  data.add(10);
	  data.add("java");
	  data.add(20);
	  data.add("java");
	  data.add(10);
	  data.add(33.44f);
	  data.add(10);
	  data.add('A');
	  data.add(10);
	  data.add(false);
	  System.out.println(data);
	  System.out.println(data.size());
	  data.set(3,"five");
	  data.remove(4);
	  System.out.println(data);
	  System.out.println(data.size());
	  System.out.println(data.get(7));
	  System.out.println(data.contains(40));
	  System.out.println(data.getFirst());
	  //Iterator itr =data.iterator();
	  ListIterator<E> ltr= data.listIterator();
	  //for the below code iterator is enough;list not needed ;
	  while(ltr.hasNext()) {
		//moves and iterate through the entire array;
		  System.out.println(ltr.next());
	  }
	  
	  System.out.println("AAAAAAAAA");
	  //to iterate previous we should use list iterator;
	  
	  while(ltr.hasPrevious())
	  {
		  System.out.println(ltr.previous());
	  }
	
  
  }
}
