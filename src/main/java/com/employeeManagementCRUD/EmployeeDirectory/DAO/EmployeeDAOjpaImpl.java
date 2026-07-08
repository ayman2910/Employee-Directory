package com.employeeManagementCRUD.EmployeeDirectory.DAO;

import com.employeeManagementCRUD.EmployeeDirectory.Entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOjpaImpl implements EmployeeDAO {

    private EntityManager entityManager;
    public EmployeeDAOjpaImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);
        return  query.getResultList();
    }

    @Override
    public Employee findById(int id) {
        Employee dbEmployee = entityManager.find(Employee.class, id);
        return dbEmployee;
    }

    @Override
    public Employee save(Employee employee) {
        Employee dbEmployee = entityManager.merge(employee);
        return dbEmployee;
    }

    @Override
    public void deleteById(int id ) {
       Employee dbEmployee = entityManager.find(Employee.class,id);
    }

    @Override
    public List<Employee> findByRole(String role) {
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee where role = :role", Employee.class);
        theQuery.setParameter("role", role);
        List<Employee> theEmployees = theQuery.getResultList();
        return theEmployees;
    }
}
