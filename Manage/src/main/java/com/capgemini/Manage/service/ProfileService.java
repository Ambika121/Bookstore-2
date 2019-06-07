package com.capgemini.Manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Manage.bean.Customer;
import com.capgemini.Manage.dao.CustomerRepository;
import com.capgemini.Manage.exception.CustomerAlreadyExistsException;
import com.capgemini.Manage.exception.CustomerNotExistsException;

@Service
public class ProfileService implements PofileInterface {
	
	@Autowired
	CustomerRepository customerRepository;
	
	
	@Override
	public Customer viewProfile(int customerId) throws CustomerNotExistsException{
		if(customerRepository.existsById(customerId))
		{
			return customerRepository.findById(customerId).get();
		}
		throw new CustomerNotExistsException("customer does not exist");
	}

	@Override
	public Customer editProfile(Customer customer) throws CustomerAlreadyExistsException {
		
		if(customerRepository.existsById(customer.getCustomerId()))
		{
			customerRepository.saveAndFlush(customer);
		}
		throw new CustomerAlreadyExistsException("customer does not exist");
	}
}
