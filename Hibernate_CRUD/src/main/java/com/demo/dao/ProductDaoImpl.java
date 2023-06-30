package com.demo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.beans.Product;
import com.demo.beans.Warehouse;

public class ProductDaoImpl implements ProductDao{
	private static SessionFactory sf;
 
	static {
		sf=HibernateUtil.getMySessionFactory();
	}
	
	public void addProduct(Product p, Warehouse w) {
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		sess.save(w);
		sess.save(p);
		tr.commit();
		sess.close();
	}

	@Override
	public List<Product> getAllProducts() {
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
	    Query q=sess.createQuery("from Product");
	    List<Product>plist=q.list();
		tr.commit();
		sess.close();
		return plist;
		
	}

	@Override
	public boolean removeById(int id) {
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		Product p=sess.get(Product.class, id);
		if(p!=null) {
		sess.delete(p);

        
		return true;
		}
		tr.commit();
		sess.close();
	
		return false;
	}

	@Override
	public Product displayById(int id) {
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		Product p=sess.get(Product.class, id);
		if(p!=null) {
			tr.commit();
			sess.close();
			return p;
			}
		tr.commit();
		sess.close();
		return null;
	}

	@Override
	public List<Product> sortByPname() {
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		Query q=sess.createQuery("from Product p order by p.pname");
		List<Product>plist=q.list();
		if(plist!=null) {
			tr.commit();
			sess.close();
			return plist;
		}
		tr.commit();
		sess.close();
		return null;
	}

	@Override
	public boolean upadteById(int id, String pname, String wcity) {
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
	    Product p=sess.get(Product.class, id);
	    if(p!=null) {
	    	p.setPname(pname);
	    	p.getW().setWcity(wcity);
	    	sess.save(p);
	    	tr.commit();
	    	sess.close();
	    	return true;
	    }
		tr.commit();
		sess.close();
		return false;
	}

}
