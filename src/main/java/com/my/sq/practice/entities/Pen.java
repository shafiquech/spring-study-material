package com.my.sq.practice.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("2")
public class Pen extends Product {

  private String color;
}