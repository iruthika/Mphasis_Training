package oops.Files;

import java.io.Serializable;

public class CUstomer implements Serializable {
private static final long serialVersionUID=1L;
	private int id;
private String name;
private String city;
private int pincode;
volatile int abcd;

public CUstomer() {
	
}
public CUstomer(int id,String name,String city,int pincode) {
	this.id=id;
	this.name=name;
	this.city=city;
	this.pincode=pincode;
	
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
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}

}
