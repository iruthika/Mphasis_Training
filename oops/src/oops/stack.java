package oops;
import java.util.Enumeration;
import java.util.Stack;

public class stack {
	public static void main(String[] args) {
		Stack data=new Stack();
		
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
		  System.out.println(data.peek());
		  data.push("keerthi");
		  System.out.println(data);
		  System.out.println(data.pop());
		  System.out.println(data.search(20));
		  System.out.println(data.empty());
		  data.clear();
		  System.out.println(data);
		  
		  Enumeration<E> itr =data.elements();
		  while(itr.hasMoreElements()) {
			  System.out.println(itr.nextElement());
		  }
	}
}
