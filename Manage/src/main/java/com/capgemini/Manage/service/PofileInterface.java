package com.capgemini.Manage.service;

import com.capgemini.Manage.bean.Customer;
import com.capgemini.Manage.exception.CustomerAlreadyExistsException;
import com.capgemini.Manage.exception.CustomerNotExistsException;

public interface PofileInterface {

	Customer viewProfile(int customerId) throws CustomerNotExistsException;

	Customer editProfile(Customer customer) throws CustomerAlreadyExistsException;

}