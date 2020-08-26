package com.my.sq.practice.service;

import com.my.sq.practice.entities.NoteBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteBookService extends JpaRepository<NoteBook, Long> {

}
