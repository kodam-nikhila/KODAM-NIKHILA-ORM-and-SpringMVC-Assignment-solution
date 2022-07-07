package com.gl.javafsd.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gl.javafsd.entity.Customer;


@Service
public interface CustomerService {
	List<Customer> listAll();
	Customer findById(int theId);

	void save(Customer thecustomer);

	void deleteById(int theId);

	}


