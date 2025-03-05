package oops;

public class today {
   public static void main(String[] args) {
	   Item item=new item();
	   Producer pr =new Producer(item);
	   Consumer cr = new Consumer(item);
	   Thread t1 =new Thread(pr);
	   Thread t2 =new Thread (cr);
	   
	   t1.start();
	   t2.start();
   }
}
