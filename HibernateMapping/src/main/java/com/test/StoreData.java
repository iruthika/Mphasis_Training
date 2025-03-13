package com.test;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
public static void main(String[] args) {
	// 1.create configuration class object
			Configuration cfg = new Configuration();
			cfg.configure("Hibernate.cfg.xml");
			// 2.create session factory interface
			SessionFactory sf = cfg.buildSessionFactory();
			// 3.create session object
			Session session = sf.openSession();
			// 4.create Transaction object
			Transaction t = session.beginTransaction();
	        //Transient state
			Address adr1=new Address();
			adr1.setCity("chennai");
			adr1.setCountry("India");;
			adr1.setState("Tn");
			Employee emp1=new Employee();
			emp1.setId(1);
			emp1.setE_mail("d@gmail.com");
			emp1.setE_name("dharun");
			emp1.setAddress(adr1);

			adr1.setEmployee(emp1);
			
			
			//5.execute the obj
			session.save(emp1);
			t.commit();
			System.out.println("Done.");
			
			//6.close session object
			session.close();//detach state
		}
}
