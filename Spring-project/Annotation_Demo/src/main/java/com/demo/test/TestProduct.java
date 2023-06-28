package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Product;
import com.demo.beans.Warehouse;

public class TestProduct {

	
	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
//		Warehouse w=new Warehouse(15,"Ware1","Pune","Maharashtra");
//		Product p=new Product(16,"Bike",w);
//		
//		Session sess1=sf.openSession();
//		Transaction tr=sess1.beginTransaction();
//		sess1.save(p);
//		tr.commit();
//		sess1.close();
//		sf.close();
//		
		Session sess2=sf.openSession();
		Transaction tr2=sess2.beginTransaction();
		System.out.println("Before Load");
		Product p1=sess2.load(Product.class, 11);
		System.out.println("After Load ");
		System.out.println(p1.getPid());
		System.out.println(p1.getPname());
		System.out.println("After 1 value");
		System.out.println(p1.getW());
		tr2.commit();
		sess2.close();
		sf.close();
		
		
		
	}
}
