package com.my.sq.practice.job;

import com.my.sq.practice.entities.Author;
import com.my.sq.practice.entities.Book;
import com.my.sq.practice.service.AuthorDataService;
import com.my.sq.practice.service.BookDataService;
import java.time.LocalDateTime;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@EnableScheduling
@RequiredArgsConstructor
public class IngestData {

  public final BookDataService bookDataService;
  public final AuthorDataService authorDataService;


  @Scheduled(initialDelay = 1000, fixedRate = 600000)
  @Transactional
  public void ingestData() {

    LocalDateTime now = LocalDateTime.now();

    log.info("Job has started at {}", LocalDateTime.now());

    Author author = new Author();
    author.setFirstName("First Name ");
    author.setLastName("Last Name ");
    author.setAddress("30004 GA " + now.getMinute());
    Author persistedAuthor = authorDataService.save(author);
    //save book1
    Book book = new Book();
    book.setTitle("Java");
    book.setIsbn("IBAN " + now.getHour() + now.getMinute() + now.getSecond());
    book.setAuthor(persistedAuthor);
    bookDataService.save(book);
    // save book2
    Book book1 = new Book();
    book1.setTitle("Java");
    book1.setIsbn("IBAN " + now.getHour() + now.getMinute() + now.getSecond());
    book1.setAuthor(persistedAuthor);
    bookDataService.save(book1);


  }

}
