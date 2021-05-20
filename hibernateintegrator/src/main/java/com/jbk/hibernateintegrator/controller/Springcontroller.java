package com.jbk.hibernateintegrator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.hibernateintegrator.entity.Customer;
import com.jbk.hibernateintegrator.service.Springservice;

@RestController
public class Springcontroller {

	@Autowired
	Springservice spservice;
	
	@GetMapping("/getcustomer")
	public List<Customer> getcustomer() {
		
		List<Customer> list=spservice.getcustomer();
		return list;
	}
}
