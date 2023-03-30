package com.nagarro.springbootazuresql;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.springbootazuresql.Entity.Employee;
import com.nagarro.springbootazuresql.repo.EmployeeRepo;

@SpringBootApplication
@RestController
public class SpringbootAzuresqlApplication {

	@Autowired
	private EmployeeRepo employeeRepo;

	@PostMapping("/employee")
	private Employee addemployee(@RequestBody Employee employee) {
		return employeeRepo.save(employee);
	}

	@GetMapping("/employees")
	private List<Employee> allemployees() {
		return employeeRepo.findAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzuresqlApplication.class, args);
	}

}
