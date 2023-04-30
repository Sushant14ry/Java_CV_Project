package com.hiber.Project_WEB_Maven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

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
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Project Started" );
        
//        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory factory = cfg.buildSessionFactory();
        
        System.out.println(factory);
        System.out.println(factory.isClosed());
        
//        Creating Students
        Student st = new Student();
        st.setId(105);
        st.setName("Kshitize Chaudhray");
        st.setCity("Kathmandu");        
        System.out.println(st);
        
//        Creating Object of Address Class
        Address ad = new Address();
        ad.setStreet("Kolvi");
        ad.setCity("Bara");
        ad.setOpen(true);
        ad.setAdd_date(new Date());
        ad.setX(120);

//        Reading Images
        FileInputStream fis = new FileInputStream("src/main/java/com/hiber/Project_WEB_Maven/sushant.jpg");
        byte[] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(st);
        session.save(ad);
        
        tx.commit();
        session.close();
        
        System.out.println("Done.....");
    }
}
