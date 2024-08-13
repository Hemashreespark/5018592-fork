package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    // Execute a named query to find employees by department name
    List<Employee> findByDepartmentName(@Param("departmentName") String departmentName);

    // Execute a named query to find employees by email domain
    List<Employee> findByEmailDomain(@Param("domain") String domain);
}
