package com.demo.test;


import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.dao.HibernateUtil;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;



public class TestProduct_Crud {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ProductService ps=new ProductServiceImpl();
	int choice=0;
	do {
	System.out.println("1. Add new product\n 2. Delete by id\n 3. Display all\n");
	System.out.println("4. display by Id\n 5. sort by Product name\n6. update by id\n7. exit\nchoice: ");
	choice=sc.nextInt();
	switch(choice){
	case 1:
		ps.addProduct();
		break;
	case 2:
		System.out.println("Enter the id to be deleted");
		int id=sc.nextInt();
		boolean status=ps.deleteById(id);
		if(status) {
			System.out.println("Product deleted successfully");
		}
		else
			System.out.println("Not found");
		break;
	case 3:
		List<Product>plist=ps.getAllProducts();
		plist.forEach(System.out::println);
		break;
	case 4:
		System.out.println("Enter id to be deleted");
		id=sc.nextInt();
		Product p=ps.displayById(id);
		System.out.println(p);
		break;
	case 5:
	    plist=ps.sortBypname();
	    plist.forEach(System.out::println);
		break;
	case 6:
		System.out.println("Enter the product id");
		id=sc.nextInt();
		System.out.println("Enter the productname");
		String pname=sc.next();
		System.out.println("Enter Warehouse city");
		String wcity=sc.next();
	    status=ps.modifyById(id,pname,wcity);
	    if(status)
	    	System.out.println("Product Modified successfully");
	    else
	    	System.out.println("Product not found");
		
		break;
	case 7:
		System.out.println("Thank you!!!!!");
		HibernateUtil.closeMySessiopnFacory();
		break;
	default:
		System.out.println("Invalid choice");
			
	}
	}while(choice!=7);
}


}