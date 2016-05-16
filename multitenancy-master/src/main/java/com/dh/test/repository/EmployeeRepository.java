package com.dh.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.dh.test.domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
