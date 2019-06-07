package com.capgemini.Manage.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "customer")
@SequenceGenerator(name = "cuseq", initialValue = 100, allocationSize = 5)
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Customer {
	
	@Id
	@Column(name = "customerId")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cuseq")
	private int customerId;
	
	
	@Column(name = "customerName")
	@NotNull
	private String customerName;
	
	@Column(name = "email")
	@NotNull
	private String email;
	
	@Column(name = "password")
	@NotNull
	private String password;
	
	@Column(name = "phoneNumber")
	@NotNull
	private String phoneNumber;
	
	@Column(name = "address")
	@NotNull
	private String address;
	
	@Column(name = "city")
	@NotNull
	private String city;
	
	@Column(name = "zipCode")
	@NotNull
	private String zipCode;
	
	
	@Column(name = "country")
	@NotNull
	private String country;


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getZipCode() {
		return zipCode;
	}


	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


}
