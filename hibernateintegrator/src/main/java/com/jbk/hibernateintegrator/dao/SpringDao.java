package com.jbk.hibernateintegrator.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.jbk.hibernateintegrator.config.Hibernateconfig;
import com.jbk.hibernateintegrator.entity.Customer;

@Repository
public class SpringDao {

	
	SessionFactory factory=Hibernateconfig.getsession();
	
	
	public List<Customer> getcustomer() {
		Session session=factory.openSession();
		Criteria criteria=session.createCriteria(Customer.class);
		List<Customer> list=	criteria.list();
		
		
		return list;
	}

	
}
