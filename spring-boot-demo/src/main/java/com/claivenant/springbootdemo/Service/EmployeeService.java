package com.claivenant.springbootdemo.Service;

import com.claivenant.springbootdemo.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);


    List<Employee> getAllEmployees();
}
