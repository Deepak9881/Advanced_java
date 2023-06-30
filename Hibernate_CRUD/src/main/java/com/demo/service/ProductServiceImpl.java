package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.beans.Warehouse;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService {
	
	private ProductDao pdao;
	
	

	public ProductServiceImpl() {
	
		this.pdao = new ProductDaoImpl();
	}



	public void addProduct() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the product id");
		int id=sc.nextInt();
		System.out.println("Enter the product name");
		String pname=sc.next();
		System.out.println("Enter the warehouse id");
		int wid=sc.nextInt();
		System.out.println("Enter the warehouse city");
		String wcity=sc.next();
		System.out.println("Enter the warehouse state");
		String wstate=sc.next();
		Warehouse w=new Warehouse(wid,wcity,wstate,null);
		Product p=new Product(id,pname,w);
		w.setP(p);
		pdao.addProduct(p,w);
	}



	@Override
	public List<Product> getAllProducts() {
		return pdao.getAllProducts();
	}



	@Override
	public boolean deleteById(int id) {
		return pdao.removeById(id);
	}



	@Override
	public Product displayById(int id) {
	
		return pdao.displayById(id);
	}



	@Override
	public List<Product> sortBypname() {
		
		return pdao.sortByPname();
	}



	@Override
	public boolean modifyById(int id, String pname, String wcity) {
	
		return pdao.upadteById(id,pname,wcity);
	}





}
