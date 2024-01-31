package com.edubridge.app1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edubridge.app1.model.CustomerRegistration;
import com.edubridge.app1.repo.CustomerRegistrationRepository;

@Repository
public class CustomerRegistrationDao {

	@Autowired
	private CustomerRegistrationRepository repo;
	public CustomerRegistration saveCustomer(CustomerRegistration c) {
		return repo.save(c);
	}
	public List<CustomerRegistration>getCustomers(){
		return repo.findAll();
	}
	public CustomerRegistration getCustomer(Integer customerId) {
		return repo.findById(customerId).get();
	}
	public void updateCustomer(CustomerRegistration c) {
		repo.save(c);
	}
	public void deleteCustomer(Integer customerId) {
		repo.deleteById(customerId);
	}
	
}
