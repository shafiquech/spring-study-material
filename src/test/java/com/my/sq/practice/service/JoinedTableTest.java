package com.my.sq.practice.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.my.sq.practice.entities.Animal;
import com.my.sq.practice.entities.NoteBook;
import com.my.sq.practice.entities.Pen;
import com.my.sq.practice.entities.Pet;
import com.my.sq.practice.entities.Product;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
@Slf4j
public class JoinedTableTest {

  @Autowired
  private TestEntityManager testEntityManager;
  @Autowired
  private AnimalService animalService;

  @Before
  public void setUp() {

    // Animal
    Animal a = new Animal();
    a.setSpecies("Mammal");
    testEntityManager.persist(a);
    // Pet
    Pet pet = new Pet();
    pet.setName("My Cat");
    pet.setSpecies("Cat");
    testEntityManager.persist(pet);


    testEntityManager.flush();
  }

  @Test
  public void getAllAnimals() {

    List<Animal> animals = animalService.findAll();
    assertTrue(animals.size() == 2);


  }
}
