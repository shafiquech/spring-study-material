package com.my.sq.practice.service;

import com.my.sq.practice.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorDataService extends JpaRepository<Author, Long> {

//  Eliminate the duplicates
//  @Query("select distinct a from Author a join fetch a.books")
//  List<Author> findAll();



//  Solved n+1 but return duplicates, get things done in 1 query
//  @Query("select a from Author a join fetch a.books")
//  List<Author> findAll();

}
