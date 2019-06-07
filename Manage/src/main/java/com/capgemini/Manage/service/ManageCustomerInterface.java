package com.capgemini.Manage.service;

import java.util.List;

import com.capgemini.Manage.bean.Customer;
import com.capgemini.Manage.exception.CustomerAlreadyExistsException;
import com.capgemini.Manage.exception.CustomerNotExistsException;

public interface ManageCustomerInterface {

	Customer createCustomer(Customer customer) throws CustomerAlreadyExistsException;

	List<Customer> deleteCustomer(int customerId) throws CustomerNotExistsException;

	List<Customer> listAllCustomer();

	List<Customer> editCustomer(Customer customer) throws CustomerNotExistsException;

}