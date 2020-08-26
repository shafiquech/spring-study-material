package com.my.sq.practice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.Data;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Data
public class Animal {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long animalId;
  private String species;
}