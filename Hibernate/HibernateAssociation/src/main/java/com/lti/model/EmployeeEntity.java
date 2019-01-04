package com.lti.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class EmployeeEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int empId;
	
	private String firstName;
	private String lastName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="empId")
	private List<AccountEntity> accountEntity;

	public EmployeeEntity() {
		super();
	}

	public EmployeeEntity(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<AccountEntity> getAccountEntity() {
		return accountEntity;
	}

	public void setAccountEntity(List<AccountEntity> accountEntity) {
		this.accountEntity = accountEntity;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", accountEntity=" + accountEntity + "]";
	}

}
