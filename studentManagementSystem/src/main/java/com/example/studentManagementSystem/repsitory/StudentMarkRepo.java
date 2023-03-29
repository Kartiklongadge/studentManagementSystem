package com.example.studentManagementSystem.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentManagementSystem.model.StudentMark;
@Repository
public interface StudentMarkRepo extends JpaRepository<StudentMark, Integer>{

}
