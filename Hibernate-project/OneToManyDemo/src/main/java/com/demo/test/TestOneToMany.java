package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Address;
import com.demo.beans.MyUser;

public class TestOneToMany {
	
	public static void main(String[] args) {
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
//		Address a1=new Address(10,"Pimple Gurav","Pune",null);
//		Address a2=new Address(11,"Pimple Saudagar","Pune",null);
//		Address a3=new Address(12,"Pimple Nilakh","Pune",null);
//		Set<Address>aset=new HashSet<>();
//		aset.add(a1);
//		aset.add(a3);
//		Set<Address>aset1=new HashSet<>();
//		aset1.add(a1);
//		aset1.add(a2);
//		MyUser u1=new MyUser(10,"Gaurva",aset);
//		MyUser u2=new MyUser(11,"Ashish",aset1);
//		a1.setMu(u2);
//		a2.setMu(u1);
//		a3.setMu(u1);
//		
//		sess.save(a1);
//		sess.save(a2);
//		sess.save(a3);
//		sess.save(u1);
//		sess.save(u2);
		
		
//		Address a=sess.get(Address.class, 10);
		MyUser u=sess.load(MyUser.class, 10);
		System.out.println(u);
		tr.commit();
		sess.close();
		sf.close();
	}

}
