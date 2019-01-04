package hibernate.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;

@Entity
public class Person implements Serializable{
	@Id
	@GeneratedValue
	private int personId;
	private String name;
	@OneToOne(cascade=CascadeType.ALL)
	private PersonDetail pdetails;
	
	public Person() {
		super();
	}
	
	public Person(int personId, String name) {
		super();
		this.personId = personId;
		this.name = name;
	}
	
	
	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPdetails(PersonDetail pdetails) {
		//this.aadhar = aadhar;
		this.pdetails = pdetails;
	}
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + "]";
	}	
}
