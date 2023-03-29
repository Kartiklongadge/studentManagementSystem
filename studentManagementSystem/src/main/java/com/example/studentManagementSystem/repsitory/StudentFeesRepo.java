package com.example.studentManagementSystem.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentManagementSystem.model.StudentFees;
@Repository
public interface StudentFeesRepo extends JpaRepository<StudentFees, Integer> {

}
