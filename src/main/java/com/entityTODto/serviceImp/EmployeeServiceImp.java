package com.entityTODto.serviceImp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entityTODto.domains.Employee;
import com.entityTODto.dto.EmployeeDto;
import com.entityTODto.repository.EmployeeReository;
import com.entityTODto.service.EmployeeService;
//import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class EmployeeServiceImp implements EmployeeService {
	
	@Autowired EmployeeReository employeeReository;
	@Autowired ObjectMapper objectmapper;

	public Object createEmployee(EmployeeDto emp) {
		Employee employeeData = objectmapper.convertValue(emp,Employee.class);
		System.out.println(employeeData);
		employeeData.setJobStarted(LocalDateTime.now());
		return employeeReository.save(employeeData);
	}
	
	
}
