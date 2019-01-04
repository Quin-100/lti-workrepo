package com.lti.model;

import javax.persistence.Entity;

@Entity
public class Module extends Project {

	private String moduleName;

	public Module() {
		super();
	}
	
	public Module(String moduleName) {
		super();
		this.moduleName = moduleName;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	
	@Override
	public String toString() {
		return "Module [moduleName=" + moduleName + "]";
	}

}
