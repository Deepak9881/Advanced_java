package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Product getById(int pid);

	void updateById(Product p);

	void deleteById(int pid);

}
