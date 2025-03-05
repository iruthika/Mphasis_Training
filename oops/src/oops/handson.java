package oops;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employ
{
	private int id;
	private String name;
	private int age;
	private String gender;
	private int YOJ;
	private int salary;
    
	public Employ(){
		
	}
	public Employ(int id,String name,int age,String gender,int YOJ,int salary)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.YOJ=YOJ;
		this.salary=salary;

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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getYOJ() {
		return YOJ;
	}
	public void setYOJ(int yOJ) {
		YOJ = yOJ;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "ID: "+id+" Name:"+name+" age:"+age+" Gender:"+gender+" Year of Joining:"+YOJ+" Salary:"+salary;
	}
	
}


//iterate using stream api,and print starts with any char,
//2.who joined after 2020.  using stream api;
//3.in sorted by salary wise or name wise.
//sorted manner and store the data.


public class handson {
	public static void main(String[] args) {
		List<Employ> empList=new ArrayList<Employ>();
		empList.add(new Employ(100,"Dharun",23,"Male",2021,3000));
		empList.add(new Employ(150,"Divya",32,"Female",2018,4500));
		empList.add(new Employ(110,"Dev",34,"Female",2023,5600));
		empList.add(new Employ(170,"Karthi",25,"Female",2017,7500));
		//Before sorting the elements;
		
		   System.out.println("Before sorting");
		   empList.forEach(emp->System.out.println
				   ("ID :"+emp.getId()+" Name:"+emp.getName()+" Age ="+emp.getAge()+" Gender:"+emp.getGender()+
						   " Year of Joining:"+emp.getYOJ()+" Salary:"+emp.getSalary()));
		   
		 // after sorting with characters-D:
		   System.out.println();
		   System.out.println("After sorting");
		   
		   empList.stream().filter(emp->emp.getName().startsWith("D"))
		   .forEach(dt->System.out.println(dt));
		   System.out.println();
		
		//filtering employee joined after 2020 using Stream API;\
		   System.out.println("Employee joined after 2020");
		   empList.stream().filter(emp->emp.getYOJ()>=2020).forEach(emp->System.out.println(emp));
		   System.out.println();
		   
		   System.out.println("Employee Sort by salary");
		   empList.stream().filter(emp->emp.getYOJ()>=2000).sorted(Comparator.comparing(Employ::getSalary)).collect
			(Collectors.toList());
		   
		   empList.forEach(emp->System.out.println(emp));
		   
		//Sort in salary-wise:
		 /*  System.out.println("Employee list sorted salary wise");
		   List<Employ> frmtData= 
					empList.stream().sorted(Comparator.comparing(Employ::getSalary).reversed()).collect
					(Collectors.toList());
		   //
		   
		   empList.parallelStream().sorted(Comparator.comparing(Employ::getId).reversed()).
		   forEach(emp->System.out.println(emp.getId()+" "+emp.getName()+ " "+emp.getAge()+" "+emp.getSalary()));
		*/
		   
		   
	}
}
