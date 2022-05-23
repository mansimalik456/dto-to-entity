package com.entityTODto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import com.entityTODto.domains.Employee;
import com.entityTODto.dto.EmployeeDto;
import com.entityTODto.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired EmployeeService employeeService;
	
	@PostMapping("/addEmp")
	public ResponseEntity<Object> saveEmployee(@RequestBody EmployeeDto emp){
		Object saveEmployee = employeeService.createEmployee(emp);
		if(saveEmployee.getClass().equals(Employee.class)) {
			return ResponseEntity.ok(saveEmployee);
		}
		return null;
	}

}
