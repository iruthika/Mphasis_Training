package oops;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student implements Comparable<Student>
{
	private int id;
	private String name;
	private int age;
	public Student(){
		
	}
	public Student(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Studnet [id="+id+",name="+name+",age="+age+"]";
	}
/*	
	@Override
	public int compareTo(Student o) {
		return this.id-o.id;
	}
	*/
}
public class lambdaeg {
	public static void main(String[] args) {
		
	List<Student> stdList =new ArrayList<>();
	
	stdList.add(new Student(5,"Father",55));
	stdList.add(new Student(6,"Mother",48));
	stdList.add(new Student(8,"Grandmother",75));
	stdList.add(new Student(7,"brother",25));
	stdList.add(new Student(4,"Sister",15));
	// java 8 new features-stream API
	   System.out.println("Before sorting");
	   stdList.forEach(emp->System.out.println
			   ("ID :"+emp.getId()+
			" Name: "+emp.getName()+" age ="
					+emp.getAge()));
	List<Student> frmtData= 
			stdList.stream().sorted(Comparator.comparing(Student::getName).reversed().thenComparing(Student::getId)).collect
			(Collectors.toList());
	//command to reversely sort based on id:- stdList.stream().sorted(Comparator.comparing(Student::getId).reverse).collect(Collectors.toList());
    //command to compare based on two parameters:- stdList.stream().sorted(Comparator.comparing(Student::getId)).collect(Collectors.toList());
	
	System.out.println("After sorting");
			   stdList.forEach(emp->System.out.println
					   ("ID :"+emp.getId()+
								" Name: "+emp.getName()+" age ="
										+emp.getAge()));
	/*
	Student stud= new Student()
	std.getId();
		*/	
			   
  
			   }
	}
}
