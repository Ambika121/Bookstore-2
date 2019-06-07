package com.capgemini.Manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Manage.bean.Customer;
import com.capgemini.Manage.dao.CustomerRepository;
import com.capgemini.Manage.exception.CustomerAlreadyExistsException;
import com.capgemini.Manage.exception.CustomerNotExistsException;
import com.capgemini.Manage.exception.emptyListException;

@Service
public class ManageCustomerService implements ManageCustomerInterface {
	
	@Autowired
	CustomerRepository customerRepository;
	
	
	@Override
	public Customer createCustomer(Customer customer) throws CustomerAlreadyExistsException{
		String email=customer.getEmail();
		List<Customer> customerList=listAllCustomer();
		for(Customer list:customerList)
		{
			if(email.equals(list.getEmail()))
				throw new CustomerAlreadyExistsException("This customer already exist");
		}
			customerRepository.save(customer);
			return customer;
	}
	
	
	@Override
	public List<Customer> deleteCustomer(int customerId) throws CustomerNotExistsException{
		
		if(customerRepository.existsById(customerId))
		{
			customerRepository.deleteById(customerId);
			return customerRepository.findAll();
		}
		
		throw new CustomerNotExistsException("customer does not exist");
	}
	
	
	@Override
	public List<Customer> listAllCustomer()
	{
		List<Customer> list = customerRepository.findAll();
		
		try {
		
		    if(list == null)
		    {
			    throw new emptyListException("List is Empty");
		    }
		    
		}
		catch(emptyListException exception)
		{
			
		}
		    
		return list;
	}
	
	
	@Override
	public List<Customer> editCustomer(Customer customer) throws CustomerNotExistsException{
		if(customerRepository.existsById(customer.getCustomerId())) {
			customerRepository.saveAndFlush(customer);
			return customerRepository.findAll();
		}
		throw new CustomerNotExistsException("customer does not exist");
	}

}


//2016309