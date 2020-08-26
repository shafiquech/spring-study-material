package com.my.sq.practice.service;

import com.my.sq.practice.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeService extends JpaRepository<Employee, Long> {

}
