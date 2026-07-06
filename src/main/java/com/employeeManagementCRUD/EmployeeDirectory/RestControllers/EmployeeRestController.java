package com.employeeManagementCRUD.EmployeeDirectory.RestControllers;

import com.employeeManagementCRUD.EmployeeDirectory.DAO.EmployeeDAO;
import com.employeeManagementCRUD.EmployeeDirectory.Entity.Employee;
import com.employeeManagementCRUD.EmployeeDirectory.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {
    EmployeeService employeeService;
    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
  @GetMapping("/employees")
    public List<Employee> findAll() {
      return employeeService.findAll();
  }
}
