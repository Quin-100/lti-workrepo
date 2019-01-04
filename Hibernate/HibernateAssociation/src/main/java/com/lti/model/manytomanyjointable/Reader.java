package com.lti.model.manytomanyjointable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Reader")
public class Reader {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int readerId;
	private String firstName;
	private String email;
	
	@ManyToMany(cascade=CascadeType.ALL)	
	@JoinTable
		(
		    name="Reader_Sub",
			joinColumns= {@JoinColumn(name="ReaderId",referencedColumnName="readerId")},
			inverseJoinColumns={@JoinColumn(name="SubscriptionId",referencedColumnName="subscriptionId")}
	    )
	private List<Subscription> subsList ;

	public Reader() {
		super();
	}

	public Reader(String firstName, String email, List<Subscription> subsList) {
		super();
		this.firstName = firstName;
		this.email = email;
		this.subsList = subsList;
	}

	public int getReaderId() {
		return readerId;
	}

	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Subscription> getSubsList() {
		return subsList;
	}

	public void setSubsList(List<Subscription> subsList) {
		this.subsList = subsList;
	}

	@Override
	public String toString() {
		return "Reader [readerId=" + readerId + ", firstName=" + firstName + ", email=" + email + ", subsList="
				+ subsList + "]";
	}
	
	
	
	
}
