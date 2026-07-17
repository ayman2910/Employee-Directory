package com.employeeManagementCRUD.EmployeeDirectory.DAO;

import com.employeeManagementCRUD.EmployeeDirectory.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
   
    List<String> findByEmail(String email);

    List<Employee> findByRole(String role);

    void deleteById(int id);

    Employee save(Employee employee);

    Employee findById(int id);
}
