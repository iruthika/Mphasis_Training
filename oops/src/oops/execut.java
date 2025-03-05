package oops;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class RunnableImp implements Runnable{
	public void run() {
		System.out.println("run ");
	}
}
public class execut {
static ExecutorService executor = Executors.newFixedThreadPool(2);
public static void main(String[] args) {
	RunnableImp task=new RunnableImp();
	Thread thread =new Thread(task);
	thread.start();
	executor.submit(task);
	executor.shutdown();
}
}
