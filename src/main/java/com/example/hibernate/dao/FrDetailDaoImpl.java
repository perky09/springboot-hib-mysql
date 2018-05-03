package com.example.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.FrDetail;

@Repository
public class FrDetailDaoImpl implements FrDetailDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void createFrDetailTable(FrDetail frDetail) {
		System.out.println("Empty hai");
		Session session=null;
		try {
			session=sessionFactory.openSession();
			session.beginTransaction();
			Integer id=(Integer)session.save(frDetail);
			System.out.println("Table Created in schema which we mentioned in application.properties with ID: "+id);
			session.getTransaction().commit();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
