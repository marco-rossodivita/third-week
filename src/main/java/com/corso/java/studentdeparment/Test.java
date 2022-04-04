package com.corso.java.studentdeparment;

import com.corso.java.hibernate.Event;
import com.corso.java.hibernate.EventTest;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Date;
import java.util.List;

public class Test {
    private SessionFactory sessionFactory;

    public static void main(String[] arg) throws Exception {
        Test test = new Test();
        test.setUp();
        test.testBasicUsage();
        test.shutDown();
    }

    protected void setUp() throws Exception {
        sessionFactory = new Configuration()
                .configure() // configura la SessionFactory utilizzando l' hibernate.cfg.xml
                .buildSessionFactory();
    }

    protected void shutDown() throws Exception {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

    public void testBasicUsage() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        List result = session.createQuery("from com.corso.java.studentdeparment.Department").list();
        for (Department department : (List<Department>) result) {
            System.out.println("Department (" + department.getName());
        }
        session.getTransaction().commit();
        session.close();

        session = sessionFactory.openSession();
        session.beginTransaction();
        List result2 = session.createQuery("from com.corso.java.studentdeparment.Student").list();
        for (Student student : (List<Student>) result2) {
            System.out.println("Student (" + student.getName() + ") : " + student.getLastName() + "  " + student.getCodDepartment());
        }
        session.getTransaction().commit();
        session.close();
    }
}
