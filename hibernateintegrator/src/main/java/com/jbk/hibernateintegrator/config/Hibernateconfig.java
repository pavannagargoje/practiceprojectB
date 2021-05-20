package com.jbk.hibernateintegrator.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jbk.hibernateintegrator.entity.Customer;

public class Hibernateconfig {

	
	public static SessionFactory getsession() {
		
		Configuration cfg=new Configuration();
		cfg.configure().addAnnotatedClass(Customer.class);
		SessionFactory factory=cfg.buildSessionFactory();
		return factory;
	}
}
