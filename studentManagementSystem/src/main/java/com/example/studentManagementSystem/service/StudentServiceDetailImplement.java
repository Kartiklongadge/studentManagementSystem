package com.example.studentManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentManagementSystem.dto.StudentMarkDTO;
import com.example.studentManagementSystem.model.Admine;
import com.example.studentManagementSystem.model.StudentDetails;
import com.example.studentManagementSystem.model.StudentFees;
import com.example.studentManagementSystem.model.StudentMark;
import com.example.studentManagementSystem.repsitory.AdmineRepo;
import com.example.studentManagementSystem.repsitory.StudentDetailRepo;
import com.example.studentManagementSystem.repsitory.StudentFeesRepo;
import com.example.studentManagementSystem.repsitory.StudentMarkRepo;

@Service
public class StudentServiceDetailImplement implements StudentDetailsService {
	@Autowired
	private StudentDetailRepo studentDRepo;

	@Autowired
	private StudentMarkRepo studentMRepo;

	@Autowired
	private AdmineRepo adminRepo;
	@Autowired
	private StudentFeesRepo studentFRepo;

	@Override
	public List<StudentDetails> getAllStudentDetails() {
		// TODO Auto-generated method stub
		return studentDRepo.findAll();

	}

	@Override
	public StudentDetails getStudentDetailsById(int id) {
		// TODO Auto-generated method stub
		return studentDRepo.findById(id).get();
	}

	@Override
	public void saveStudentDetails(StudentDetails stdobjj) {
		// TODO Auto-generated method stub
		studentDRepo.save(stdobjj);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		studentDRepo.deleteById(id);
	}

	@Override
	public void saveStudentsMarksDetails(StudentMarkDTO stuMark) {
		// TODO Auto-generated method stub
		StudentDetails std = new StudentDetails();
		std.setCollegeName(stuMark.getCollegeName());
		std.setAddress(stuMark.getAddress());
		std.setEmailId(stuMark.getEmailId());
		std.setId(stuMark.getId());
		std.setPhoneNo(stuMark.getPhoneNo());
		std.setRollNo(stuMark.getRollNo());
		StudentMark sm = new StudentMark();
		sm.setBio(stuMark.getBio());
		sm.setChe(stuMark.getChe());
		sm.setEng(stuMark.getEng());
		sm.setHindi(stuMark.getHindi());
		sm.setMath(stuMark.getMath());
		sm.setPhy(stuMark.getPhy());
		sm.setId(stuMark.getId());

		studentDRepo.save(std);
		studentMRepo.save(sm);
	}

	@Override
	public double StudentPercentage(int percentage) {
		StudentMark stdMark = studentMRepo.findById(percentage).get();
		double total = stdMark.getBio() + stdMark.getChe() + stdMark.getEng() + stdMark.getHindi() + stdMark.getPhy()
				+ stdMark.getMath();
		double percentage1 = total / 6;
		return percentage1;
	}

	@Override
	public String deleteStudent(int id, int aid) {
		// TODO Auto-generated method stub
		Admine adm = adminRepo.findById(aid).get();
		if ("Y".equals(adm.getAccessStetus())) {
			studentDRepo.deleteById(id);
		} else {
			return "You Don't have Admine Access";
		}

		return "Sucessfully Deleted";
	}

	@Override
	public List<StudentFees> getAllStudentFeesDetails() {
		// TODO Auto-generated method stub
		return studentFRepo.findAll();
	}

	@Override
	public void savefeesDetails(StudentFees studentFee) {
		// TODO Auto-generated method stub
		studentFRepo.save(studentFee);
	}

	@Override
	public double findById(int id) {
		// TODO Auto-generated method stub
		StudentFees sf = studentFRepo.findById(id).get();
		double  Amount = sf.getStudentTotalFeesAmout() - sf.getStudentRemainFees();
		return Amount;
	}

	@Override
	public double getDiscount(int id) {
		// TODO Auto-generated method stub
		StudentMark sm = studentMRepo.findById(id).get();
		double total1 = sm.getBio()+sm.getChe()+sm.getEng()+sm.getHindi()+sm.getMath()+sm.getPhy();
		double percent = total1/6;
		System.out.println(percent);
		StudentFees sf = studentFRepo.findById(id).get();
		double paid = sf.getStudentTotalFeesAmout() - sf.getStudentRemainFees();
		
		double discount = 0;
		if(percent<50) {
			discount = 0;
		}else if(percent>=50 && percent<=70) {
			discount = paid * 0.05;
		}else if(percent>70 &&  percent<=90) {
			discount  = paid * 0.10;
		}else {
			discount  = paid * 0.25;

		}
			
		return percent - discount;	
			
			
			
	
	}

	
		
      
}
