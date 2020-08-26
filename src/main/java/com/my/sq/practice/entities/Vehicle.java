package com.my.sq.practice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle {

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  private long vehicleId;

  private String manufacturer;

}