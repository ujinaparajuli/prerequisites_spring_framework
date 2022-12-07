package com.infotech.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.infotech.pojo.Employee;

public class InsertEmployee {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx;
		String choice = "no";
		Scanner scan = new Scanner(System.in);
		
		do {
			tx = session.beginTransaction();
			Employee employee = new Employee();
			System.out.println("Enter employee number:");
			employee.setEmpno(scan.nextInt());
			System.out.println("Enter employee name:");
			employee.setEname(scan.next());
			System.out.println("Enter employee annual salary:");
			employee.setSalary(scan.nextInt());
			session.save(employee);
			session.flush();
			tx.commit();
			System.out.println("One record inserted successfully.");
			System.out.println("Do you want insert new employee record ? Y/N");
			choice = scan.next();
		} while (choice.equalsIgnoreCase("Y") | choice.equalsIgnoreCase("Yes"));
		
		session.close();
	}
}
