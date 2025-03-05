package oops;
class A
{
	int id=101;
	String name="Rohit";
	public void userDetails()
	{
		System.out.println("ID:"+id+ "Name : "+name);
	}
}
class B extends A
{
	String city= "chennai";
	public void stdInfo() {
		System.out.println("ID:"+id+ "Name : "+name+"city :"+city);	
	}
}

public class inh {
     public static void main(String[] args) {
    	 B obj=new B();
    	 
    	 obj.stdInfo();
    	 obj.userDetails();
     }
}
