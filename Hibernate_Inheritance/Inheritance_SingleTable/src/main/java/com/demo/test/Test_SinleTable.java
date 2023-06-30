package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Pants;
import com.demo.beans.Shirts;

public class Test_SinleTable {

	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.getCurrentSession();
		Transaction tr=sess.beginTransaction();
		Shirts s=new Shirts(1,1000.00,"Peter","Yellow");
		Pants p=new Pants(2,2000.0,"Denim","Blue");
		sess.save(p);
		sess.save(s);
		tr.commit();
		sess.close();
		sf.close();
		
	}
}
