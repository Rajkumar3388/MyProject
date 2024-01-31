package com.edubridge.app1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.edubridge.app1.model.CustomerRegistration;
import com.edubridge.app1.service.CustomerRegistrationService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping
public class CustomerRegistrationController {

    @Autowired
    private CustomerRegistrationService service;

    @PostMapping("/customer")
    public ResponseEntity<CustomerRegistration> save(@RequestBody CustomerRegistration customer) {
        CustomerRegistration savedCustomer = service.saveCustomer(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.OK);
    }

    @GetMapping("/customers") // Change the mapping to make it different from the next one
    public ResponseEntity<List<CustomerRegistration>> getCustomers() {
        List<CustomerRegistration> customers = service.getCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @GetMapping("/customer/{id}") // Change the mapping to include a path variable
    public ResponseEntity<CustomerRegistration> getCustomer(@PathVariable("id") Integer customerId) {
        CustomerRegistration customer = service.getCustomer(customerId);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @DeleteMapping("/customer/{id}")
    public ResponseEntity<CustomerRegistration> deleteCustomer(@PathVariable("id") Integer customerId) {
        service.deleteCustomer(customerId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/customer")
    public ResponseEntity<CustomerRegistration> update(@RequestBody CustomerRegistration customer) {
        CustomerRegistration updatedCustomer = service.saveCustomer(customer);
        return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
    }
    @PostMapping("customer/valid")
    public CustomerRegistration login(@RequestBody CustomerRegistration customer)throws Exception {
        
        return this.service.login(customer.getCustomerId(),customer.getUserPassword());
    }
    
}



