package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.dto.EmployeeDTO;
import com.example.employeemanagementsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Using DTO Projection with Constructor Expression
    @Query("SELECT new com.example.employeemanagementsystem.dto.EmployeeDTO(e.name, e.email, d.name) " +
           "FROM Employee e JOIN e.department d")
    List<EmployeeDTO> findEmployeeDTOs();
}
