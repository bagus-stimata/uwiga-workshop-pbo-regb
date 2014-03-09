package org.uwiga.dao;

import java.util.ArrayList;
import java.util.List;

import org.uwiga.model.Customer;

public class App {	
	public App(){
		//objek dao
		CustomerDao customerManager = new CustomerDaoImpl();		
		//MEMASUKKAN DATA
		Customer cust1 = new Customer();
		cust1.setIdCustomer("001");
		cust1.setName("Bari Prima");
		customerManager.saveOrUpdate(cust1);
		
		Customer cust2 = new Customer();
		cust2.setIdCustomer("002");
		cust2.setName("Ibu Bari Prima");				
		customerManager.saveOrUpdate(cust2);
		
		//MENAMPILKAN DATA
		List<Customer> keranjangCustomer = new ArrayList<>();
		keranjangCustomer = customerManager.findAll();
		for (Customer item : keranjangCustomer){
			System.out.println(item);
		}
		for (int i=0; i<keranjangCustomer.size(); i++){
			Customer item = new Customer();
			item = keranjangCustomer.get(i);
			System.out.println(item);
		}
		
	}	
	
	public static void main(String[] args) {
		App f = new App();		
	}
}
