package com.example.hibernate.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.hibernate.entity.FrDetail;
@Repository
public interface FrDetailDao extends JpaRepository<FrDetail,Integer>{

}
