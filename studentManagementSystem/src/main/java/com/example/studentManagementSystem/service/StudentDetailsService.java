package com.example.studentManagementSystem.service;

import java.util.List;

import com.example.studentManagementSystem.dto.StudentMarkDTO;
import com.example.studentManagementSystem.model.StudentDetails;
import com.example.studentManagementSystem.model.StudentFees;

public interface StudentDetailsService {

	public List<StudentDetails> getAllStudentDetails();
	
	public StudentDetails getStudentDetailsById(int id);
	
    public void saveStudentDetails(StudentDetails stdobjj);
    
    public void deleteById(int id);
    
    public void saveStudentsMarksDetails(StudentMarkDTO stuMark);
    
    public double StudentPercentage(int percentage);
    
    public String deleteStudent(int id,int aid);
    
    public List<StudentFees> getAllStudentFeesDetails();
    
    public void savefeesDetails(StudentFees studentFee);
    
    public double findById(int id);
    
    public double getDiscount(int id);
    
}
