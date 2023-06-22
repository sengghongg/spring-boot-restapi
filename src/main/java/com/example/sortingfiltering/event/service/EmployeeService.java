package com.example.sortingfiltering.event.service;

import com.example.sortingfiltering.event.model.Employee;
import com.example.sortingfiltering.event.model.EmployeePage;
import com.example.sortingfiltering.event.model.EmployeeSearchCriteria;
import com.example.sortingfiltering.event.repository.EmployeeCriteriaRepository;
import com.example.sortingfiltering.event.repository.EmployeeRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final EmployeeCriteriaRepository employeeCriteriaRepository;

    public EmployeeService(EmployeeRepository employeeRepository,
                           EmployeeCriteriaRepository employeeCriteriaRepository) {
        this.employeeRepository = employeeRepository;
        this.employeeCriteriaRepository = employeeCriteriaRepository;
    }

    public Page<Employee> getEmployees(EmployeePage employeePage,
                                       EmployeeSearchCriteria employeeSearchCriteria){
        return (Page<Employee>) employeeCriteriaRepository.findAllWithFilters(employeePage, employeeSearchCriteria);
    }

    public Employee addEmployee(Employee employee){
        return employeeRepository.save(employee);
    }
}

