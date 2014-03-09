package org.uwiga.dao;

import java.util.List;

import org.uwiga.model.Product;
import org.uwiga.model.SalesHeader;

public interface SalesHeaderDao {
	void saveOrUpdate(SalesHeader obj);

	void delete(SalesHeader obj);

	List<SalesHeader> findAll();

	List<SalesHeader> findById();	
}
