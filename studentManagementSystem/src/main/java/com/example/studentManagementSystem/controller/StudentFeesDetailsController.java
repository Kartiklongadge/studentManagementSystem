package com.example.studentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentManagementSystem.model.StudentFees;
import com.example.studentManagementSystem.service.StudentDetailsService;

@RestController
public class StudentFeesDetailsController {
	@Autowired
	StudentDetailsService studentDservice;

	@GetMapping("/sms/readAllFeesDetails")
	public List<StudentFees> readAllFeesDetails() {
		return studentDservice.getAllStudentFeesDetails();

	}

	@PostMapping("/sms/saveFeesDetails")
	public String saveFeesDetails(@RequestBody StudentFees studentFee) {
		try {
			studentDservice.savefeesDetails(studentFee);

		} catch (Exception e) {
			return e.getMessage()+"oops! something went Wrong.";
		}
		return "Sucessfully Inserted Data!";
	}
	@GetMapping("/sms/getSudentFeesById")
	public double getSudentFeesById(int id) {
		return studentDservice.findById(id);

		
	}
	@GetMapping("/sms/getDiscount")
	public double getDiscount(@RequestParam("id") int id) {
		double updatedFees  = studentDservice.getDiscount(id);
		return updatedFees;
	}
}
		

	
