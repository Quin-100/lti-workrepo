package hibernate.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PersonDetail implements Serializable{
	@Id
	@GeneratedValue
	private int pId;
	private float salary;
	private String aadhar;
	
	public PersonDetail() {
		super();
	}
	
	public PersonDetail(int pId, float salary, String aadhar) {
		super();
		this.pId = pId;
		this.salary = salary;
		this.aadhar = aadhar;
	}

	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}	
	
	
	@Override
	public String toString() {
		return "PersonDetail [pId=" + pId + ", salary=" + salary + ", aadhar=" + aadhar + "]";
	}	
	
}
