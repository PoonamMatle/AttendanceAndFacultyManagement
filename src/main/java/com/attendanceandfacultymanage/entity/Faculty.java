package com.attendanceandfacultymanage.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Faculty {
	
	@Id 
	private int id;
	private int  dept_id;
	private String email;
	private String name;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Faculty(int id, int dept_id, String email, String name) {
		super();
		this.id = id;
		this.dept_id = dept_id;
		this.email = email;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Faculty [id=" + id + ", dept_id=" + dept_id + ", email=" + email + ", name=" + name + "]";
	}
	
	

}
