package com.jsp.all_type_query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "program started____ " );
		
		 Alien a1 = new Alien(); 
		 //a1.setAid(102); a1.setAname("raman");
		 //a1.setColour("blue");
		 
        
        Configuration con = new Configuration();
        con.configure();
        con.addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction trans = session.beginTransaction();
        //session.save(a1);
        a1= session.get(Alien.class, 101);
        System.out.println(a1);
        trans.commit();
        System.out.println("program ended_________");
    }
}
