package com.example.studentManagementSystem.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentManagementSystem.model.StudentDetails;
@Repository
public interface StudentDetailRepo extends JpaRepository<StudentDetails, Integer> {

}
