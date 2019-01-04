package com.lti.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Project {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="proj_seq")
	@SequenceGenerator(name="proj_seq",sequenceName="OrclProjSeq")
	private int projectid;
	private String title;
	private Date startdate;
	

	public Project() {
		super();
	}
	
	public Project(int projectid, String title, Date startdate) {
		super();
		this.projectid = projectid;
		this.title = title;
		this.startdate = startdate;
	}
	public int getProjectid() {
		return projectid;
	}
	public void setProjectid(int projectid) {
		this.projectid = projectid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	@Override
	public String toString() {
		return "Project [projectid=" + projectid + ", title=" + title + ", startdate=" + startdate + "]";
	}
}
