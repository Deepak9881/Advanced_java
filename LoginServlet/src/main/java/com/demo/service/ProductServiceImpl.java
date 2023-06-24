package com.demo.service;

import java.util.List;

import com.demo.beans.Product;
import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;

public class ProductServiceImpl implements ProductService{
     private  ProductDao pdao;
     
     public ProductServiceImpl() {
    	 pdao=new ProductDaoImpl();
     }
	@Override
	public List<Product> getAllProducts() {
		return pdao.getAllProduct();
	}
	@Override
	public Product getById(int pid) {
		
		return pdao.getById(pid);
	}
	@Override
	public void updateById(Product p) {
		pdao.update(p);
		
	}
	@Override
	public void deleteById(int pid) {
		pdao.delete(pid);
		
	}

}
