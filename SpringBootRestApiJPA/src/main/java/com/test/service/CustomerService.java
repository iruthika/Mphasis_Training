package com.test.service;

import java.util.List;

import com.test.entity.Customer;

public interface CustomerService {
public Customer createCustomer(Customer cst);
public List<Customer> updateCustomers(Customer cst);
public List<Customer> readAllCustomers(Customer cst);
public List<Customer> deleteCustomers(int id);


}
