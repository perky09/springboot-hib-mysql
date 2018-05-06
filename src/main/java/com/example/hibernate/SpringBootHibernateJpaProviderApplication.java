package com.example.hibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.hibernate.dao.FrDetailDao;
import com.example.hibernate.entity.FrDetail;


@SpringBootApplication
public class SpringBootHibernateJpaProviderApplication implements CommandLineRunner {

	@Autowired
	private FrDetailDao frDetailDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateJpaProviderApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		FrDetail frDetail=getFrDetail();
		frDetailDao.saveAndFlush(frDetail);
		
	}
	private FrDetail getFrDetail() {
		FrDetail frDetail=new FrDetail();
		frDetail.setFinance_rep_id("Prakash");
		frDetail.setTerritory("BBSR");
		return frDetail;
	}
}
