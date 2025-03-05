package oops.Maps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee{
	private int id;
	private String name;
	private int age;
	private String gender;
	private String dept;
	private int YOJ;
	double salary;
	//constructor;
	public Employee() {
		
	}
	public Employee(int id,String name,int age,String gender,String dept,int YOJ,double salary)
	{
		this.id=id;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.dept=dept;
		this.YOJ=YOJ;
		this.salary=salary;

	}
	//getter setter;
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getYOJ() {
		return YOJ;
	}
	public void setYOJ(int yOJ) {
		YOJ = yOJ;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + dept
				+ ", YOJ=" + YOJ + ", salary=" + salary + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
public class emp {
	//count male and female ;
	public static void getCountByGender(List<Employee> employeeList) 
	{
		Map <String, Long> result=employeeList.stream().
				collect(Collectors.groupingBy(Employee ::getGender
						,Collectors.counting()));
		System.out.println(result);
	}
	// program to print the name of all dept in the company;
	public static void getDeptName(List<Employee>employeeList) 
	{
		employeeList.stream().map(Employee :: getDept).distinct().forEach(System.out::println);
	}
	//avg age of male and female;
	public static void getAgeAvg(List<Employee>employeeList) 
	{
		Map<String,Double> avgdata=employeeList.stream().collect(Collectors.groupingBy(Employee :: getGender,Collectors.averagingInt(Employee::getAge)));
		System.out.println(avgdata);
	}
	//get name of employers who joined after 2019;
	public static void getEmployee(List<Employee>employeeList) 
	{
		employeeList.stream().filter(emp->emp.getYOJ()>2019).map(Employee::getName).forEach(System.out::println);
	}
	//count no of employees from each department;
	public static void getDeptEmployee(List<Employee>employeeList)
	{
		Map <String, Long> Deptresult=employeeList.stream().
				collect(Collectors.groupingBy(Employee ::getDept
						,Collectors.counting()));
		System.out.println(Deptresult);//print output in curly{};
	}
	//find avg salary of each department;
	public static void getDeptAvgSalary(List<Employee>employeeList)
	{
		Map<String, Double> avgSalary=employeeList.stream().
				collect(Collectors.groupingBy(Employee :: getDept,
						Collectors.averagingDouble(Employee::getSalary)));
		avgSalary.forEach((k,v)->System.out.println(k+" "+v));//prints output like list;
	}
	//find the oldest employee;
	public static void getEldest(List<Employee>employeeList)
	{
		Optional<Employee> elderEmp=employeeList.stream().max(Comparator.comparing(Employee :: getAge));
		Employee empData=elderEmp.get();//moving data from optional class to employee class;
		System.out.println("name: "+empData.getName());
		System.out.println("Age: "+empData.getAge());
		System.out.println("Dept: "+empData.getDept());
		
	}
	//find out average and total salary of the company;
	public static void getAvgNtotalSalary(List<Employee>employeeList)
	{
		DoubleSummaryStatistics cmpySalary =employeeList.stream().collect
				(Collectors.summarizingDouble(Employee :: getSalary));
		System.out.println("Avg salary: "+cmpySalary.getAverage());
		System.out.println("Total salary: "+cmpySalary.getSum());
	}
	//Print name department wise;
	public static void getEmpFromDept(List<Employee>employeeList)
	{
		Map<String,List<Employee>>EmpListDeptWise=employeeList.stream().
				collect(Collectors.groupingBy(Employee::getDept));
		for(String k : EmpListDeptWise.keySet()) {
			System.out.println("Departments:"+k);
			List<Employee> emp =EmpListDeptWise.get(k);
			for(Employee dt:emp) {
				System.out.println(dt);
			}
		}
	}
	//Find out highest experience employee in the company;
	public static void getExperienced(List<Employee>employeeList)
	{
		Optional<Employee> SeniorEmp=employeeList.stream().sorted(Comparator.comparing(Employee::getYOJ)).findFirst();
		Employee empData=SeniorEmp.get();//moving data from optional class to employee class;
		System.out.println("ID: "+empData.getId());
		System.out.println("name: "+empData.getName());
		System.out.println("Dept: "+empData.getDept());
	}
	
	public static void main(String[] args) {
		
		List<Employee> employeeList=new ArrayList<Employee>();
		
		employeeList.add(new Employee(101,"Jhon",21,"Female","CSE",2019,34500.0));
		employeeList.add(new Employee(121,"Virat",27,"Male","IT",2020,25500.0));
		employeeList.add(new Employee(141,"Kohli",31,"Male","CSBS",2021,12500.0));
		employeeList.add(new Employee(139,"Anu",29,"Female","ECE",2029,14500.0));
		employeeList.add(new Employee(251,"Vishnu",11,"Male","EEE",2011,18900.0));
		employeeList.add(new Employee(341,"Abi",41,"Female","CSE",2017,17500.0));
		employeeList.add(new Employee(546,"Amir",34,"Male","IT",2020,20000.0));
		employeeList.add(new Employee(211,"Bharath",37,"Male","MECH",2025,9500.0));
		employeeList.add(new Employee(341,"devi",52,"Female","AIDS",2017,8500.0));
		employeeList.add(new Employee(546,"karthik",36,"Male","IT",2012,9000.0));
		employeeList.add(new Employee(211,"Britto",41,"Male","MEDICAL",2009,8900.0));
		
		emp.getCountByGender(employeeList);
		System.out.println();
		emp.getDeptName(employeeList);
		System.out.println();
		emp.getAgeAvg(employeeList);
		System.out.println();
		emp.getEmployee(employeeList);
		System.out.println();
		emp.getDeptEmployee(employeeList);
		System.out.println();
		emp.getDeptAvgSalary(employeeList);
		System.out.println();
		emp.getEldest(employeeList);
		System.out.println();
		emp.getAvgNtotalSalary(employeeList);
		System.out.println();
		emp.getEmpFromDept(employeeList);
		System.out.println();
		emp.getExperienced(employeeList);
		
	}
}
