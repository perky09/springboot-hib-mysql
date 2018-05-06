package com.example.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="frdetail",schema = "springbatch")
public class FrDetail {
	
	@Id
	@Column(name="entry_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer entry_id;
	private String finance_rep_id;
	@Column(name="terr")
	private String territory;
	
	public Integer getEntry_id() {
		return entry_id;
	}
	public void setEntry_id(Integer entry_id) {
		this.entry_id = entry_id;
	}
	public String getFinance_rep_id() {
		return finance_rep_id;
	}
	public void setFinance_rep_id(String finance_rep_id) {
		this.finance_rep_id = finance_rep_id;
	}
	public String getTerritory() {
		return territory;
	}
	public void setTerritory(String territory) {
		this.territory = territory;
	}

}
