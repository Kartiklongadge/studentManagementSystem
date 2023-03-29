package com.example.studentManagementSystem.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studentManagementSystem.model.Admine;
@Repository
public interface AdmineRepo extends JpaRepository<Admine, Integer>{

}
