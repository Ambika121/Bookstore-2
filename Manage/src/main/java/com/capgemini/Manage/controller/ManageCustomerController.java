package com.capgemini.Manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Manage.bean.Customer;
import com.capgemini.Manage.exception.CustomerAlreadyExistsException;
import com.capgemini.Manage.exception.CustomerNotExistsException;
import com.capgemini.Manage.service.ManageCustomerInterface;
import com.capgemini.Manage.service.PofileInterface;

@RestController
public class ManageCustomerController
{	
	@Autowired
	ManageCustomerInterface manageCustomerInterface;
	
	@Autowired
	PofileInterface profileInterface;
	
	@RequestMapping(value="/createCustomer",method=RequestMethod.POST)
	public Customer createCustomer(@RequestBody Customer customer) throws CustomerAlreadyExistsException
	{
		customer=manageCustomerInterface.createCustomer(customer);
		return customer;

    }
	
	@RequestMapping(value="/editCustomer",method=RequestMethod.POST)
	public List<Customer> updateCustomer(@RequestBody Customer customer) throws CustomerNotExistsException
	{
		List<Customer> cust =manageCustomerInterface.editCustomer(customer);
		return cust;

    }
	
	@RequestMapping(value="/deleteCustomer/{customerId}",method=RequestMethod.GET)
	public List<Customer> deleteCustomer(@PathVariable int customerId) throws CustomerNotExistsException
	{
		List<Customer> customer = manageCustomerInterface.deleteCustomer(customerId);
		return customer;

    }
	
	@RequestMapping(value="/showAllCustomer",method=RequestMethod.GET)
	public List<Customer> listAllCustomer()
	{
		List<Customer> list = manageCustomerInterface.listAllCustomer();
		return list;

    }
	
	@RequestMapping(value="/viewProfile/{customerId}",method=RequestMethod.GET)
	public Customer viewProile(@PathVariable int customerId) throws CustomerNotExistsException
	{
		Customer customer =  profileInterface.viewProfile(customerId);
		return customer;

    }
	
	@RequestMapping(value="/editProfile",method=RequestMethod.POST)
	public Customer editProfile(@RequestBody Customer customer) throws CustomerAlreadyExistsException
	{
		customer=profileInterface.editProfile(customer);
		return customer;

    }

}