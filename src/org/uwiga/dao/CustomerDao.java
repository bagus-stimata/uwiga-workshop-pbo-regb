package org.uwiga.dao;

import java.util.*;

import org.uwiga.model.Customer;

public interface CustomerDao {

	public void saveOrUpdate(Customer obj);

	public void delete(Customer obj);

	public List<Customer> findAll();

	public List<Customer> findById();
}
