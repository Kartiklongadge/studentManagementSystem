package com.example.studentManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentManagementSystem.model.StudentDetails;
import com.example.studentManagementSystem.service.StudentDetailsService;


@RestController
public class StudentDetailController {
	@Autowired
	private StudentDetailsService studentDService;

	@GetMapping("/sms/getAllStudentDetails")
	public List<StudentDetails> readAllStudentDetais() {

		return studentDService.getAllStudentDetails();
	}

	@GetMapping("/sms/getStudentDetailsById")
	public StudentDetails getStudentDetailsById(@RequestParam("id") int id) {

		return studentDService.getStudentDetailsById(id);

	}

	@PostMapping("/sms/saveStudentDetails")
	public String saveStudentDetails(@RequestBody StudentDetails stdobj) {

		try {
			studentDService.saveStudentDetails(stdobj);
		} catch (Exception e) {
			return "Failure";
		}
		return "Sucess";

	}
	@DeleteMapping("/sms/deleteDetails/{idd}")
	public String deleteDetails(@PathVariable("idd")int id) {
		try {
			studentDService.deleteById(id);

		}catch(Exception e) {
			return "failure";
		}
		
		return "Sucess";
	}
}
