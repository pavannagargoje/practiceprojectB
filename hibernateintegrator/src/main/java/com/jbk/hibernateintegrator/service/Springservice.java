package com.jbk.hibernateintegrator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.hibernateintegrator.dao.SpringDao;
import com.jbk.hibernateintegrator.entity.Customer;

@Service
public class Springservice {

	@Autowired
	SpringDao dao;
	
	public List<Customer> getcustomer() {
	
		List<Customer> list=	dao.getcustomer();
		
		
		return list;
	}

	
	
}
