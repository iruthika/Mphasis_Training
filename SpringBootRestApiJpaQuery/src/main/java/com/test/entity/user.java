package com.test.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="User5")
public class user {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int id;
	private String Fname;
	private String Lname;
	private Date startDate;
	private String mail;
	private int age;
	private int active;
	public user() {
		
	}
	public user(int id, String fname, String lname, Date startDate, String mail, int age, int active) {
		super();
		this.id = id;
		Fname = fname;
		Lname = lname;
		this.startDate = startDate;
		this.mail = mail;
		this.age = age;
		this.active = active;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "user [id=" + id + ", Fname=" + Fname + ", Lname=" + Lname + ", startDate=" + startDate + ", mail="
				+ mail + ", age=" + age + ", active=" + active + "]";
	}
	
}
