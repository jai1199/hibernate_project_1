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
        a1.setAid(101);
        a1.setAname("anakonda");
        a1.setColour("green");
        
        Configuration con = new Configuration();
        con.configure();
        con.addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction trans = session.beginTransaction();
        session.save(a1);
        trans.commit();
        System.out.println("program ended_________");
    }
}
