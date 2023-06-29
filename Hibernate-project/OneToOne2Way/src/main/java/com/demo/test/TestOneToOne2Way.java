package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.Student;

public class TestOneToOne2Way {
	
	public static void main(String[] args) {
	  
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
//		Address a1=new Address(10,"Pimple Gurav","Pune");
//		Address a2=new Address(12,"Pimple Ssaudagar","Pune");
//		Student s1=new Student(10,"Gaurav",a1);
//		Student s2=new Student(15,"Shashikant",a2);
//		a1.setS(s2);
//		a2.setS(s1);                                                                                                                  
//		sess.save(a1);
//		sess.save(a2);
//		sess.save(s1);
//		sess.save(s2);
//		tr.commit();
//		sess.close();
//		sf.close();
		
//		Student s=sess.load(Student.class, 10);
//		System.out.println(s.getSid());
//		System.out.println(s.getSname());
		Address a=sess.get(Address.class, 10);
		System.out.println(a.getAddrid());
		System.out.println(a.getStreet());
		System.out.println(a.getS());
		tr.commit();
		sess.close();
		sf.close();
	}

}
