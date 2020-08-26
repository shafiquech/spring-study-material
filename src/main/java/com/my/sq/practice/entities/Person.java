package com.my.sq.practice.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Data;

@MappedSuperclass
@Data
public class Person {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long personId;
    private String name;

}