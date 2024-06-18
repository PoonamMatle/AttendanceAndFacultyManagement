package com.attendanceandfacultymanage.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subject {
	
	@Id
	private int id;
	private  int course_id;
	private String name;
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int id, int course_id, String name) {
		super();
		this.id = id;
		this.course_id = course_id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Subject [id=" + id + ", course_id=" + course_id + ", name=" + name + "]";
	}
	

}
