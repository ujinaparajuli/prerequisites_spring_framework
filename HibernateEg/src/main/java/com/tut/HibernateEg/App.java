package com.tut.HibernateEg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();

		
		//Creating student
		
		Student st = new Student();
		st.setSid(101);
		st.setName("Ashish Poudel");
		st.setCity("Kathmandu");
		System.out.println(st);
		Session session = factory.openSession();
		
		session.beginTransaction();
		session.save(st);
		session.getTransaction().commit();
		session.close();
	}
}
