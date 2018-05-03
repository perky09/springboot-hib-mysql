package com.example.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.FrDetail;
import com.example.hibernate.dao.FrDetailDao;


@SpringBootApplication
public class SpringBootHibernateJpaProviderApplication implements CommandLineRunner {

	@Autowired
	private FrDetailDao frDetailDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateJpaProviderApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		FrDetail frDetail=getFrDetail();
		System.out.println("hello");
		frDetailDao.createFrDetailTable(frDetail);
		System.out.println("here");
	}
	private FrDetail getFrDetail() {
		// TODO Auto-generated method stub
		FrDetail frDetail=new FrDetail();
		frDetail.setFinance_rep_id("Prakash");
		frDetail.setTerritory("BBSR");
		return frDetail;
	}
}
