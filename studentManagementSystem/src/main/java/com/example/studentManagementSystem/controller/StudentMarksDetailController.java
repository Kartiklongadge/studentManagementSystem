package com.example.studentManagementSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentManagementSystem.dto.StudentMarkDTO;
import com.example.studentManagementSystem.service.StudentDetailsService;

@RestController
public class StudentMarksDetailController {
	@Autowired
	private StudentDetailsService studentDService;

	@PostMapping("/sms/saveMarkDetails")
	public String saveMarkDetails(@RequestBody StudentMarkDTO stuMark) {
		try {
			studentDService.saveStudentsMarksDetails(stuMark);

		} catch (Exception e) {
			return (e.getMessage() + "Failure");

		}
		return "Success";
	}

	@GetMapping("/sms/getpercentage")
	public double calculatePercentage(@RequestParam("id") int id) {
		double percentage = studentDService.StudentPercentage(id);
		
		return percentage;
	}
	@DeleteMapping("/sms/adminDelete")
	public String deleteStudentDetails(@RequestParam("sid")int id,@RequestParam("aid") int aid) {
		return studentDService.deleteStudent(id, aid);

	}
	

}
