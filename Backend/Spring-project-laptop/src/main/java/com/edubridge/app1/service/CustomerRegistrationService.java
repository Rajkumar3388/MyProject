package com.edubridge.app1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.app1.dao.CustomerRegistrationDao;
import com.edubridge.app1.model.CustomerRegistration;

@Service
public class CustomerRegistrationService {
	@Autowired
	private CustomerRegistrationDao dao;
	public CustomerRegistration saveCustomer(CustomerRegistration c) {
		return dao.saveCustomer(c);
	}
	public List<CustomerRegistration>getCustomers(){
		return dao.getCustomers();
	}
	public CustomerRegistration getCustomer(Integer customerId) {
		return dao.getCustomer(customerId);
	}
	public void updateCustomer(CustomerRegistration c) {
		dao.updateCustomer(c);
	}
	public void deleteCustomer(Integer customerId) {
		dao.deleteCustomer(customerId);
	}
	public CustomerRegistration login(Integer customerId, String password) throws Exception{
		
		CustomerRegistration customer = dao.getCustomer(customerId);
		
		System.out.println(customer.getUserPassword());
		
		if(customer.getCustomerId().equals(customerId) && customer.getUserPassword().equals(password)) {
			
			return customer;
			
		}else {
			throw new Exception("invalid Credentials");
		}
	}

}
