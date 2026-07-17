package com.employeeManagementCRUD.EmployeeDirectory.RestControllers;

import com.employeeManagementCRUD.EmployeeDirectory.DAO.EmployeeDAO;
import com.employeeManagementCRUD.EmployeeDirectory.Entity.Employee;
import com.employeeManagementCRUD.EmployeeDirectory.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/employees/{role}")
    public List<Employee> findByRole(@PathVariable String role) {
        return employeeService.findByRole(role);
    }
    @PostMapping("/add")
    public Employee save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
         employeeService.deleteById(id);
    }
    @GetMapping("/email/{email}")
    public List<String> findByEmail(@PathVariable String email) {
        return employeeService.findByEmail(email);
    }
}
