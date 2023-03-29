package com.example.studentManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentMark {
	@Id
 private  Integer id;
   
	private   Integer eng;
   
	private  Integer math;
   
	private  Integer bio;
   
	private  Integer phy;
   
	private   Integer che;
   
	private  Integer hindi;
   
	

	public StudentMark() {
		super();
	}

	public StudentMark(Integer id, Integer eng, Integer math, Integer bio, Integer phy, Integer che, Integer hindi) {
		super();
		this.id = id;
		this.eng = eng;
		this.math = math;
		this.bio = bio;
		this.phy = phy;
		this.che = che;
		this.hindi = hindi;
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
