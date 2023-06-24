package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	List<Product> getAllProduct();

	Product getById(int pid);

	void update(Product p);

	void delete(int pid);

}
