package com.example.studentManagementSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Admine {
	@Id
	private Integer admineId;

	private String admineName;

	private String accessStetus;

	public Integer getAdmineId() {
		return admineId;
	}

	public void setAdmineId(Integer admineId) {
		this.admineId = admineId;
	}

	public String getAdmineName() {
		return admineName;
	}

	public void setAdmineName(String admineName) {
		this.admineName = admineName;
	}

	public String getAccessStetus() {
		return accessStetus;
	}

	public void setAccessStetus(String accessStetus) {
		this.accessStetus = accessStetus;
	}
}
