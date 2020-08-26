package com.my.sq.practice.service;

import com.my.sq.practice.entities.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalService extends JpaRepository<Animal, Long> {

}
