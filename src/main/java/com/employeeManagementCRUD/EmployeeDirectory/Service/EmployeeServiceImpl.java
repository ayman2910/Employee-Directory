package com.employeeManagementCRUD.EmployeeDirectory.Service;

import com.employeeManagementCRUD.EmployeeDirectory.DAO.EmployeeDAO;
import com.employeeManagementCRUD.EmployeeDirectory.Entity.Employee;
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
}
