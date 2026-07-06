package com.employeeManagementCRUD.EmployeeDirectory.RestControllers;

import com.employeeManagementCRUD.EmployeeDirectory.DAO.EmployeeDAO;
import com.employeeManagementCRUD.EmployeeDirectory.Entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    EmployeeDAO employeeDAO;
    public EmployeeRestController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
  @GetMapping("/employees")
    public List<Employee> findAll() {
      return employeeDAO.findAll();
  }
}
