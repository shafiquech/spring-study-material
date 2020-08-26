package com.my.sq.practice.service;

import com.my.sq.practice.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleService extends JpaRepository<Vehicle, Long> {

}
