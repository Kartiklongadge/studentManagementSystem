package com.example.studentManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentFees {
@Id
	private Integer id;

	private Integer studentRemainFees;

	private Integer studentTotalFeesAmout;

	private String isFeesPaidStetus;

	public StudentFees() {
		super();
	}

	public StudentFees(Integer id, Integer studentRemainFees, Integer studentTotalFeesAmout, String isFeesPaidStetus) {
		super();
		this.id = id;
		this.studentRemainFees = studentRemainFees;
		this.studentTotalFeesAmout = studentTotalFeesAmout;
		this.isFeesPaidStetus = isFeesPaidStetus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStudentRemainFees() {
		return studentRemainFees;
	}

	public void setStudentRemainFees(Integer studentRemainFees) {
		this.studentRemainFees = studentRemainFees;
	}

	public Integer getStudentTotalFeesAmout() {
		return studentTotalFeesAmout;
	}

	public void setStudentTotalFeesAmout(Integer studentTotalFeesAmout) {
		this.studentTotalFeesAmout = studentTotalFeesAmout;
	}

	public String getIsFeesPaidStetus() {
		return isFeesPaidStetus;
	}

	public void setIsFeesPaidStetus(String isFeesPaidStetus) {
		this.isFeesPaidStetus = isFeesPaidStetus;
	}

}
