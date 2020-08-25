package com.my.sq.practice.entities;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Data
public class Author {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String firstName;
  private String lastName;
  private String address;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
  @Fetch(FetchMode.SUBSELECT) // It will solve n+1 problem and reduced it to 2 Queries
  private List<Book> books;
}
