package com.lti.model.onetomanyjointable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class AccountEntity {
	@Id
	@Column(name="accId", unique=true)
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int accId;
	
	@Column(name="AccountNo", length=40)
	private String accNo;
	


	
	public AccountEntity() {
		super();
	
	}

	public AccountEntity(String accNo) {
		super();
		this.accNo = accNo;		
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}	

	

	@Override
	public String toString() {
		return "AccountEntity [accId=" + accId + ", accNo=" + accNo + "]";
	}
	
	

}
