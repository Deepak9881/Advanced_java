package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	void addProduct();

	List<Product> getAllProducts();

	boolean deleteById(int id);

	Product displayById(int id);

	List<Product> sortBypname();

	boolean modifyById(int id, String pname, String wcity);

}
