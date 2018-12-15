package com.test.jdbc.demo.model;

public class Department {
	
	public  int depId;
	public String dName;
	public int locId;
	public int manId;
	

	public Department() {
		super();
	}

	public Department(int depId, String dName, int manId, int locId) {
		super();
		this.depId = depId;
		this.dName = dName;
		this.locId = locId;
		this.manId = manId;
	}
	
	public int getDepId() {
		return depId;
	}
	public void setDepId(int depId) {
		this.depId = depId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public int getLocId() {
		return locId;
	}
	public void setLocId(int locId) {
		this.locId = locId;
	}
	public int getManId() {
		return manId;
	}
	public void setManId(int manId) {
		this.manId = manId;
	}	
	@Override
	public String toString() {
		return "Department [depId=" + depId + ", dName=" + dName + ", locId=" + locId + ", manId=" + manId + "]";
	}
}
