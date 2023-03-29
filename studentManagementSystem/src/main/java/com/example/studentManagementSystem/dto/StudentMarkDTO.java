package com.example.studentManagementSystem.dto;

public class StudentMarkDTO {
	private Integer id;
	private String name;
	private String rollNo;
	private String phoneNo;
	private String emailId;
	private String address;
	private String collegeName;
	private Integer eng;
	private Integer math;
	private Integer bio;
	private Integer phy;
	private Integer che;
	private Integer hindi;

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

	public Integer getEng() {
		return eng;
	}

	public void setEng(Integer eng) {
		this.eng = eng;
	}

	public Integer getMath() {
		return math;
	}

	public void setMath(Integer math) {
		this.math = math;
	}

	public Integer getBio() {
		return bio;
	}

	public void setBio(Integer bio) {
		this.bio = bio;
	}

	public Integer getPhy() {
		return phy;
	}

	public void setPhy(Integer phy) {
		this.phy = phy;
	}

	public Integer getChe() {
		return che;
	}

	public void setChe(Integer che) {
		this.che = che;
	}

	public Integer getHindi() {
		return hindi;
	}

	public void setHindi(Integer hindi) {
		this.hindi = hindi;
	}

}
