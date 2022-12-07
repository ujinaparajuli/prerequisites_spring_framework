package com.infotech.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.infotech.pojo.Employee;

public class UpdateEmployee {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter empno to update:");
		Employee employee = (Employee) session.get(Employee.class, scan.nextInt());
		if (employee != null) {

			System.out.println("Enter new salary to update:");

			employee.setSalary(scan.nextInt());
			session.update(employee);
			session.flush();
			tx.commit();
			System.out.println("updated");
		} else {
			System.out.println("Enter correct num.");
		}
		session.close();
		sessionFactory.close();
	}
}
