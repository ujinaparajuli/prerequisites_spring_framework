package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Alien telusko = new Alien();
        telusko.setAid(101);
        telusko.setAname("Ashish");
        telusko.setAcolor("Red");
        
        Configuration con = new Configuration();
        SessionFactory factory = con.buildSessionFactory();
        Session session = factory.openSession();
        session.save(telusko);
        
        
    }
}
