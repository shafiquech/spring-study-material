package com.my.sq.practice.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.my.sq.practice.entities.Animal;
import com.my.sq.practice.entities.Car;
import com.my.sq.practice.entities.Pet;
import com.my.sq.practice.entities.Vehicle;
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
public class TableperClassTest {

  @Autowired
  private TestEntityManager testEntityManager;
  @Autowired
  private VehicleService vehicleService;

  @Before
  public void setUp() {

    // Vehicle
    Vehicle vehicle = new Vehicle();
    vehicle.setManufacturer("BMW");
    testEntityManager.persist(vehicle);
    // Car
    Car car = new Car();
    car.setManufacturer("BMW");
    car.setModel("20202");
    testEntityManager.persist(car);


    testEntityManager.flush();
  }

  @Test
  public void getAllVehicles() {

    List<Vehicle> animals = vehicleService.findAll();
    assertTrue(animals.size() == 2);


  }
}
