package com.employeeManagementCRUD.EmployeeDirectory.Service;

import com.employeeManagementCRUD.EmployeeDirectory.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
