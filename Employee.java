package com.app.pojo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee extends BaseEntity 
{
	@Column(name="first_name", length = 20)
	private String fname;
	
	@Column(name="last_name", length = 20)
	private String lname;
	
	@Column(length = 20, unique = true)
	private String email;
	
	@Column(length = 20)
	private String password;
	
	@Column
	private LocalDate dob;

	public Employee() {
		super();
	}

	public Employee(String fname, String lname, String email, String password, LocalDate dob) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", lname=" + lname + ", email=" + email + ", dob=" + dob + "]";
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	
	
}
