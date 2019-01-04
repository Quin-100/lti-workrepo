package com.lti.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class School {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="school_seq")
	@SequenceGenerator(name="school_seq",sequenceName="OrclSclSeq")
	private int id;
	private String schoolName;
	@Embedded
	private SchoolDetail schoolDetail;
	
	
	public School() {
		super();
	}
	public School(String schoolName) {
		super();	
		this.schoolName = schoolName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String schoolName() {
		return schoolName;
	}
	public void schoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public SchoolDetail getSchoolDetail() {
		return schoolDetail;
	}
	public void setSchoolDetail(SchoolDetail schoolDetail) {
		this.schoolDetail = schoolDetail;
	}
	@Override
	public String toString() {
		return "School [id=" + id + ", schoolName=" + schoolName + ", schoolDetail=" + schoolDetail + "]";
	}
	
	
	
	

}
