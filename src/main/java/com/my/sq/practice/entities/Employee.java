package com.my.sq.practice.entities;

import javax.persistence.Entity;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@ToString(callSuper = true)
public class Employee extends Person {

    private String company;
}