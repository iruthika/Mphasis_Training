package com.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.Customer;
import com.test.service.CustomerService;
@RestController
@RequestMapping("/customer/v1")
public class CustomerController {
@Autowired
private CustomerService service;
public void setService(CustomerService service) {
	this.service = service;
}
@PostMapping("/create")
public Customer createCustomer(@RequestBody Customer c) {
	return service.createCustomer(c);
}
@GetMapping("/listall")
public List<Customer> readAllCustomers(Customer c){
	return service.readAllCustomers(c);
}
@PutMapping("/update/{id}")
	public List<Customer> updateCustomer(@RequestBody Customer c,@PathVariable("id")int id){
		c.setId(id);
		return service.updateCustomers(c);
	}
@DeleteMapping("/delete/{id}")
public List<Customer> deleteCustomer(@PathVariable("id")int id){
	return service.deleteCustomers(id);
}
}
