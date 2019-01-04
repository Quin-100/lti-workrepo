package model;

import java.util.Calendar;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Emp_Seq")
	@SequenceGenerator(name="Emp_Seq",sequenceName="OrclEmpSeq")
	private int id;
	private String name;
	private String password;

	//@Temporal(TemporalType.TIMESTAMP)
	private Date emp_login;
	private String email;
	@Temporal(TemporalType.DATE)
	private Calendar emp_joinDate;
	private boolean isPermanent;
	
	
	public Employee() {
		super();
	}	
	
	public Employee(int id, String name, String password, Date mp_login, String email, Calendar emp_joinDate,
			boolean isPermanent) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.emp_login = mp_login;
		this.email = email;
		this.emp_joinDate = emp_joinDate;
		this.isPermanent = isPermanent;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getEmp_login() {
		return emp_login;
	}
	public void setEmp_login(Date emp_login) {
		this.emp_login = emp_login;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public Calendar getEmp_joinDate() {
		return emp_joinDate;
	}
	public void setEmp_joinDate(Calendar emp_joinDate) {
		this.emp_joinDate = emp_joinDate;
	}
	public boolean isPermanent() {
		return isPermanent;
	}
	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", password=" + password + ", mp_login=" + emp_login
				+ ", email=" + email + ", emp_joinDate=" + emp_joinDate + ", isPermanent=" + isPermanent + "]";
	}
}
