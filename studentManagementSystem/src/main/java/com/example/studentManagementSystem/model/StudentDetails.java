package com.example.studentManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity


public class StudentDetails {
	@Id
	private Integer id;
	private String name;
	private String rollNo;
	private String phoneNo;
	private String emailId;
	private String address;
	private String collegeName;

	public StudentDetails() {
		super();
	}

	public StudentDetails(Integer id, String name, String rollNo, String phoneNo, String emailId, String address,
			String collegeName) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.address = address;
		this.collegeName = collegeName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

}
