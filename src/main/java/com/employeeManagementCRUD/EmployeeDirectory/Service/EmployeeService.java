package com.employeeManagementCRUD.EmployeeDirectory.Service;

import com.employeeManagementCRUD.EmployeeDirectory.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
    List<Employee> findByRole(String role);
}
