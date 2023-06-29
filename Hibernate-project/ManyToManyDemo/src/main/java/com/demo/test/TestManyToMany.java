package com.demo.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;
import com.demo.beans.Project;

public class TestManyToMany {
	
	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction tr=s.beginTransaction();
//		Employee e1=new Employee(1,"Gaurav",null);
//		Employee e2=new Employee(2,"Ashish",null);
//		Employee e3=new Employee(3,"Shashikant",null);
//		Set<Employee>eset1=new HashSet<>();
//		eset1.add(e1);
//		eset1.add(e2);
//		Set<Employee> eset2=new HashSet<>();
//		eset2.add(e2);
//		eset2.add(e3);
//		Project p1=new Project(10,"Java",4,eset1);
//		Project p2=new Project(11,"Python",5,eset2);
//		Project p3=new Project(12,".NET",1,eset1);
//		Set<Project>pset1=new HashSet<>();
//		pset1.add(p1);
//		pset1.add(p3);
//		Set<Project>pset2=new HashSet<>();
//		pset2.add(p3);
//		pset2.add(p2);
//	    e1.setPset(pset1);
//	    e2.setPset(pset2);
//	    e3.setPset(pset2);
//	    
//	    s.save(e1);
//	    s.save(e2);
//	    s.save(e3);
//	    s.save(p1);
//	    s.save(p2);
//	    s.save(p3);
		
		
		
		
		
//		Project p=s.get(Project.class, 10);
//		System.out.println(p);
		
		Employee e=s.load(Employee.class, 1);
		System.out.println(e.getEmpid());
		System.out.println(e);
		System.out.println(e.getPset());
	    tr.commit();
	    s.close();
	    sf.close();
	}

}
