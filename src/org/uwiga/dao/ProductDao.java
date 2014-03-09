package org.uwiga.dao;

import java.util.*;

import org.uwiga.model.Product;

public interface ProductDao {

	void saveOrUpdate(Product obj);

	void delete(Product obj);

	List<Product> findAll();

	List<Product> findById();
}
