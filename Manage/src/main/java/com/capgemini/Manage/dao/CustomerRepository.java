package com.capgemini.Manage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Manage.bean.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
