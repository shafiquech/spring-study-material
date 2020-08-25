package com.my.sq.practice.service;

import com.my.sq.practice.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDataService extends JpaRepository<Book, Long> {

}
