package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.model.Employee;
import com.example.employeemanagementsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Method to get paginated and sorted list of employees
    public Page<Employee> getEmployeesPaginatedAndSorted(int page, int size, String sortBy, String sortDir) {
        Sort sort = Sort.by(sortBy);
        sort = sortDir.equalsIgnoreCase("desc") ? sort.descending() : sort.ascending();
        
        Pageable pageable = PageRequest.of(page, size, sort);
        return employeeRepository.findAll(pageable);
    }
}
