package com.my.sq.practice.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import lombok.Data;

@Entity
@Data
@PrimaryKeyJoinColumn(name="animalId")
public class Pet extends Animal {
    private String name;
}