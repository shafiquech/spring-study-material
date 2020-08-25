package com.my.sq.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AuthorDto {

  String firstName;
  String lastName;
  Integer numberOfBooks;
}