package com.example.employeemanagementsystem.repository;

import com.example.employeemanagementsystem.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    // Custom JPQL query to find departments with a specific employee count
    @Query("SELECT d FROM Department d WHERE SIZE(d.employees) = :count")
    List<Department> findDepartmentsByEmployeeCount(int count);

    // Custom native SQL query to find departments by a specific name pattern
    @Query(value = "SELECT * FROM departments WHERE name LIKE %:pattern%", nativeQuery = true)
    List<Department> findDepartmentsByNamePattern(String pattern);
}
