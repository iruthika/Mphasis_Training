package oops.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Objects;

class customer
{
	private int id;
	private String name;
	private String city;
	private int age;
public customer()
{
	
}
public customer(int id,String name,String city,int age) {
	this.id=id;
	this.name=name;
	this.city=city;
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "customGenericExample [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}

@Override
public int hashCode() {
	return Objects.hash(age, city, id, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	customer other = (customer) obj;
	return age == other.age && Objects.equals(city, other.city) && id == other.id && Objects.equals(name, other.name);
}
}

public class customGenericExample {
	public static void main(String[] args) {
		HashMap<customer, String> data =new HashMap<>();
		 data.put(new customer(101,"Virat","Bangalore",25), "C1");
		 data.put(new customer(110,"Dharun","Chennai",35), "C2");
		 data.put(new customer(130,"Kohli","pune",31), "C3");
		 
		 System.out.println(data);
		 Iterator<Entry<customer, String>> itr =data.entrySet().iterator();
		 while(itr.hasNext()) {
			 Entry<customer, String> et= itr.next();
			 System.out.println(et.getKey()+" "+et.getValue());
		 }
		 
		 } 
}

	
