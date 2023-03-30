package com.nagarro.springbootazuresql.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.springbootazuresql.Entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
