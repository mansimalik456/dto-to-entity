package com.entityTODto.service;

import org.springframework.stereotype.Service;
import com.entityTODto.dto.EmployeeDto;

@Service
public interface EmployeeService {
	
	Object createEmployee(EmployeeDto emp);
	

}
