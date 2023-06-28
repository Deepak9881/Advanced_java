package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
//		Session sess1=sf.openSession();
//		Transaction tr=sess1.beginTransaction();
//		Address a=new Address(1,"pune","Maharashtra");
//        Student s=new Student(1,"Deepak",a);
//        sess1.save(a);
//        sess1.save(s);
//        tr.commit();
//        sess1.close();
//        sf.close();
		
		Session sess2=sf.openSession();
		Transaction tr=sess2.beginTransaction();
//		Student s=sess2.get(Student.class, 2);
		System.out.println("Before load");
//		Student s=sess2.load(Student.class, 2);
		Address a=sess2.load(Address.class, 1);
		System.out.println("After Load");
//		System.out.println(a.getSid());
//		System.out.println(a.getAddr());
        System.out.println(a);

	}

}
