package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;
import com.demo.beans.Warehouse;

public interface ProductDao {

	void addProduct(Product p, Warehouse w);

	List<Product> getAllProducts();

	boolean removeById(int id);

	Product displayById(int id);

	List<Product> sortByPname();

	boolean upadteById(int id, String pname, String wcity);

}
