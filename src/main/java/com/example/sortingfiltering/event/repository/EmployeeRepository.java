package com.example.sortingfiltering.event.repository;
import com.example.sortingfiltering.event.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
