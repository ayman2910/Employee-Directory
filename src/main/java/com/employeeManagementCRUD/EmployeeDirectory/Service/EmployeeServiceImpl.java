package com.employeeManagementCRUD.EmployeeDirectory.Service;

import com.employeeManagementCRUD.EmployeeDirectory.DAO.EmployeeDAO;
import com.employeeManagementCRUD.EmployeeDirectory.Entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    EmployeeDAO employeeDAO;
    @Autowired
    public void setEmployeeDAO(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int id) {
       return employeeDAO.findById(id);
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {
        return  employeeDAO.save(employee);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
      employeeDAO.deleteById(id);
    }

    @Override
    public List<Employee> findByRole(String role) {
        return employeeDAO.findByRole(role);
    }

    public List<String> findByEmail(String email) {
        return employeeDAO.findByEmail(email);
    }

}
