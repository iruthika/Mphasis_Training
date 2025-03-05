package oops;
class c
{
	public void method1() {
		System.out.println("Top most parent");
	}
}
class D extends c
{
	public void method2() {
		System.out.println("Inter mediate class");
	}
}
class E extends D
{
	public void method3() {
		System.out.println("Bottom child class");
	}
}
public class multilevel {
public static void main(String[] args) {
	E obj=new E();
	
	obj.method3();
	obj.method2();
	obj.method1();
	
}
}
