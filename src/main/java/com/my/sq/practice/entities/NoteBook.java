package com.my.sq.practice.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import lombok.Data;

@Entity
@Data
@DiscriminatorValue("1")
public class NoteBook extends Product {

  private String publisher;
}
