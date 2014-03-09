package org.uwiga.dao;

import java.util.*;

import org.uwiga.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	//Tempat penyimanan >> Nantinya akan diganti dengan database
	List<Customer> listCustomer = new ArrayList<>();
	
	@Override
	public void saveOrUpdate(Customer obj) {
//		System.out.println(obj.getIdCustomer());
//		System.out.println(obj.getName());
		listCustomer.add(obj);		
	}
	@Override
	public void delete(Customer obj) {
		listCustomer.remove(obj);	
	}
	@Override
	public List<Customer> findAll() {
//		for (Customer item : customers){
//			System.out.println(item);
//		}
		return listCustomer;
	}
	@Override
	public List<Customer> findById() {
//		Customer cust = new Customer();
//		int index = customers.indexOf(cust);
//		cust = customers.get(index);
		return null;
	}

}
