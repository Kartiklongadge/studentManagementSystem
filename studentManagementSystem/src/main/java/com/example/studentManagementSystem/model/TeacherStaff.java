package com.example.studentManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TeacherStaff {
@Id
	private Integer id;

	private Integer age;

	private Integer teacherName;

	private String subject;
	
	

	public TeacherStaff() {
		super();
	}

	public TeacherStaff(Integer id, Integer age, Integer teacherName, String subject) {
		super();
		this.id = id;
		this.age = age;
		this.teacherName = teacherName;
		this.subject = subject;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(Integer teacherName) {
		this.teacherName = teacherName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
