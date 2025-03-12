package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
	public static void main(String[] args) {
		// 1.create configuration class object
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		// 2.create session factory interface
		SessionFactory sf = cfg.buildSessionFactory();
		// 3.create session object
		Session session = sf.openSession();
		// 4.create Transaction object
		Transaction t = session.beginTransaction();
        //Transient state
		Book b=new Book();
		b.setId(1);
		b.setB_name("Spring");
		b.setB_author("Dharun");
		b.setB_price(120);
		
		//5.execute the obj
		session.save(b);
		t.commit();
		System.out.println("Done.");
		
		//6.close session object
		session.close();//detach state
	}
}
