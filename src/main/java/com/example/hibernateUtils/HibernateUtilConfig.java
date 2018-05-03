package com.example.hibernateUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
public class HibernateUtilConfig {
	
	@Autowired
	//@PersistenceUnit
	private EntityManager entityManagerFactory;
	
	@Bean
	public Session getSession() {
		
		if(entityManagerFactory.unwrap(Session.class)==null) {
			throw new NullPointerException("Not a hibernate factory");
		}
		return entityManagerFactory.unwrap(Session.class); 
	}
	

}
