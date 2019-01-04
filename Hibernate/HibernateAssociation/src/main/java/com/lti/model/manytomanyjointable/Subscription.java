package com.lti.model.manytomanyjointable;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="Subscription")
public class Subscription {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int subscriptionId;
	private String title;
	
	@ManyToMany(cascade=CascadeType.ALL, mappedBy="subsList")	
	private List<Reader> readerList;

	public Subscription() {
		super();
	}

	public Subscription(String title, List<Reader> readerList) {
		super();
		this.title = title;
		this.readerList = readerList;
	}

	public int getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(int subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Reader> getReaderList() {
		return readerList;
	}

	public void setReaderList(List<Reader> readerList) {
		this.readerList = readerList;
	}

	@Override
	public String toString() {
		return "Subscription [subscriptionId=" + subscriptionId + ", title=" + title + ", readerList=" + readerList
				+ "]";
	}
	
}
