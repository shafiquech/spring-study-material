package com.my.sq.practice.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.my.sq.practice.entities.Employee;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@Slf4j
public class MappedSuperclassTest {

  @Autowired
  private TestEntityManager testEntityManager;
  @Autowired
  private EmployeeService employeeService;

  @Before
  public void setUp() {

    // employee
    Employee employee = new Employee();
    employee.setName("Test Name");
    employee.setCompany("ABC Ltd");
    testEntityManager.persist(employee);
    Employee employee2 = new Employee();
    employee2.setName("Test Name");
    employee2.setCompany("ABC Ltd");
    testEntityManager.persist(employee2);

    testEntityManager.flush();
  }

  @Test
  public void getAllEmployees() {

    List<Employee> employees = employeeService.findAll();
    employees.stream().map(x -> x.toString()).forEach(log::info);
    assertTrue(employees.size() == 2);


  }
}
