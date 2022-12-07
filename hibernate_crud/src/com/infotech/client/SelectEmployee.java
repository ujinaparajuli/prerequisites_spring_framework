package com.infotech.client;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.infotech.pojo.Employee;

public class SelectEmployee {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Scanner scan = new Scanner(System.in);
		//Method 1
		System.out.println("Enter employee number:");
		Employee employee = (Employee) session.load(Employee.class, scan.nextInt());
		
		System.out.println("Emp num :" + employee.getEmpno());
		System.out.println("Emp name : "+ employee.getEname());
		System.out.println("Emp salary:"+ employee.getSalary());
	}
}
