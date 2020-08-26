package com.my.sq.practice.entities;

import javax.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Car extends Vehicle {

  private String model;

}
