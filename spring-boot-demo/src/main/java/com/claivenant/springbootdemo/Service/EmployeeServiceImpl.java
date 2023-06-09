package com.claivenant.springbootdemo.Service;

import com.claivenant.springbootdemo.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    List<Employee> employees = new ArrayList<>();
    @Override
    public Employee save(Employee employee) {
        if (employee.getId() == null || employee.getId().isEmpty()){
            employee.setId(UUID.randomUUID().toString());
        }
        employees.add(employee);
        return employee;

    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }



}
