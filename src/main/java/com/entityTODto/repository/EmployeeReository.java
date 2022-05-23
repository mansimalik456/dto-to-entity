package com.entityTODto.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.entityTODto.domains.Employee;

@Repository
public interface EmployeeReository extends MongoRepository<Employee, String>{

}
