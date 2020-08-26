package com.my.sq.practice.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.Data;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "product_type",
    discriminatorType = DiscriminatorType.INTEGER)
@DiscriminatorValue("0")
@Data
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long productId;
  private String name;

}