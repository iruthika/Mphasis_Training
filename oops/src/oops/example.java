package oops;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private int salary;
	public Employee()
	{
		
	}
	public Employee(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getId()
	{
		return id;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [id="+id+",name="+name+",salary="+salary+"]";
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
		//for reverse order:- return o.id-this.id;
	}
	public int setSalary() {
		// TODO Auto-generated method stub
		return salary;
	}
	
	
}
class NameComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
		}
}
public class example {
	
public static void main(String[] args) {
	List<Employee> empList=new ArrayList<Employee>();
	empList.add(new Employee(40,"Dharun",3000));
	empList.add(new Employee(50,"Divya",4500));
	empList.add(new Employee(60,"Dev",5600));
	empList.add(new Employee(50,"Karthi",7500));
    Iterator<Employee> itr=empList.iterator();
    while(itr.hasNext()) 
    {
    	Employee emp=itr.next();
		System.out.println("ID :"+emp.getId()+" Name: "+emp.getName()+" Salary ="+emp.setSalary());
		}  
    Collections.sort(empList);
    System.out.println("After sorting");
    for(Employee emp: empList) {
    	System.out.println("ID :"+emp.getId()+" Name: "+emp.getName()+" Salary ="+emp.setSalary());
		}
    Collections.sort(empList, new NameComparator());
    System.out.println("Based on name");
    for(Employee emp: empList) {
    	System.out.println("ID :"+emp.getId()+" Name: "+emp.getName()+" Salary ="+emp.setSalary());
		}
}
}
