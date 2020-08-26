package com.my.sq.practice.controller;

import com.my.sq.practice.dto.AuthorDto;
import com.my.sq.practice.entities.Author;
import com.my.sq.practice.service.AuthorDataService;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@Lazy
@RequestMapping("/v1")
public class AuthorController {

  public final AuthorDataService authorDataService;


  @GetMapping("/authorsInfo")
  public ResponseEntity<List<AuthorDto>> getAllAuthors() {

    List<Author> authors = authorDataService.findAll();

    List<AuthorDto> authorsData = authors.stream().map(x -> {
      AuthorDto authorDto = new AuthorDto(x.getFirstName(), x.getLastName(), x.getBooks().size());
      log.info("Author: {} {} has {} books.", authorDto.getFirstName(), authorDto.getLastName(),
          authorDto.getNumberOfBooks());
      return authorDto;
    }).collect(Collectors.toList());

    return new ResponseEntity<>(authorsData, HttpStatus.OK);

  }

}
