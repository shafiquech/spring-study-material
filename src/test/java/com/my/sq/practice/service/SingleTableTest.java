package com.my.sq.practice.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.my.sq.practice.entities.NoteBook;
import com.my.sq.practice.entities.Pen;
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
public class SingleTableTest {

  @Autowired
  private TestEntityManager testEntityManager;
  @Autowired
  private ProductService productService;

  @Before
  public void setUp() {

    // Product
    Product p = new Product();
    p.setName("master");
    testEntityManager.persist(p);
    // NoteBook
    NoteBook nb = new NoteBook();
    nb.setPublisher("James & Sons");
    nb.setName("Note Book");
    testEntityManager.persist(nb);
    // Pen
    Pen pen = new Pen();
    pen.setName("Pen 1");
    pen.setColor("Red");
    testEntityManager.persist(pen);

    testEntityManager.flush();
  }

  @Test
  public void getAllProducts() {

    List<Product> products = productService.findAll();
    assertTrue(products.size() == 3);


  }
}
