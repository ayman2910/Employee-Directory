package com.employeeManagementCRUD.EmployeeDirectory.DAO;

import com.employeeManagementCRUD.EmployeeDirectory.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
