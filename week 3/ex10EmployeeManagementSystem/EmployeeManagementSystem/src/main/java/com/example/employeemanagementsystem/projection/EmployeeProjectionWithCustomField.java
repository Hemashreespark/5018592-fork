package com.example.employeemanagementsystem.projection;

import org.springframework.beans.factory.annotation.Value;

public interface EmployeeProjectionWithCustomField {

    String getName();

    String getEmail();

    @Value("#{target.name + ' (' + target.email + ')'}")
    String getDisplayName();
}
