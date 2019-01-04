package com.lti.model;

import javax.persistence.Entity;

@Entity
public class Task extends Module{
	
	private String taskName;	
	
	public Task() {
		super();
	}
	
	public Task(String taskName) {
		super();
		this.taskName = taskName;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	

	@Override
	public String toString() {
		return "Task [taskName=" + taskName + "]";
	}

}
