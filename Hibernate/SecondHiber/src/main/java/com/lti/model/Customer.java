package com.lti.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="customer")
@SecondaryTable(name="custDetails")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="cust_seq")
	@SequenceGenerator(name="cust_seq",sequenceName="OrclCustSeq")
	private int custId;
	private String name;
	@Column(name="custAddress",table="custDetails")
	private String address;
	@Column(name="creditScore",table="custDetails")
	private int creditScore;
	@Column(name="rewardPoints",table="custDetails")
	private int rewardPoints;
	
	
	public Customer() {
		super();
	}


	public Customer(String name, String address, int creditScore, int rewardPoints) {
		super();		
		this.name = name;
		this.address = address;
		this.creditScore = creditScore;
		this.rewardPoints = rewardPoints;
	}


	public int getCustId() {
		return custId;
	}


	public void setCustId(int custId) {
		this.custId = custId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getCreditScore() {
		return creditScore;
	}


	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}


	public int getRewardPoints() {
		return rewardPoints;
	}


	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}


	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", address=" + address + ", creditScore=" + creditScore
				+ ", rewardPoints=" + rewardPoints + "]";
	}
	
	
}
