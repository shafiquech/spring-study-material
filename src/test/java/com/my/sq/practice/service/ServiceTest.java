package com.my.sq.practice.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import com.my.sq.practice.entities.Author;
import com.my.sq.practice.entities.Book;
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
public class ServiceTest {

  @Autowired
  private TestEntityManager testEntityManager;
  @Autowired
  private AuthorDataService authorDataService;

  @Before
  public void setUp() {

    // author
    Author author = new Author();
    author.setFirstName("Shafiq");
    author.setLastName("Rahman");
    author.setAddress("3004 GA");
    author = testEntityManager.persist(author);

    Book book1 = new Book();
    book1.setTitle("Java");
    book1.setIsbn("J1234");
    book1.setAuthor(author);
    testEntityManager.persist(book1);
    Book book2 = new Book();
    book2.setTitle("Java");
    book2.setIsbn("J1234");
    book2.setAuthor(author);
    testEntityManager.persist(book2);

    testEntityManager.flush();
  }

  @Test
  public void getAllAuthors() {

    List<Author> authors = authorDataService.findAll();
    assertTrue(authors.size() > 0);

  }
}
